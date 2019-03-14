package sz.charts.chartjs.charts.axes

import sz.charts.javascript.JsFunction

//
// Created by kk on 2019-03-12.
//

/**
 * ref: https://www.chartjs.org/docs/latest/axes/
 */
class AxesCallbacks(var beforeUpdate: JsFunction? = null,
                    var beforeSetDimensions: JsFunction? = null,
                    var afterSetDimensions: JsFunction? = null,
                    var beforeDataLimits: JsFunction? = null,
                    var afterDataLimits: JsFunction? = null,
                    var beforeBuildTicks: JsFunction? = null,
                    var afterBuildTicks: JsFunction? = null,
                    var beforeTickToLabelConversion: JsFunction? = null,
                    var afterTickToLabelConversion: JsFunction? = null,
                    var beforeCalculateTickRotation: JsFunction? = null,
                    var afterCalculateTickRotation: JsFunction? = null,
                    var beforeFit: JsFunction? = null,
                    var afterFit: JsFunction? = null,
                    var afterUpdate: JsFunction? = null) {
}