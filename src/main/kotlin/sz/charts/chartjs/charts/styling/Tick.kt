package sz.charts.chartjs.charts.styling

import sz.charts.chartjs.general.FontStyle
import sz.charts.chartjs.general.MajorTick
import sz.charts.chartjs.general.MinorTick
import sz.charts.javascript.Color
import sz.charts.javascript.JsFunction

//
// Created by kk on 2019-03-12.
//

/**
 * ref: https://www.chartjs.org/docs/latest/axes/styling.html#tick-configuration
 */
class Tick(var callback: JsFunction? = null,
           var display: Boolean? = null,
           var fontColor: Color? = null,
           var fontFamily: String? = null,
           var fontSize: Number? = null,
           var fontStyle: FontStyle? = null,
           var reverse: Boolean? = null,
           var minor: MinorTick? = null,
           var major: MajorTick? = null) {
}