package sz.charts.chartjs.basetypes

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.JsonSerializer
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonSerialize

//
// Created by kk on 2019-03-21.
//

@JsonSerialize(using = LineFillMode.LineJsonSerializer::class)
enum class LineFillMode {
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

    class LineJsonSerializer : JsonSerializer<LineFillMode>() {
        override fun serialize(value: LineFillMode?, gen: JsonGenerator, serializers: SerializerProvider?) {
            gen.writeRawValue(value?.jsonValue() ?: "null")
        }

    }
}