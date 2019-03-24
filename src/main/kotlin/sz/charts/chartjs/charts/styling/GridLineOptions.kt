package sz.charts.chartjs.charts.styling

import sz.charts.javascript.Color
import sz.charts.json.BadgerFishList

//
// Created by kk on 2019-03-12.
//

/**
 * ref: https://www.chartjs.org/docs/latest/axes/styling.html#grid-line-configuration
 */
class GridLineOptions(var display: Boolean? = null,
                      var circular: Boolean? = null,
                      var color: BadgerFishList<Color>? = null,
                      var borderDash: List<Number>? = null,
                      var borderDashOffset: Number? = null,
                      var lineWidth: BadgerFishList<Number>? = null,
                      var drawBorder: Boolean? = null,
                      var drawOnChartArea: Boolean? = null,
                      var drawTicks: Boolean? = null,
                      var tickMarkLength: Number? = null,
                      var zeroLineWidth: Number? = null,
                      var zeroLineColor: Color? = null,
                      var zeroLineBorderDash: List<Number>? = null,
                      var zeroLineBorderDashOffset: Number? = null,
                      var offsetGridLines: Boolean? = null) {
}