package sz.charts.chartjs.configuration.tick

import sz.charts.chartjs.basetypes.FontStyle
import sz.charts.chartjs.basetypes.MajorTick
import sz.charts.chartjs.basetypes.MinorTick
import sz.charts.chartjs.basetypes.TickSourceMode
import sz.charts.javascript.Color
import sz.charts.javascript.JsFunction

//
// Created by kk on 2019-03-12.
//

open class NestedTickOptions(var autoSkip: Boolean? = null,
                        var autoSkipPadding: Number? = null,
                        var backdropColor: Color? = null,
                        var backdropPaddingX: Number? = null,
                        var backdropPaddingY: Number? = null,
                        var beginAtZero: Boolean? = null,
                        var callback: JsFunction? = null,
                        var display: Boolean? = null,
                        var fontColor: Color? = null,
                        var fontFamily: String? = null,
                        var fontSize: Number? = null,
                        var fontStyle: FontStyle? = null,
                        var labelOffset: Number? = null,
                        var lineHeight: Number? = null,
                        var max: Any? = null,
                        var maxRotation: Number? = null,
                        var maxTicksLimit: Number? = null,
                        var min: Any? = null,
                        var minRotation: Number? = null,
                        var mirror: Boolean? = null,
                        var padding: Number? = null,
                        var reverse: Boolean? = null,
                        var showLabelBackdrop: Boolean? = null,
                        var source: TickSourceMode? = null,
                        var stepSize: Number? = null,
                        var suggestedMax: Number? = null,
                        var suggestedMin: Number? = null)