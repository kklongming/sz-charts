package sz.charts.chartjs.basetypes

import com.fasterxml.jackson.annotation.JsonValue

//
// Created by kk on 2019-03-09.
//

/**
 * 参考: https://www.chartjs.org/docs/latest/basetypes/interactions/modes.html#interaction-modes
 */
enum class InteractionMode {
    point,
    nearest,
    single,
    label,
    index,
    x_axis,
    dataset,
    x,
    y;

    @JsonValue
    fun jsonValue(): String {
        return if (this == x_axis) {
            "x-axis"
        } else {
            this.name
        }
    }
}