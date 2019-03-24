package sz.charts.chartjs.basetypes

import sz.charts.chartjs.configuration.ChartLayoutPaddingObject
import sz.charts.javascript.Color
import sz.charts.json.NumOrString

//
// Created by kk on 2019-03-12.
//

/**
 * ref: https://www.chartjs.org/docs/latest/axes/labelling.html#scale-title-configuration
 */
class ScaleTitleOptions(var display: Boolean? = null,
                        var labelString: String? = null,
                        var lineHeight: NumOrString? = null,
                        var fontColor: Color? = null,
                        var fontFamily: String? = null,
                        var fontSize: Number? = null,
                        var fontStyle: FontStyle? = null,
                        var padding: ChartLayoutPaddingObject? = null) {
}