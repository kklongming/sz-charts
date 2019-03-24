package sz.charts.highcharts

import io.vertx.core.json.JsonObject
import org.jtwig.JtwigModel
import org.jtwig.JtwigTemplate
import sz.charts.sizeStyle

//
// Created by kk on 2019-03-23.
//
class Highstock {

    var baseScripts = mutableListOf("https://cdn.highcharts.com.cn/highstock/highstock.js")
    var extraScripts = mutableListOf<String>()
    var modulesScripts = mutableListOf<String>()
    var indicatorsScripts = mutableListOf<String>()
    var plugins = mutableListOf<String>()
    var themeScript = ""
    var themeJsonScript = ""
    var width = "600px"
    var height = "400px"
    var title = "Highstock"
    var options = JsonObject()

    fun renderAsHtml(): String {
        val template = JtwigTemplate.classpathTemplate("templates/highcharts/highstock.twig")
        val model = JtwigModel.newModel()
                .with("baseScripts", baseScripts)
                .with("extraScripts", extraScripts)
                .with("modulesScripts", modulesScripts)
                .with("indicatorsScripts", indicatorsScripts)
                .with("plugins", plugins)
                .with("themeScript", themeScript)
                .with("themeJsonScript", themeJsonScript)
                .with("sizeStyle", sizeStyle(width, height))
                .with("title", title)
                .with("options", options.encodePrettily())

        return template.render(model)
    }
}