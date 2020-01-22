package letcheerful.heartmap.domain.feeling

sealed class Sensation(
    val mean: Int,
    val sem: Int // 평균의 표준 오차(standard error of the mean, SEM)
) {
    // 좋은 영향 : 활기찬, 나쁜 영향 : 무기력
    class Body(mean: Int, sem: Int) : Sensation(mean, sem)

    // 좋은 영향 : 의욕, 나쁜 영향 : 우울
    class Mind(mean: Int, sem: Int) : Sensation(mean, sem)

    // 좋은 영향 : 흥분, 행복, 나쁜 영향 : 우울, 절망
    class Emotion(mean: Int, sem: Int) : Sensation(mean, sem)

    // 선택, 표현등이 조절이 가능한
    class Control(mean: Int, sem: Int) : Sensation(mean, sem)

    // 당당함 vs 죄의식
    class Lapse(mean: Int, sem: Int) : Sensation(mean, sem)
}