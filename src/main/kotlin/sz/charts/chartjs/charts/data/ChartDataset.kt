package sz.charts.chartjs.charts.data

import sz.charts.chartjs.basetypes.CubicInterpolationMode
import sz.charts.chartjs.basetypes.PositionType
import sz.charts.javascript.Color
import sz.charts.javascript.LineCapStyle
import sz.charts.javascript.LineJoinStyle

//
// Created by kk on 2019-03-18.
//
class ChartDataset(var cubicInterpolationMode: CubicInterpolationMode? = null,
                   var backgroundColor: Color? = null,
                   var borderWidth: Number? = null,
                   var borderColor: Color? = null,
                   var borderCapStyle: LineCapStyle? = null,
                   var borderDash:Number?=null,
                   var borderDashOffset:Number?=null,
                   var borderJoinStyle: LineJoinStyle?=null,
                   var borderSkipped:PositionType?=null)