package sz.charts.chartjs.configuration.elements

import sz.charts.chartjs.basetypes.PointStyle
import sz.charts.javascript.Color

//
// Created by kk on 2019-03-21.
//

class ChartPointOptions(var radius: Number? = null,
                        var pointStyle: PointStyle? = null,
                        var rotation: Number? = null,
                        var backgroundColor: Color? = null,
                        var borderWidth: Number? = null,
                        var borderColor: Color? = null,
                        var hitRadius: Number? = null,
                        var hoverRadius: Number? = null,
                        var hoverBorderWidth: Number? = null)