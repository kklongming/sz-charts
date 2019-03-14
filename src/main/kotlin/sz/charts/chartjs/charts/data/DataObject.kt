package sz.charts.chartjs.charts.data

import com.fasterxml.jackson.annotation.JsonValue

//
// Created by kk on 2019-03-12.
//

abstract class DataObject {

    companion object {

        fun <E> build(dataPoints: Iterable<E>): DataPointArray<E> {
            return DataPointArray<E>().addAll(dataPoints)
        }

        fun numberArray(numbers: Iterable<Number>): DataPointArray<Number> {
            return DataPointArray<Number>().addAll(numbers)
        }

        fun dataPointArray(dataPoints: Iterable<DataPoint<*, *>>): DataPointArray<DataPoint<*, *>> {
            return DataPointArray<DataPoint<*, *>>().addAll(dataPoints)
        }

        fun bubbleDataPoint(dataPoints: Iterable<BubbleDataPoint>): DataPointArray<BubbleDataPoint> {
            return DataPointArray<BubbleDataPoint>().addAll(dataPoints)
        }
    }
}

class DataPoint<XType, YType>(var x: XType,
                              var y: YType)

class BubbleDataPoint(var x: Number,
                      var y: Number,
                      var r: Number? = null)

class DataPointArray<E> : DataObject() {

    var values = mutableListOf<E>()

    fun addAll(dataPoints: Iterable<E>): DataPointArray<E> {
        values.addAll(dataPoints)
        return this
    }

    fun add(dataPoint: E): DataPointArray<E> {
        values.add(dataPoint)
        return this
    }

    fun clear(): DataPointArray<E> {
        values.clear()
        return this
    }

    @JsonValue
    fun jsonValue(): Any {
        return values
    }
}


