package sz.charts.chartjs.general

import sz.charts.chartjs.configuration.*
import sz.charts.javascript.Color
import sz.charts.javascript.JsFunction

//
// Created by kk on 2019-03-10.
//

/**
 * 参考: https://www.chartjs.org/docs/latest/configuration/elements.html?q=Chart.defaults.global.
 */
open class Options(var responsive: Boolean? = null,
                   var responsiveAnimationDuration: Number? = null,
                   var maintainAspectRatio: Boolean? = null,
                   var aspectRatio: Number? = null,
                   var onResize: JsFunction? = null,

                   var events: List<EventType>? = null,
                   var onHover: JsFunction? = null,
                   var onClick: JsFunction? = null,

                   var title: Title? = null,
                   var legend: Legend? = null,
                   var tooltips: Tooltip? = null,
                   var animation: Animation? = null,
                   var hover: Interactions? = null,
                   var layout: Layout? = null,

                   var devicePixelRatio: Number? = null,
                   var elements: Elements? = null,
                   var defaultColor: Color? = null,

        // default font configuration
                   var defaultFontColor: Color? = null,
                   var defaultFontFamily: String? = null,
                   var defaultFontSize: Number? = null,
                   var defaultFontStyle: FontStyle? = null

)

/*
just for Line chart
                   var showLines: Boolean? = null,
                   var spanGaps: Boolean? = null,

just for Bar chart
                   var barPercentage: Number? = null,
                   var categoryPercentage: Number? = null,
                   var barThickness: Number? = null,
                   var maxBarThickness: Number? = null,
                   var gridLines: GridLines? = null
 */
