package sz.charts.chartjs.charts.axes.cartesian.time

import sz.charts.chartjs.charts.axes.cartesian.CartesianTick

//
// Created by kk on 2019-03-12.
//

/**
 * ref: https://www.chartjs.org/docs/latest/axes/cartesian/time.html#configuration-options
 */
class TimeTick(
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