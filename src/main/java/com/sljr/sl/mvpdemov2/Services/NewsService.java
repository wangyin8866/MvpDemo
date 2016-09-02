package com.sljr.sl.mvpdemov2.Services;

import com.sljr.sl.mvpdemov2.entity.Info;

import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by wy on 2016/9/1.
 */
public interface NewsService {
    @POST("teacher")
    Observable<Info> getData(@Query("type") int type, @Query("num") int num);
}
