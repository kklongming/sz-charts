package sz.charts.javascript

import com.fasterxml.jackson.annotation.JsonValue

//
// Created by kk on 2019-03-21.
//
class StringOrObject<T> {

    private var value: Any? = null

    fun value(obj: T): StringOrObject<T> {
        value = obj
        return this
    }

    fun value(obj: String): StringOrObject<T> {
        value = obj
        return this
    }

    @JsonValue
    fun jsonValue(): Any? {
        return value
    }
}