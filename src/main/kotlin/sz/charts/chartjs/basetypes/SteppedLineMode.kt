package sz.charts.chartjs.basetypes

import com.fasterxml.jackson.annotation.JsonValue

//
// Created by kk on 2019-03-12.
//
enum class SteppedLineMode {
    False,
    True,
    before,
    after;

    @JsonValue
    fun jsonValue(): Any {
        return when (this) {
            False -> false
            True -> true
            else -> this.name
        }
    }
}