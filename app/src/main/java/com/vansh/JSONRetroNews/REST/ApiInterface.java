package com.vansh.JSONRetroNews.REST;

import com.vansh.JSONRetroNews.Model.ArticleResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by vansh on 15-04-2018.
 */

public interface ApiInterface {
    @GET("v0/topstories.json?print=pretty")
    Call<List<Integer>> getTopStories();
    @GET("v0/item/{articleid}.json?print=pretty")
    Call<ArticleResponse> getArticle(@Path("articleid") int id);
}
