package sz.charts.chartjs.configuration

import sz.charts.chartjs.basetypes.PositionType
import sz.charts.javascript.Color
import sz.charts.javascript.JsFunction

//
// Created by kk on 2019-03-09.
//

/**
 * 参考: https://www.chartjs.org/docs/latest/configuration/legend.html
 */
class ChartLegendOptions(var display: Boolean? = null,
                         var position: PositionType? = null,
                         var fullWidth: Boolean? = null,
                         var onClick: JsFunction? = null,
                         var onHover: JsFunction? = null,
                         var labels: ChartLegendLabelOptions? = null,
                         var reverse: Boolean? = null)

class ChartLegendLabelOptions(var boxWidth: Number? = null,
                              var fontSize: Number? = null,
                              var fontStyle: String? = null,
                              var fontColor: Color? = null,
                              var fontFamily: String? = null,
                              var padding: Number? = null,
                              var generateLabels: JsFunction? = null,
                              var filter: JsFunction? = null,
                              var usePointStyle: Boolean? = null)