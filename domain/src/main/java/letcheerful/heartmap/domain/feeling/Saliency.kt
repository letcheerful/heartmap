package letcheerful.heartmap.domain.feeling

import letcheerful.heartmap.domain.feeling.Sensation.*

data class Saliency(
    val body: Body,
    val mind: Mind,
    val control: Control,
    val emotion: Emotion,
    val lapse: Lapse
)