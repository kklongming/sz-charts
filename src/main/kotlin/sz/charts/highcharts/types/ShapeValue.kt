package sz.charts.highcharts.types

import com.fasterxml.jackson.annotation.JsonValue

//
// Created by kk on 2019-03-11.
//
enum class ShapeValue {
    callout, circle, diamond, square, triangle, triangleDown;

    @JsonValue
    fun jsonValue(): String {
        return when (this) {
            triangleDown -> "triangle-down"
            else -> this.name
        }
    }
}