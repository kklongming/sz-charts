package sz.charts.chartjs.configuration.tick

import sz.charts.javascript.FalseOrObject

//
// Created by kk on 2019-03-21.
//
class TickOptions : NestedTickOptions() {
    var minor: FalseOrObject<NestedTickOptions>? = null
    var major: FalseOrObject<NestedTickOptions>? = null
}