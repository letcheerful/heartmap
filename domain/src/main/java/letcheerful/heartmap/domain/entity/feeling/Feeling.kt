package letcheerful.heartmap.domain.entity.feeling

class Feeling(
    val name: String,
    val type: Category,
    val sensations: List<Sensation>
)