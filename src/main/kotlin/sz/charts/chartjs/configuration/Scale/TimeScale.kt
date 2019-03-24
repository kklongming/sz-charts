package sz.charts.chartjs.configuration.Scale

import sz.charts.chartjs.basetypes.TimeDisplayFormat
import sz.charts.chartjs.basetypes.TimeUnit
import sz.charts.javascript.JsFunction
import sz.charts.javascript.StringOrObject

//
// Created by kk on 2019-03-21.
//
class TimeScale : ChartScales() {
    var displayFormats: TimeDisplayFormat? = null
    var isoWeekday: Boolean? = null
    var max: String? = null
    var min: String? = null
    var parser: StringOrObject<JsFunction>? = null
    var round: TimeUnit? = null
    var tooltipFormat: String? = null
    var unit: TimeUnit? = null
    var unitStepSize: Number? = null
    var stepSize: Number? = null
    var minUnit: TimeUnit? = null
}