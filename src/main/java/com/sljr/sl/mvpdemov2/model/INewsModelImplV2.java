package com.sljr.sl.mvpdemov2.model;

import com.sljr.sl.mvpdemov2.entity.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wy on 2016/9/1.
 * 本地加载数据
 */
public class INewsModelImplV2 implements INewsModel{


    @Override
    public void loadData(OnLoadDataListener listener) {
        List<Data> list = new ArrayList<>();
        for (int i=0;i<10;i++) {
            Data data = new Data(1, "wangyin", "https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/bd_logo1_31bdc765.png", "https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/bd_logo1_31bdc765.png",
                    "幸福钱庄", 1212);
            list.add(data);
        }
        listener.onComplete(list);
    }
}
