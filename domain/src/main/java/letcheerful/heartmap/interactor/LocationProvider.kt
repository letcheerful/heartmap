package letcheerful.heartmap.interactor

import letcheerful.heartmap.domain.location.Location

interface LocationProvider {
    fun getLocation(): Location
}
