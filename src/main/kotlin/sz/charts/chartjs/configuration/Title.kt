package sz.charts.chartjs.configuration

import sz.charts.chartjs.general.FontStyle
import sz.charts.chartjs.general.Position
import sz.charts.javascript.Color

//
// Created by kk on 2019-03-09.
//

class Title(var display: Boolean? = null,
            var position: Position? = null,
            var fontSize: Number? = null,
            var fontFamily: String? = null,
            var fontColor: Color? = null,
            var fontStyle: FontStyle? = null,
            var padding: Number? = null,
            var lineHeight: Number? = null,
            var text: List<String>? = null)