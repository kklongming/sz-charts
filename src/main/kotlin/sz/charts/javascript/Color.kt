package sz.charts.javascript

import com.fasterxml.jackson.annotation.JsonValue

//
// Created by kk on 2019-03-09.
//

abstract class Color {

    companion object {

        val TRANSPARENT = RgbaColor(0, 0, 0, 0.0)
        val BLACK = RgbaColor(0, 0, 0)
        val WHITE = RgbaColor(255, 255, 255)
        val RED = RgbaColor(255, 0, 0)
        val LIME = RgbaColor(0, 255, 0)
        val BLUE = RgbaColor(0, 0, 255)
        val YELLOW = RgbaColor(255, 255, 0)
        val CYAN = RgbaColor(0, 255, 255)
        val MAGENTA = RgbaColor(255, 0, 255)
        val SILVER = RgbaColor(192, 192, 192)
        val GRAY = RgbaColor(128, 128, 128)
        val MAROON = RgbaColor(128, 0, 0)
        val OLIVE = RgbaColor(128, 128, 0)
        val GREEN = RgbaColor(0, 128, 0)
        val PURPLE = RgbaColor(128, 0, 128)
        val TEAL = RgbaColor(0, 128, 128)
        val NAVY = RgbaColor(0, 0, 128)
        val DARK_RED = RgbaColor(139, 0, 0)
        val BROWN = RgbaColor(165, 42, 42)
        val CRIMSON = RgbaColor(220, 20, 60)
        val DARK_SALMON = RgbaColor(233, 150, 122)
        val SALMON = RgbaColor(250, 128, 114)
        val LIGHT_SALMON = RgbaColor(255, 160, 122)
        val ORANGE_RED = RgbaColor(255, 69, 0)
        val DARK_ORANGE = RgbaColor(255, 140, 0)
        val ORANGE = RgbaColor(255, 165, 0)
        val GOLD = RgbaColor(255, 215, 0)
        val DARK_KHAKI = RgbaColor(189, 183, 107)
        val KHAKI = RgbaColor(240, 230, 140)
        val YELLOW_GREEN = RgbaColor(154, 205, 50)
        val DARK_OLIVE_GREEN = RgbaColor(85, 107, 47)
        val GREEN_YELLOW = RgbaColor(173, 255, 47)
        val DARK_GREEN = RgbaColor(0, 100, 0)
        val DARK_CYAN = RgbaColor(0, 139, 139)
        val LIGHT_CYAN = RgbaColor(224, 255, 255)
        val AQUA = RgbaColor(0, 255, 255)
        val DARK_TURQUOISE = RgbaColor(0, 206, 209)
        val TURQUOISE = RgbaColor(64, 224, 208)
        val MEDIUM_TURQUOISE = RgbaColor(72, 209, 204)
        val PALE_TURQUOISE = RgbaColor(175, 238, 238)
        val AQUA_MARINE = RgbaColor(127, 255, 212)
        val LIGHT_BLUE = RgbaColor(173, 216, 230)
        val SKY_BLUE = RgbaColor(135, 206, 235)
        val LIGHT_SKY_BLUE = RgbaColor(135, 206, 250)
        val MIDNIGHT_BLUE = RgbaColor(25, 25, 112)
        val DARK_BLUE = RgbaColor(0, 0, 139)
        val MEDIUM_BLUE = RgbaColor(0, 0, 205)
        val BLUE_VIOLET = RgbaColor(138, 43, 226)
        val VIOLET = RgbaColor(238, 130, 238)
        val DEEP_PINK = RgbaColor(255, 20, 147)
        val HOT_PINK = RgbaColor(255, 105, 180)
        val LIGHT_PINK = RgbaColor(255, 182, 193)
        val PINK = RgbaColor(255, 192, 203)
        val LIGHT_YELLOW = RgbaColor(255, 255, 224)
        val CHOCOLATE = RgbaColor(210, 105, 30)
        val TAN = RgbaColor(210, 180, 140)
        val LINEN = RgbaColor(250, 240, 230)
        val LAVENDER = RgbaColor(230, 230, 250)
        val AZURE = RgbaColor(240, 255, 255)
        val DIM_GRAY = RgbaColor(105, 105, 105)
        val DARK_GRAY = RgbaColor(169, 169, 169)
        val LIGHT_GRAY = RgbaColor(211, 211, 211)

        fun rgbaColor(r: Int, g: Int, b: Int, a: Double = 1.0): RgbaColor {
            return RgbaColor(r, g, b, a)
        }

        fun hexColor(colorStr: String): HexColor {
            return HexColor(colorStr)
        }
    }
}

class RgbaColor(val R: Int, val G: Int, val B: Int, var Alpha: Double = 1.0) : Color() {

    init {
        checkColorBounds(R)
        checkColorBounds(G)
        checkColorBounds(B)
        checkAlphaBounds(Alpha)
    }

    private fun checkColorBounds(channelValue: Int) {
        if (channelValue < 0 || channelValue > 255) {
            throw IllegalArgumentException("color channel value should be a integer in [0, 255].")
        }
    }

    private fun checkAlphaBounds(alpha: Double) {
        if (alpha < 0.0 || alpha > 1.0) {
            throw IllegalArgumentException("color Alpha value should be a double in [0, 1].")
        }
    }

    @JsonValue
    fun jsonValue(): String {
        return if (Alpha != 1.0) {
            "rgba($R, $G, $B, ${String.format("%.3f", Alpha)})"
        } else {
            "rgb($R, $G, $B)"
        }

    }

    fun alpha(value: Double): RgbaColor {
        checkAlphaBounds(value)
        Alpha = value
        return this
    }
}

class HexColor(val hexColor: String) : Color() {

    init {
        checkHexColorStr(hexColor)
    }

    private fun checkHexColorStr(hexColor: String) {
        if (hexColor.matches("^#[0-9a-fA-F]{6}$".toRegex()).not() && hexColor.matches("^#[0-9a-fA-F]{3}$".toRegex()).not()) {
            throw IllegalArgumentException("""Invalid hex color format: $hexColor.""")
        }
    }

    @JsonValue
    fun jsonValue(): String {
        return hexColor
    }
}