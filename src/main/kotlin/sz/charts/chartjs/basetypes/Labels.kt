package sz.charts.chartjs.basetypes

import com.fasterxml.jackson.annotation.JsonValue

//
// Created by kk on 2019-03-17.
//
class Labels() {

    private var labelsData: Any? = null

    constructor(labels: List<String>) : this() {
        labelsData = labels
    }

    constructor(vararg labels: String) : this() {
        labelsData = labels
    }

    constructor(vararg lables: List<String>) : this() {
        labelsData = lables
    }

    @JsonValue
    fun jsonValue(): Any? {
        return labelsData
    }
}