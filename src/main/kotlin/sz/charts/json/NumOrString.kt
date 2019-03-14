package sz.charts.json

import com.fasterxml.jackson.annotation.JsonValue

//
// Created by kk on 2019-03-12.
//
class NumOrString() {

    private var value: Any? = null

    constructor(v: String) : this() {
        value = v
    }

    constructor(v: Number) : this() {
        value = v
    }

    fun with(v: String): NumOrString {
        value = v
        return this
    }

    fun with(v: Number): NumOrString {
        value = v
        return this
    }

    @JsonValue
    fun jsonValue(): Any? {
        return value
    }
}