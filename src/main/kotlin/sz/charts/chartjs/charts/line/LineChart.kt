package sz.charts.chartjs.charts.line

import sz.charts.chartjs.charts.data.DataObject
import sz.charts.chartjs.general.ChartType

//
// Created by kk on 2019-03-10.
//
class LineChart(var data: DataObject? = null,
                     var options: LineOptions? = null) {
    var type = ChartType.line
}