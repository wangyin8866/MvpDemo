package com.sljr.sl.mvpdemov2.model;

import android.util.Log;

import com.sljr.sl.mvpdemov2.Services.NewsService;
import com.sljr.sl.mvpdemov2.entity.Info;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by wy on 2016/9/1.
 *
 * 网络上加载数据加载数据
 */
public class INewsModelImpl implements  INewsModel{
    @Override
    public void loadData(final OnLoadDataListener listener) {

        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://www.imooc.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
      NewsService call=  retrofit.create(NewsService.class);
        call.getData(4, 30).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<Info>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("onError",e.toString() );
                    }
                    @Override
                    public void onNext(Info info) {
                        Log.e("onNext", info.getmDatas().get(0).getName());
                        listener.onComplete(info.getmDatas());
                    }
                });

    }
}
