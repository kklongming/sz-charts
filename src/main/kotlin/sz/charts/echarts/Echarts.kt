package sz.charts.echarts

import io.vertx.core.json.JsonObject
import org.jtwig.JtwigModel
import org.jtwig.JtwigTemplate
import sz.charts.sizeStyle

//
// Created by kk on 2019-03-22.
//
object Echarts {

    var echartsScripts = listOf(
            "https://echarts.baidu.com/dist/echarts.min.js",
            "https://echarts.baidu.com/asset/theme/vintage.js",
            "https://echarts.baidu.com/asset/theme/dark.js",
            "https://echarts.baidu.com/asset/theme/macarons.js",
            "https://echarts.baidu.com/asset/theme/infographic.js",
            "https://echarts.baidu.com/asset/theme/shine.js",
            "https://echarts.baidu.com/asset/theme/roma.js"
    )

    fun renderAsHtml(options: JsonObject,
                     width: String = "800px",
                     height: String = "600px",
                     title: String = "show by Echarts",
                     theme: Echartstheme = Echartstheme.default): String {
        val template = JtwigTemplate.classpathTemplate("templates/echarts/echarts.twig")
        val model = JtwigModel.newModel()
                .with("echartsScripts", echartsScripts)
                .with("title", title)
                .with("sizeStyle", sizeStyle(width, height))
                .with("options", options.encodePrettily())
                .with("theme", theme.name)

        return template.render(model)
    }
}

enum class Echartstheme {
    default, light, vintage, dark, macarons, infographic, shine, roma
}