package letcheerful.heartmap.domain


import letcheerful.heartmap.domain.entity.feeling.Feeling.NegativeFeeling.*
import org.junit.Test

class FeelingsTest {


    @Test
    fun selectFeelings() {
        val recorder = FeelingRecoder()

        recorder.record(Anger())
        recorder.record(Fear())

        recorder.store()
    }
}