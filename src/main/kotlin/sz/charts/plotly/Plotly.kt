package sz.charts.plotly

import org.jtwig.JtwigModel
import org.jtwig.JtwigTemplate

//
// Created by kk on 2019/10/8.
//
object Plotly {

    fun renderAsHtml(chartConfig: PlotlyChart): String {
        val template = JtwigTemplate.classpathTemplate("templates/plotly/plotly_base.twig")
        val model = JtwigModel.newModel()
            .with("cdn", chartConfig.cdn)
            .with("sizeStyle", chartConfig.sizeStyle)
            .with("trace_data", chartConfig.trace_data)
            .with("layout", chartConfig.layout)
            .with("config", chartConfig.config)

        return template.render(model)
    }
}