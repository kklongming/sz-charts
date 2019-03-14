package sz.charts.chartjs.charts.axes.cartesian.logarithmic

import sz.charts.chartjs.charts.axes.cartesian.CartesianTick

//
// Created by kk on 2019-03-12.
//

/**
 * ref: https://www.chartjs.org/docs/latest/axes/cartesian/logarithmic.html
 */
class LogarithmicTick(var min: Number? = null,
                      var max: Number? = null,
                      autoSkip: Boolean? = null,
                      autoSkipPadding: Number? = null,
                      labelOffset: Number? = null,
                      maxRotation: Number? = null,
                      minRotation: Number? = null,
                      mirror: Boolean? = null,
                      padding: Number? = null) : CartesianTick(autoSkip,
                                                               autoSkipPadding,
                                                               labelOffset,
                                                               maxRotation,
                                                               minRotation,
                                                               mirror,
                                                               padding) {
}