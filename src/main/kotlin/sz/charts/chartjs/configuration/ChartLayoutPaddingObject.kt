package sz.charts.chartjs.configuration

//
// Created by kk on 2019-03-12.
//

class ChartLayoutPaddingObject(var left: Number,
                               var right: Number,
                               var top: Number,
                               var bottom: Number) {

    constructor(number: Number) : this(number, number, number, number)
}