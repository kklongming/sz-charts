package sz.charts.chartjs.configuration.axe

import sz.charts.chartjs.basetypes.PositionType
import sz.charts.chartjs.basetypes.ScaleTitleOptions
import sz.charts.chartjs.basetypes.ScaleType
import sz.charts.chartjs.basetypes.ThicknessMode
import sz.charts.chartjs.charts.styling.GridLineOptions
import sz.charts.chartjs.configuration.Scale.TimeScale
import sz.charts.chartjs.configuration.tick.TickOptions
import sz.charts.javascript.JsFunction
import sz.charts.javascript.NumberOrObject

//
// Created by kk on 2019-03-21.
//
open class CommonAxe(var bounds: String? = null,
                     var type: ScaleType? = null,
                     var display: Boolean? = null,
                     var id: String? = null,
                     var stacked: Boolean? = null,
                     var position: PositionType? = null,
                     var ticks: TickOptions? = null,
                     var gridLines: GridLineOptions? = null,
                     var barThickness: NumberOrObject<ThicknessMode>? = null,
                     var maxBarThickness: Number? = null,
                     var scaleLabel: ScaleTitleOptions? = null,
                     var time: TimeScale? = null,
                     var offset: Boolean? = null,
                     var beforeUpdate: JsFunction? = null,
                     var beforeSetDimension: JsFunction? = null,
                     var beforeDataLimits: JsFunction? = null,
                     var beforeBuildTicks: JsFunction? = null,
                     var beforeTickToLabelConversion: JsFunction? = null,
                     var beforeCalculateTickRotation: JsFunction? = null,
                     var beforeFit: JsFunction? = null,
                     var afterUpdate: JsFunction? = null,
                     var afterSetDimension: JsFunction? = null,
                     var afterDataLimits: JsFunction? = null,
                     var afterBuildTicks: JsFunction? = null,
                     var afterTickToLabelConversion: JsFunction? = null,
                     var afterCalculateTickRotation: JsFunction? = null,
                     var afterFit: JsFunction? = null)