package sz.charts.chartjs.configuration

import sz.charts.chartjs.general.FontStyle
import sz.charts.chartjs.general.InteractionModes
import sz.charts.javascript.Color
import sz.charts.javascript.JsFunction

//
// Created by kk on 2019-03-09.
//

/**
 * 参考: https://www.chartjs.org/docs/latest/configuration/tooltip.html
 */
class Tooltip(var enabled: Boolean? = null,
              var custom: JsFunction? = null,
              var mode: InteractionModes? = null,
              var intersect: Boolean? = null,
              var position: PositionModes? = null,
              var callbacks: TooltipCallbacks? = null,
              var itemSort: JsFunction? = null,
              var filter: JsFunction? = null,
              var backgroundColor: Color? = null,
              var titleFontFamily: String? = null,
              var titleFontSize: Number? = null,
              var titleFontStyle: FontStyle? = null,
              var titleFontColor: Color? = null,
              var titleSpacing: Number? = null,
              var titleMarginBottom: Number? = null,
              var bodyFontFamily: String? = null,
              var bodyFontSize: Number? = null,
              var bodyFontStyle: FontStyle? = null,
              var bodySpacing: Number? = null,
              var footerFontFamily: String? = null,
              var footerFontSize: Number? = null,
              var footerFontStyle: FontStyle? = null,
              var footerFontColor: Color? = null,
              var footerSpacing: Number? = null,
              var footerMarginTop: Number? = null,
              var xPadding: Number? = null,
              var yPadding: Number? = null,
              var caretPadding: Number? = null,
              var caretSize: Number? = null,
              var cornerRadius: Number? = null,
              var multiKeyBackground: Color? = null,
              var displayColors: Boolean? = null,
              var borderColor: Color? = null,
              var borderWidth: Number? = null)

/**
 * 参考: https://www.chartjs.org/docs/latest/configuration/tooltip.html#position-modes
 */
enum class PositionModes {
    average,
    nearest
}

/**
 * 参考: https://www.chartjs.org/docs/latest/configuration/tooltip.html#tooltip-callbacks
 */
class TooltipCallbacks(var beforeTitle: JsFunction? = null, // arg: (Array[tooltipItem], data) result: Returns the text to render before the title.
                            var title: JsFunction? = null, // arg: (Array[tooltipItem], data) result: Returns text to render as the title of the tooltip.
                            var afterTitle: JsFunction? = null, // arg: (Array[tooltipItem], data) result: Returns text to render after the title.
                            var beforeBody: JsFunction? = null, // arg: (Array[tooltipItem], data) result: Returns text to render before the body section.
                            var beforeLabel: JsFunction? = null, // ar (:	tooltipItem, data) result: Returns text to render before an individual label. This will be called for each item in the tooltip.
                            var label: JsFunction? = null, // ar (:	tooltipItem, data) result: Returns text to render for an individual item in the tooltip.
                            var labelColor: JsFunction? = null, // ar (:	tooltipItem, chart) result: Returns the colors to render for the tooltip item. more...
                            var labelTextColor: JsFunction? = null, // ar (:	tooltipItem, chart) result: Returns the colors for the text of the label for the tooltip item.
                            var afterLabel: JsFunction? = null, // ar (:	tooltipItem, data) result: Returns text to render after an individual label.
                            var afterBody: JsFunction? = null, // arg: (Array[tooltipItem], data) result: Returns text to render after the body section
                            var beforeFooter: JsFunction? = null, // arg: (Array[tooltipItem], data) result: Returns text to render before the footer section.
                            var footer: JsFunction? = null, // arg: (Array[tooltipItem], data) result: Returns text to render as the footer of the tooltip.
                            var afterFooter: JsFunction? = null) // arg: (Array[tooltipItem], data) result: Text to render after the footer section)