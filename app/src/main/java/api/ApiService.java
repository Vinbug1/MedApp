package api;

import com.google.android.gms.location.places.GeoDataClient;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("/wp-content/themes/hospital/")
    Call<JsonObject>getAllPhotos(@Query("data") String data);

    @GET("https://maps.googleapis.com/maps/api/geocode/json")
    Call<JsonObject> getGeoCoderAddress(@Query("key") String apiKey,
                                        @Query("latlng") String latlng);
}
