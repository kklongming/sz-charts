package sz.charts.chartjs.configuration.Scale

import sz.charts.chartjs.charts.styling.GridLineOptions
import sz.charts.chartjs.configuration.tick.NestedTickOptions
import sz.charts.chartjs.basetypes.PositionType
import sz.charts.chartjs.basetypes.ScaleTitleOptions
import sz.charts.chartjs.basetypes.ScaleType
import sz.charts.chartjs.configuration.axe.ChartXAxe
import sz.charts.chartjs.configuration.axe.ChartYAxe
import sz.charts.chartjs.configuration.tick.TickOptions

//
// Created by kk on 2019-03-20.
//
open class ChartScales(var type: ScaleType? = null,
                       var display: Boolean? = null,
                       var position: PositionType? = null,
                       var gridLines: GridLineOptions? = null,
                       var scaleLabel: ScaleTitleOptions? = null,
                       var ticks: TickOptions? = null,
                       var xAxes: List<ChartXAxe>? = null,
                       var yAxes: List<ChartYAxe>? = null
)