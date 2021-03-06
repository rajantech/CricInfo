package com.example.criinfo.network;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiInterface {
    @FormUrlEncoded
    @POST("playerFinder")
    Call<ResponseBody> matches(@Field("apikey") String key,@Field("name") String name);

    @FormUrlEncoded
    @POST("playerStats")
    Call<ResponseBody> getPlayerInfo(@Field("apikey")String apikey,@Field("pid") int pid);

    @GET("matches")
    Call<ResponseBody> getMatches(@Query("apikey") String token);

    @GET("cricket")
    Call<ResponseBody> getPastMatches(@Query("apikey") String apikey);

    @GET("cricketScore")
    Call<ResponseBody> getPastMatchesData(@Query("apikey")String apikey,@Query("unique_id") int unique_id);

    @GET("everything")
    Call<ResponseBody> getNewsData(@Query("apiKey") String key, @Query("language") String language, @Query("q") String q,@Query("from") String date);
}
