package letcheerful.heartmap.interactor


import letcheerful.heartmap.domain.feeling.Category
import letcheerful.heartmap.domain.feeling.Feeling
import letcheerful.heartmap.domain.feeling.Sensation
import org.junit.Test
import org.mockito.Mockito
import java.util.*

class FeelingsRecognizerTest {


    @Test
    fun `check if recognizer can record a feeling with date and location`() {
        /* Given */
        val locationProvider = Mockito.mock(LocationProvider::class.java)
        val calendar = Calendar.getInstance()
        val feelingRecognizer = FeelingRecognizer(locationProvider, calendar)

        val feeling = Feeling("Love", Category.Emotional, listOf(
            Sensation.Body(1, 1), Sensation.Mind(1, 1)
        ))

        /* When */
        presenter.attachView(view)
        presenter.onPageFinished("https://www.instagram.com/#access_token=7648569657.eca8521.99e436793c4949c99408dcc8f0d60004")

        /* Then */
        verify(authenticator, times(1)).login("7648569657.eca8521.99e436793c4949c99408dcc8f0d60004")
        verify(view, times(1)).navigateToContentList()

    }
}