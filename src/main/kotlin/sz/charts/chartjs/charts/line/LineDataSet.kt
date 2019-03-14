package sz.charts.chartjs.charts.line

import sz.charts.chartjs.charts.data.DataObject
import sz.charts.chartjs.configuration.PointStyle
import sz.charts.chartjs.general.FillObject
import sz.charts.chartjs.general.SteppedLineMode
import sz.charts.javascript.Color
import sz.charts.javascript.LineCapStyle
import sz.charts.javascript.LineJoinStyle
import sz.charts.json.BadgerFishList

//
// Created by kk on 2019-03-12.
//
class LineDataSet(var data: DataObject? = null,
                  var label: String? = null,
                  var xAxisID: String? = null,
                  var yAxisID: String? = null,
                  var backgroundColor: Color? = null,
                  var borderColor: Color? = null,
                  var borderWidth: Number? = null,
                  var borderDash: List<Number>? = null,
                  var borderDashOffset: Number? = null,
                  var borderCapStyle: LineCapStyle? = null,
                  var borderJoinStyle: LineJoinStyle? = null,
                  var cubicInterpolationMode: CubicInterpolationMode? = null,
                  var fill: FillObject? = null,
                  var lineTension: Number? = null,

                  var pointBackgroundColor: BadgerFishList<Color>? = null,
                  var pointBorderColor: BadgerFishList<Color>? = null,
                  var pointBorderWidth: BadgerFishList<Number>? = null,
                  var pointRadius: BadgerFishList<Number>? = null,
                  var pointStyle: BadgerFishList<PointStyle>? = null,
                  var pointRotation: BadgerFishList<Number>? = null,
                  var pointHitRadius: BadgerFishList<Number>? = null,
                  var pointHoverBackgroundColor: BadgerFishList<Color>? = null,
                  var pointHoverBorderColor: BadgerFishList<Color>? = null,
                  var pointHoverBorderWidth: BadgerFishList<Number>? = null,
                  var pointHoverRadius: BadgerFishList<Number>? = null,

                  var showLine: Boolean? = null,
                  var spanGaps: Any? = null,
                  var steppedLine: SteppedLineMode? = null
)

enum class CubicInterpolationMode {
    default,
    monotone
}