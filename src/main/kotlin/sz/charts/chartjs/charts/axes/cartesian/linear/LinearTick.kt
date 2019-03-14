package sz.charts.chartjs.charts.axes.cartesian.linear

import sz.charts.chartjs.charts.axes.cartesian.CartesianTick

//
// Created by kk on 2019-03-12.
//

/**
 * ref: https://www.chartjs.org/docs/latest/axes/cartesian/linear.html
 */
class LinearTick(var beginAtZero: Boolean? = null,
                 var min: Number? = null,
                 var max: Number? = null,
                 var maxTicksLimit: Number? = null,
                 var precision: Number? = null,
                 var stepSize: Number? = null,
                 var suggestedMax: Number? = null,
                 var suggestedMin: Number? = null,
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