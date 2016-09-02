package com.sljr.sl.mvpdemov2.entity;

import java.util.List;

/**
 * Created by wy on 2016/9/1.
 */
public class Info {
    private int status;
    private List<Data> data;
    private String msg;

    public Info(int status, List<Data> mDatas, String msg) {
        this.status = status;
        this.data = mDatas;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Info{" +
                "status=" + status +
                ", mDatas=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<Data> getmDatas() {
        return data;
    }

    public void setmDatas(List<Data> mDatas) {
        this.data = mDatas;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
