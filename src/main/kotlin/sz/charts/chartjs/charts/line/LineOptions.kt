package sz.charts.chartjs.charts.line

import sz.charts.chartjs.configuration.*
import sz.charts.chartjs.general.EventType
import sz.charts.chartjs.general.FontStyle
import sz.charts.chartjs.general.Interactions
import sz.charts.chartjs.general.Options
import sz.charts.javascript.Color
import sz.charts.javascript.JsFunction

//
// Created by kk on 2019-03-11.
//
class LineOptions(var showLines: Boolean? = null,
                  var spanGaps: Boolean? = null,
                  responsive: Boolean? = null,
                  responsiveAnimationDuration: Number? = null,
                  maintainAspectRatio: Boolean? = null,
                  aspectRatio: Number? = null,
                  onResize: JsFunction? = null,

                  events: List<EventType>? = null,
                  onHover: JsFunction? = null,
                  onClick: JsFunction? = null,

                  title: Title? = null,
                  legend: Legend? = null,
                  tooltips: Tooltip? = null,
                  animation: Animation? = null,
                  hover: Interactions? = null,
                  layout: Layout? = null,

                  devicePixelRatio: Number? = null,
                  elements: Elements? = null,
                  defaultColor: Color? = null,

                  defaultFontColor: Color? = null,
                  defaultFontFamily: String? = null,
                  defaultFontSize: Number? = null,
                  defaultFontStyle: FontStyle? = null) : Options(
                                                                responsive,
                                                                responsiveAnimationDuration,
                                                                maintainAspectRatio,
                                                                aspectRatio,
                                                                onResize,
                                                                events,
                                                                onHover,
                                                                onClick,
                                                                title,
                                                                legend,
                                                                tooltips,
                                                                animation,
                                                                hover,
                                                                layout,
                                                                devicePixelRatio,
                                                                elements,
                                                                defaultColor,
                                                                defaultFontColor,
                                                                defaultFontFamily,
                                                                defaultFontSize,
                                                                defaultFontStyle)