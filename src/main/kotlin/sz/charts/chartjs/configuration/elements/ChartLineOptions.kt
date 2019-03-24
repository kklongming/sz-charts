package sz.charts.chartjs.configuration.elements

import sz.charts.chartjs.basetypes.CubicInterpolationMode
import sz.charts.chartjs.basetypes.LineFillMode
import sz.charts.javascript.Color
import sz.charts.javascript.LineCapStyle
import sz.charts.javascript.LineJoinStyle

//
// Created by kk on 2019-03-21.
//

class ChartLineOptions(var cubicInterpolationMode: CubicInterpolationMode? = null,
                       var tension: Number? = null,
                       var backgroundColor: Color? = null,
                       var borderWidth: Number? = null,
                       var borderColor: Color? = null,
                       var borderCapStyle: LineCapStyle? = null,
                       var borderDash: List<Number>? = null,
                       var borderDashOffset: Number? = null,
                       var borderJoinStyle: LineJoinStyle? = null,
                       var capBezierPoints: Boolean? = null,
                       var fill: LineFillMode? = null,
                       var stepped: Boolean? = null)