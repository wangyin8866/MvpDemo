package com.sljr.sl.mvpdemov2.presenter;

import java.lang.ref.WeakReference;

/**
 * Created by wy on 2016/9/2.
 *
 * 持有view的引用，并解决内存泄漏的问题
 */
public  class MVPBasePresenter<T> {
    /**
     * 弱引用，当内存不足时可释放内存
     */
    protected WeakReference<T> mViewRef;


    /**
     * 关联 P ,V
     *
     * @param view
     */
    public void attachView(T view) {
        mViewRef = new WeakReference<T>(view);
    }

    /**
     * 解除关联
     */
    public void detachView() {
        if (mViewRef != null) {
            mViewRef.clear();
            mViewRef = null;
        }
    }

    /**
     * 获取view
     * @return
     */
    protected T getView() {
        return mViewRef.get();
    }
}
