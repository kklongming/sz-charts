package sz.charts.highcharts.annotations

import com.fasterxml.jackson.annotation.JsonValue
import sz.charts.highcharts.types.*
import sz.charts.javascript.CSSObject
import sz.charts.javascript.Color
import sz.charts.javascript.JsFunction

//
// Created by kk on 2019-03-11.
//

/**
 * ref: https://api.highcharts.com.cn/en/highcharts/annotations.shapeOptions
 */
class Annotation(
        var draggable: DraggableMode? = null,
        var id: String? = null,
        var labelOptions: LabelOptions? = null,
        var labels: List<LabelOptions>?=null
        // // TODO:
)


enum class DraggableMode {
    disabled, x, xy, y;

    @JsonValue
    fun jsonValue(): String {
        if (this.name == "disabled") {
            return ""
        } else {
            return this.name
        }
    }
}

class LabelOptions(
        var align: AlignValue? = null,
        var allowOverlap: Boolean? = null,
        var backgroundColor: Color? = null,
        var borderColor: Color? = null,
        var borderRadius: Number? = null,
        var borderWidth: Number? = null,
        var className: String? = null,
        var crop: Boolean? = null,
        var distance: Number? = null,
        var format: String? = null,
        var formatter: JsFunction? = null,
        var overflow: OverflowValue? = null,
        var padding: Number? = null,
        var shadow: ShadowOptions? = null,
        var shape: ShapeValue? = null,
        var style: CSSObject? = null,
        var text: String? = null,
        var useHTML: Boolean? = null,
        var verticalAlign: VerticalAlignValue? = null,
        var x: Number? = null,
        var y: Number? = null
)