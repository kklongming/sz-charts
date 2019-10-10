@file:Suppress("PropertyName")

package sz.charts.plotly

import io.vertx.core.json.JsonArray
import io.vertx.core.json.JsonObject

//
// Created by kk on 2019/10/8.
//
class PlotlyChart {

    var cdn = "https://cdn.plot.ly/plotly-latest.min.js"
    var sizeStyle = "width:640px;height:320px;"
    var trace_data = JsonArray()
    var layout = JsonObject()
    var config = JsonObject()
}