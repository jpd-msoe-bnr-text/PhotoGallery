package demastri.msoe.photogallery.api

import retrofit2.http.GET

private const val API_KEY = "c82047d894b7c37ac0a35b2a48f32b4c"

interface FlickrApi {
    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=$API_KEY" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )
    suspend fun fetchPhotos(): FlickrResponse
}
