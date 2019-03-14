package sz.charts.chartjs.charts.axes.cartesian

//
// Created by kk on 2019-03-12.
//

/**
 * ref: https://www.chartjs.org/docs/latest/axes/cartesian/#tick-configuration
 */
abstract class CartesianTick(var autoSkip: Boolean? = null,
                             var autoSkipPadding: Number? = null,
                             var labelOffset: Number? = null,
                             var maxRotation: Number? = null,
                             var minRotation: Number? = null,
                             var mirror: Boolean? = null,
                             var padding: Number? = null) {
}