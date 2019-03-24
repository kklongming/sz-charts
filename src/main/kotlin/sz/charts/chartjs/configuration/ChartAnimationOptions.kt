package sz.charts.chartjs.configuration

import sz.charts.javascript.JsFunction

//
// Created by kk on 2019-03-09.
//

/**
 * 参考: https://www.chartjs.org/docs/latest/configuration/animations.html
 */
class ChartAnimationOptions(var duration: Number? = null,
                            var easing: AnimationEasing? = null,
                            var onProgress: JsFunction? = null,
                            var onComplete: JsFunction? = null,
                            var animateRotate: Boolean? = null,
                            var animateScale: Boolean? = null)

enum class AnimationEasing {
    linear,
    easeInQuad,
    easeOutQuad,
    easeInOutQuad,
    easeInCubic,
    easeOutCubic,
    easeInOutCubic,
    easeInQuart,
    easeOutQuart,
    easeInOutQuart,
    easeInQuint,
    easeOutQuint,
    easeInOutQuint,
    easeInSine,
    easeOutSine,
    easeInOutSine,
    easeInExpo,
    easeOutExpo,
    easeInOutExpo,
    easeInCirc,
    easeOutCirc,
    easeInOutCirc,
    easeInElastic,
    easeOutElastic,
    easeInOutElastic,
    easeInBack,
    easeOutBack,
    easeInOutBack,
    easeInBounce,
    easeOutBounce,
    easeInOutBounce
}