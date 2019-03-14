package sz.charts.highcharts.accessibility

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.JsonSerializer
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import sz.charts.javascript.CSSObject
import sz.charts.javascript.JsFunction

//
// Created by kk on 2019-03-11.
//

/**
 * ref: https://api.highcharts.com.cn/highcharts#accessibility
 */
class Accessibility(
        var describeSingleSeries: Boolean? = null,
        var enabled: Boolean? = null,
        var keyboardNavigation: KeyboardNavigation? = null,
        var onTableAnchorClick: JsFunction? = null,
        var pointDateFormat: String? = null,
        var pointDateFormatter: JsFunction? = null,
        var pointDescriptionFormatter: JsFunction? = null,
        var pointDescriptionThreshold: PointDescriptionThreshold? = null,
        var screenReaderSectionFormatter: JsFunction? = null,
        var seriesDescriptionFormatter: JsFunction? = null
)

/**
 * ref: https://api.highcharts.com.cn/highcharts#accessibility.keyboardNavigation
 */
class KeyboardNavigation(
        // Enable keyboard navigation for the chart.Defaults to true
        var enabled: Boolean? = null,
        // Options for the focus border drawn around elements while navigating through them.
        var focusBorder: FocusBorder? = null,

        var mode: KeyboardNavigationMode? = null,

        var skipNullPoints: Boolean? = null
)

enum class KeyboardNavigationMode {
    normal,
    serialize
}

/**
 * ref: https://api.highcharts.com.cn/en/highcharts/accessibility.keyboardNavigation.focusBorder
 */
class FocusBorder(
        // Enable/disable focus border for chart. Defaults to true.
        var enabled: Boolean? = null,
        // Hide the browser's default focus indicator. Defaults to true.
        var hideBrowserFocusOutline: Boolean? = null,
        // Focus border margin around the elements. Defaults to 2.
        var margin: Number? = null,
        // Style options for the focus border drawn around elements while navigating through them.
        // Note that some browsers in addition draw their own borders for focused elements. These automatic borders can not be styled by Highcharts.
        // Defaults to {"color": "#335cad", "lineWidth": 2, "borderRadius": 3}.
        var style: CSSObject? = null
)

@JsonSerialize(using = PointDescriptionThreshold.PointDescriptionThresholdJsonSerializer::class)
class PointDescriptionThreshold {

    private var value: Number? = null

    fun disable(): PointDescriptionThreshold {
        value = null
        return this
    }

    fun with(threshold: Number): PointDescriptionThreshold {
        value = threshold
        return this
    }

    private fun jsonValue(): String {
        return if (value == null) {
            "false"
        } else {
            value.toString()
        }
    }

    class PointDescriptionThresholdJsonSerializer : JsonSerializer<PointDescriptionThreshold>() {
        override fun serialize(value: PointDescriptionThreshold?, gen: JsonGenerator, serializers: SerializerProvider?) {
            gen.writeRawValue(value?.jsonValue() ?: "null")
        }

    }
}