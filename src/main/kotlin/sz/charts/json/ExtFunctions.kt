package sz.charts.json

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.registerKotlinModule

//
// Created by kk on 2019-03-09.
//

internal object JsonExt {
    val excludeEmptyMapper = ObjectMapper()

    init {
        excludeEmptyMapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY)
        excludeEmptyMapper.registerKotlinModule()
    }
}

fun Any.prettyJson():String {
    return JsonExt.excludeEmptyMapper.writerWithDefaultPrettyPrinter().writeValueAsString(this)
}