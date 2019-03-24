package sz.charts

import jodd.crypt.DigestEngine
import jodd.io.FileNameUtil
import jodd.io.FileUtil
import jodd.system.SystemInfo
import jodd.util.CommandLine

//
// Created by kk on 2019-03-21.
//

fun preview(chartsHtml: String) {
    val fileName = FileNameUtil.concat(SystemInfo().tempDir, "charts-${DigestEngine.sha1().digestString(chartsHtml)}.html")
    FileUtil.writeString(fileName, chartsHtml)

    println("请用浏览器打开 $fileName")
    if (SystemInfo().isMac || SystemInfo().isMacOsX) {
        val result = CommandLine.cmd("open").args(fileName).run()
        if (result.exitCode != 0) {
            println("exit code: ${result.exitCode}, output:\n${result.output}")
        }
    }
}

internal fun sizeStyle(width: String, height: String): String {
    val style = StringBuilder()
    if (width.isNotBlank()) {
        style.append("width: $width;")
    }
    if (height.isNotBlank()) {
        style.append("height: $height;")
    }

    return style.toString()
}