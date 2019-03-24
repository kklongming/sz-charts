package sz.charts.chartjs

import sz.charts.chartjs.basetypes.ChartType
import sz.charts.chartjs.configuration.ChartOptions

//
// Created by kk on 2019-03-17.
//
class ChartConfiguration(var type: ChartType? = null,
                         var data: ChartData? = null,
                         var options: ChartOptions? = null)