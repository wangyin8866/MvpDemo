package com.sljr.sl.mvpdemov2.view;

import android.app.Activity;
import android.os.Bundle;

import com.sljr.sl.mvpdemov2.presenter.MVPBasePresenter;

/**
 * Created by wy on 2016/9/2.
 */
public abstract class MVPBaseActivity<V, T extends MVPBasePresenter<V>> extends Activity {
    protected T mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //创建presenter
        mPresenter = createPresenter();

        //内存泄漏
        //关联view
        mPresenter.attachView((V) this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //解除关联
        mPresenter.detachView();

    }

    /**
     * 创建presenter,类型由子类确定
     */
    protected abstract T createPresenter();
}
