package sz.charts.console

import kotlin.math.min

//
// Created by kk on 2019-02-17.
//
class PrettyTable(val defaultColumnLimit: Int = 64) {

    var columnCount = 0
    var rowCount = 0

    private var rows = mutableListOf<List<Any>>()

    private var columns = mutableListOf<Column>()
    private var cells = mutableListOf<Array<Cell>>()
    private var headers = mutableListOf<Pair<String, Int>>()

    fun addHeaders(vararg headers: Pair<String, Int>): PrettyTable {
        this.headers.addAll(headers)
        return this
    }

    fun addRow(vararg columnTxtList: Any): PrettyTable {
        if (columnCount < columnTxtList.size) {
            columnCount = columnTxtList.size
        }

        this.rows.add(columnTxtList.asList())
        rowCount++

        return this
    }

    fun prettyTxt(): String {
        if (headers.size > 0) {
            if (columnCount < headers.size) {
                columnCount = headers.size
            }
            this.rows.add(0, headers.map { it.first })
        }

        process()
        val output = StringBuilder()
        val ruleLine = ruleLine()

        output.appendln(ruleLine)

        var rowIndex = 0
        cells.forEach { rowCell ->
            if (rowCell.first().rowIndex > rowIndex) {
                output.appendln(ruleLine)
                rowIndex = rowCell.first().rowIndex
            }
            val cellTxtList = rowCell.map { cell -> formateCell(cell) }
            output.append("|").append(cellTxtList.joinToString("|")).appendln("|")
        }

        output.appendln(ruleLine)

        return output.toString()
    }

    private fun ruleLine(): String {

        return "+${columns.map { "-".repeat(it.maxLength + 2) }.joinToString("+")}+"
    }


    private fun process() {
        if (headers.size > 0) {
            if (headers.size > columnCount) {
                columnCount = headers.size
            }

            columns.clear()
            headers.forEach { header ->
                columns.add(Column(header.second))
            }

            ((columnCount - headers.size) downTo 1).forEach { _ ->
                columns.add(Column(defaultColumnLimit))
            }

        } else {
            columns = MutableList(columnCount) { Column(defaultColumnLimit) }
        }

        // 统计更新列宽度
        rows.forEach { row ->
            row.forEachIndexed { rowIndex, any -> columns[rowIndex].updateLength(any.toString().length) }
        }

        rows.forEachIndexed { rowIndex, row ->
            val subRows = splitByMaxLength(row)
            subRows.forEach { subRow ->
                val cellRow = newCellRow(rowIndex)
                for (columnIndex in 0 until columnCount) {
                    val cell = cellRow[columnIndex]
                    if (columnIndex < subRow.size) {
                        cell.content = subRow[columnIndex]
                    } else {
                        cell.content = ""
                    }
                }
            }
        }
    }

    fun splitString(str: String, maxLength: Int): List<String> {
        val result = mutableListOf<String>()
        var startIndex = 0
        var endIndex = min(str.length, maxLength)

        while (startIndex < endIndex) {
            result.add(str.substring(startIndex, endIndex))
            startIndex = endIndex
            endIndex = min(str.length, endIndex + maxLength)
        }

        return result.toList()
    }

    private fun splitByMaxLength(row: List<Any>): List<List<String>> {
        val splitedColumnws = row.mapIndexed { index, any -> splitString(any.toString(), columns[index].maxLength) }
        val newRowCount = splitedColumnws.map { it.size }.max()!!

        val result = mutableListOf<List<String>>()
        for (i in 0 until newRowCount) {
            val newRow = mutableListOf<String>()
            for (c in 0..row.lastIndex) {
                val splits = splitedColumnws[c]
                if (i < splits.size) {
                    newRow.add(splits[i])
                } else {
                    newRow.add("")
                }
            }
            result.add(newRow)
        }

        return result
    }

    private fun newCellRow(rowIndex: Int): Array<Cell> {
        val cellRow = Array(columnCount) { columnIndex -> Cell(rowIndex, columnIndex) }
        cells.add(cellRow)
        return cellRow
    }

    private fun formateCell(cell: Cell): String {
        return " ${cell.content}${" ".repeat(columns[cell.columnIndex].maxLength - cell.content.length)} "
    }

}

internal class Column(val lengthLimit: Int = 64) {
    var maxLength = 0

    fun updateLength(length: Int) {
        if (length > maxLength) {
            maxLength = length
        }

        if (maxLength > lengthLimit) {
            maxLength = lengthLimit
        }
    }
}

internal class Cell(val rowIndex: Int, val columnIndex: Int) {
    var content = ""
}