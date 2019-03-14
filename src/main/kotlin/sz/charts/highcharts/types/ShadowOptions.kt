package sz.charts.highcharts.types

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.JsonSerializer
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import sz.charts.json.prettyJson
import sz.charts.javascript.Color

//
// Created by kk on 2019-03-11.
//
class ShadowOptionsObject(var color: Color? = null,
                               var offsetX: Number? = null,
                               var offsetY: Number? = null,
                               var opacity: Number? = null,
                               var width: Number? = null)

@JsonSerialize(using = ShadowOptions.ShadowOptionsJsonSerializer::class)
class ShadowOptions {
    private var optionsObj: ShadowOptionsObject? = null

    fun with(optionsObject: ShadowOptionsObject): ShadowOptions {
        optionsObj = optionsObject
        return this
    }

    private fun jsonValue(): String {
        return if (optionsObj == null) {
            "false"
        } else {
            this.prettyJson()
        }
    }

    class ShadowOptionsJsonSerializer : JsonSerializer<ShadowOptions>() {
        override fun serialize(value: ShadowOptions?, gen: JsonGenerator, serializers: SerializerProvider?) {
            gen.writeRawValue(value?.jsonValue() ?: "null")
        }

    }
}