package sz.charts.chartjs

import io.vertx.core.json.JsonObject
import org.jtwig.JtwigModel
import org.jtwig.JtwigTemplate
import sz.charts.sizeStyle

//
// Created by kk on 2019-03-21.
//
object Chartjs {

    var cdn = "https://cdn.bootcss.com/Chart.js/2.7.3/Chart.min.js"

    fun renderAsHtml(config: JsonObject, width: String = "75%", height: String = "", title:String = "show by chartjs") : String {
        val template = JtwigTemplate.classpathTemplate("templates/chartjs/chart.js.twig")
        val model = JtwigModel.newModel()
                .with("cdn", cdn)
                .with("title", title)
                .with("sizeStyle", sizeStyle(width, height))
                .with("config", config.encodePrettily())

        return template.render(model)
    }
}