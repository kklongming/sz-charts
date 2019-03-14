package sz.charts.chartjs.configuration

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.JsonSerializer
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import sz.charts.javascript.Color
import sz.charts.javascript.LineCapStyle
import sz.charts.javascript.LineJoinStyle

//
// Created by kk on 2019-03-09.
//

class Elements(var point: Point? = null,
                    var line: Line? = null,
                    var rectangle: Rectangle? = null,
                    var arc: Arc? = null)

class Point(var radius: Number? = null,
                 var pointStyle: PointStyle? = null,
                 var rotation: Number? = null,
                 var backgroundColor: Color? = null,
                 var borderWidth: Number? = null,
                 var borderColor: Color? = null,
                 var hitRadius: Number? = null,
                 var hoverRadius: Number? = null,
                 var hoverBorderWidth: Number? = null)

enum class PointStyle {
    circle,
    cross,
    crossRot,
    dash,
    line,
    rect,
    rectRounded,
    rectRot,
    star,
    triangle
}

@JsonSerialize(using = LineFill.LineJsonSerializer::class)
enum class LineFill {
    zero,
    top,
    bottom,
    True,
    False;

    private fun jsonValue(): String {
        return when (this) {
            True -> "true"
            False -> "false"
            else -> "'${this.name}'"
        }

    }

    class LineJsonSerializer : JsonSerializer<LineFill>() {
        override fun serialize(value: LineFill?, gen: JsonGenerator, serializers: SerializerProvider?) {
            gen.writeRawValue(value?.jsonValue() ?: "null")
        }

    }
}

class Line(var tension: Number? = null,
                var backgroundColor: Color? = null,
                var borderWidth: Number? = null,
                var borderColor: Color? = null,
                var borderCapStyle: LineCapStyle? = null,
                var borderDash: List<Number>? = null,
                var borderDashOffset: Number? = null,
                var borderJoinStyle: LineJoinStyle? = null,
                var capBezierPoints: Boolean? = null,
                var fill: LineFill? = null,
                var stepped: Boolean? = null)

enum class BorderSkipped {
    bottom, left, top, right
}

class Rectangle(var backgroundColor: Color? = null,
                     var borderWidth: Number? = null,
                     var borderColor: Color? = null,
                     var borderSkipped: BorderSkipped? = null)

class Arc(var backgroundColor: Color? = null,
               var borderColor: Color? = null,
               var borderWidth: Number? = null)