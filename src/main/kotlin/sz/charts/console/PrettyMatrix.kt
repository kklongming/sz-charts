package sz.charts.console

import jodd.util.Format

//
// Created by kk on 2019-02-18.
//
class PrettyMatrix(val matrix: Array<Array<Number>>) {

    val rowCount = matrix.size

    val columnCount = matrix.first().size


    fun prettyTxt(): String {
        val intervalWidth = 2
        val martixTxt = Array(rowCount) { rowIndex ->
            matrix[rowIndex].map { number ->
                var str = number.toString()
                if (str.startsWith("-").not()) {
                   str = " $str"
                }

                str
            }
        }

        val maxLen = martixTxt.flatMap { it.toList() }.map { it.length }.max()!!

        val header = "┌${" ".repeat(maxLen * columnCount + 2 + (columnCount - 1) * intervalWidth)}┐"
        val footer = "└${" ".repeat(maxLen * columnCount + 2 + (columnCount - 1) * intervalWidth)}┘"

        val sb = StringBuilder()
        sb.appendln(header)

        martixTxt.forEach { row ->
            val separator = " ".repeat(intervalWidth)
            val line = "│ ${row.joinToString(separator) { Format.alignLeftAndPad(it, maxLen) }} │"
            sb.appendln(line)
        }

        sb.appendln(footer)

        return sb.toString()
    }
}
