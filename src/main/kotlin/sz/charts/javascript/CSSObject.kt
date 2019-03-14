package sz.charts.javascript

//
// Created by kk on 2019-03-11.
//
class CSSObject {

    private val styles = mutableMapOf<String, Any>()

    fun clear(): CSSObject {
        styles.clear()
        return this
    }

    fun with(styleName: String, styleValue: String): CSSObject {
        styles[styleName] = styleValue
        return this
    }

    fun with(styleName: String, styleValue: Number): CSSObject {
        styles[styleName] = styleValue
        return this
    }
}