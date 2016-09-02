package com.sljr.sl.mvpdemov2.presenter;

import android.util.Log;

import com.sljr.sl.mvpdemov2.entity.Data;
import com.sljr.sl.mvpdemov2.model.INewsModel;
import com.sljr.sl.mvpdemov2.model.INewsModelImpl;
import com.sljr.sl.mvpdemov2.view.INewsView;

import java.util.List;

/**
 * Created by wy on 2016/9/1.
 * <p/>
 * 从网络加载
 */
public class NewsPresenterV1 extends MVPBasePresenter<INewsView> {

    INewsModel model=new INewsModelImpl();


    public void fetch() {
        //获取数据
        model.loadData(new INewsModel.OnLoadDataListener() {
            @Override
            public void onComplete(List<Data> list) {
                Log.e("fetch", "onComplete: " + list.toString());
                //获取到数据给view显示
                getView().showNews(list);
            }
        });
    }
}
