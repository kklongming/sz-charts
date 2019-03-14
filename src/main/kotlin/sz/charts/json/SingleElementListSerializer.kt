package sz.charts.json

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.JsonSerializer
import com.fasterxml.jackson.databind.SerializerProvider

//
// Created by kk on 2019-03-12.
//
class SingleElementListSerializer : JsonSerializer<List<*>>() {
    override fun serialize(value: List<*>?, gen: JsonGenerator?, serializers: SerializerProvider?) {
        SingleElementListObjectMapper.instance.writeValue(gen, value)
    }
}