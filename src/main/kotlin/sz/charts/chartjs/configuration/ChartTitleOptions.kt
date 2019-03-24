package sz.charts.chartjs.configuration

import sz.charts.chartjs.basetypes.FontStyle
import sz.charts.chartjs.basetypes.PositionType
import sz.charts.javascript.Color

//
// Created by kk on 2019-03-09.
//

class ChartTitleOptions(var display: Boolean? = null,
                        var position: PositionType? = null,
                        var fullWidth: Boolean? = null,
                        var fontSize: Number? = null,
                        var fontFamily: String? = null,
                        var fontColor: Color? = null,
                        var fontStyle: FontStyle? = null,
                        var padding: Number? = null,
                        var text: List<String>? = null)