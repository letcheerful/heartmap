package letcheerful.heartmap.domain.entity.feeling

data class Sensation(
    val name: String,
    val mean: Int,
    val sem: Int // 평균의 표준 오차(standard error of the mean, SEM)
)