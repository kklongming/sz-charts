package sz.charts.chartjs.configuration

import sz.charts.chartjs.general.Position
import sz.charts.javascript.Color
import sz.charts.javascript.JsFunction

//
// Created by kk on 2019-03-09.
//

/**
 * 参考: https://www.chartjs.org/docs/latest/configuration/legend.html
 */
class Legend(var display: Boolean? = null,
             var position: Position? = null,
             var fullWidth: Boolean? = null,
             var onClick: JsFunction? = null,
             var onHover: JsFunction? = null,
             var reverse: Boolean? = null,
             var labels: LegendLabel? = null)

class LegendLabel(var boxWidth: Number? = null,
                       var fontSize: Number? = null,
                       var fontStyle: String? = null,
                       var fontColor: Color? = null,
                       var fontFamily: String? = null,
                       var padding: Number? = null,
                       var generateLabels: JsFunction? = null,
                       var filter: JsFunction? = null,
                       var usePointStyle: Boolean? = null)