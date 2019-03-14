package sz.charts.javascript

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.JsonSerializer
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonSerialize

//
// Created by kk on 2019-03-08.
//

@JsonSerialize(using = JsFunction.JsFunctionJsonSerializer::class)
class JsFunction(var functionBody: String? = null) {

    class JsFunctionJsonSerializer : JsonSerializer<JsFunction>() {
        override fun serialize(value: JsFunction?, gen: JsonGenerator, serializers: SerializerProvider) {
            gen.writeRawValue(value?.functionBody ?: "null")
        }

    }
}

