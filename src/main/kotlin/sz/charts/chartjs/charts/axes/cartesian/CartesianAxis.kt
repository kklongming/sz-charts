package sz.charts.chartjs.charts.axes.cartesian

import sz.charts.chartjs.charts.axes.Axis
import sz.charts.chartjs.charts.styling.GridLine
import sz.charts.chartjs.general.Position
import sz.charts.chartjs.general.ScaleTitle

//
// Created by kk on 2019-03-12.
//

/**
 * ref: https://www.chartjs.org/docs/latest/axes/cartesian/
 */
open class CartesianAxis(var type: String? = null,
                         var position: Position? = null,
                         var offset: Boolean? = null,
                         var id: String? = null,
                         var gridLines: GridLine? = null,
                         var scaleLabel: ScaleTitle? = null,
                         var ticks: CartesianTick? = null) : Axis() {
}