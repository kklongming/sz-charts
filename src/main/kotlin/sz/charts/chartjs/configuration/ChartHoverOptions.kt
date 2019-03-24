package sz.charts.chartjs.configuration

import sz.charts.chartjs.basetypes.InteractionMode
import sz.charts.javascript.JsFunction

//
// Created by kk on 2019-03-10.
//

class ChartHoverOptions(var mode: InteractionMode? = null,
                        var animationDuration: Number? = null,
                        var intersect: Boolean? = null,
                        var onHover: JsFunction? = null
)

