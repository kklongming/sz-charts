package sz.charts.json

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature

//
// Created by kk on 2019-03-12.
//
object SingleElementListObjectMapper {

    val instance = ObjectMapper().enable(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)

}