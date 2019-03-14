package sz.charts.chartjs.general

import com.fasterxml.jackson.annotation.JsonValue

//
// Created by kk on 2019-03-12.
//

class FillObject {

    private var value: Any = true

    @JsonValue
    fun jsonValue(): Any {
        return value
    }

    fun with(v: String): FillObject {
        if (v.matches("""^[+|-][0-9]+$""".toRegex()) || v in setOf("start","end","origin")) {
            value = v
            return this
        } else {
            throw IllegalArgumentException("Invalid fill value. Please ref: https://www.chartjs.org/docs/latest/charts/area.html")
        }
    }

    fun with(v: Int): FillObject {
        if (v < 0) {
            throw IllegalArgumentException("Invalid fill value. Please ref: https://www.chartjs.org/docs/latest/charts/area.html")
        }
        value = v
        return this
    }

    fun disable():FillObject{
        value = false
        return this
    }
}