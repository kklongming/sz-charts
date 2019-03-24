package sz.charts.chartjs.configuration

import sz.charts.chartjs.basetypes.EventType
import sz.charts.chartjs.configuration.Scale.ChartScales
import sz.charts.chartjs.configuration.elements.ChartElementsOptions
import sz.charts.javascript.JsFunction

//
// Created by kk on 2019-03-10.
//

open class ChartOptions(var responsive: Boolean? = null,
                        var responsiveAnimationDuration: Number? = null,
                        var aspectRatio: Number? = null,
                        var maintainAspectRatio: Boolean? = null,
                        var events: List<EventType>? = null,
                        var legendCallback: JsFunction? = null,
                        var onHover: JsFunction? = null,
                        var onClick: JsFunction? = null,
                        var onResize: JsFunction? = null,
                        var title: ChartTitleOptions? = null,
                        var legend: ChartLegendOptions? = null,
                        var tooltips: ChartTooltipOptions? = null,
                        var hover: ChartHoverOptions? = null,
                        var animation: ChartAnimationOptions? = null,
                        var elements: ChartElementsOptions? = null,
                        var layout: ChartLayoutOptions? = null,
                        var scales: ChartScales? = null,
                        var showLines: Boolean? = null,
                        var spanGaps: Boolean? = null,
                        var cutoutPercentage: Number? = null,
                        var circumference: Number? = null,
                        var rotation: Number? = null,
                        var devicePixelRatio: Number? = null,
                        var plugins: Any? = null
)