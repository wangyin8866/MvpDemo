package com.sljr.sl.mvpdemov2.presenter;

import com.sljr.sl.mvpdemov2.entity.Data;
import com.sljr.sl.mvpdemov2.model.INewsModel;
import com.sljr.sl.mvpdemov2.model.INewsModelImplV2;
import com.sljr.sl.mvpdemov2.view.INewsView;

import java.util.List;

/**
 * Created by wy on 2016/9/1.
 * 从本地加载
 */
public class NewsPresenterV2 extends MVPBasePresenter<INewsView>{

    //model
    INewsModel model = new INewsModelImplV2();


    public  void  fetch(){
        model.loadData(new INewsModel.OnLoadDataListener() {
            @Override
            public void onComplete(List<Data> list) {
                getView().showNews(list);
            }
        });
    }
}
