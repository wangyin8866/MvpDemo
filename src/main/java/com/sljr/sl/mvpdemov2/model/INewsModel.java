package com.sljr.sl.mvpdemov2.model;

import com.sljr.sl.mvpdemov2.entity.Data;

import java.util.List;

/**
 * Created by wy on 2016/9/1.
 */
public interface INewsModel {
    //加载数据
    void loadData(OnLoadDataListener listener);

    interface  OnLoadDataListener{
        void  onComplete(List<Data> list);
    }
}
