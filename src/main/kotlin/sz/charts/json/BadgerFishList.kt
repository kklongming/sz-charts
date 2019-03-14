package sz.charts.json

import com.fasterxml.jackson.annotation.JsonValue

//
// Created by kk on 2019-03-12.
//

class BadgerFishList<E>(vararg elements: E) {

    val datas = mutableListOf<E>()

    init {
        datas.addAll(elements)
    }

    @JsonValue
    fun jsonValue(): Any? {
        return if (datas.size == 1) {
            datas.first()
        } else {
            datas
        }
    }
}