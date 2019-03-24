package sz.charts.chartjs.basetypes

import sz.charts.javascript.Color
import sz.charts.javascript.JsFunction

//
// Created by kk on 2019-03-12.
//

/**
 * ref: https://www.chartjs.org/docs/latest/axes/styling.html#minor-tick-configuration
 */
class MinorTick(var callback: JsFunction? = null,
                var fontColor: Color? = null,
                var fontFamily: String? = null,
                var fontSize: Number? = null,
                var fontStyle: FontStyle? = null,
                var lineHeight: Number? = null)