package sz.charts.javascript

import com.fasterxml.jackson.annotation.JsonValue

//
// Created by kk on 2019-03-21.
//
class NumberOrObject<T> {

    private var value: Any? = null

    fun value(obj: T): NumberOrObject<T> {
        value = obj
        return this
    }

    fun value(obj: Number): NumberOrObject<T> {
        value = obj
        return this
    }

    @JsonValue
    fun jsonValue(): Any? {
        return value
    }
}