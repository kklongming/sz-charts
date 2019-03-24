package sz.charts.javascript

import com.fasterxml.jackson.annotation.JsonValue

//
// Created by kk on 2019-03-21.
//
class FalseOrObject<T> {

    private var enabled = true
    private var value: T? = null

    fun disable(): FalseOrObject<T> {
        enabled = false
        return this
    }

    fun Value(obj:T):FalseOrObject<T> {
        enabled = true
        value = obj
        return this
    }

    @JsonValue
    fun jsonValue(): Any? {
        if (enabled) {
            return value
        } else {
            return false
        }
    }
}