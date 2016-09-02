package com.sljr.sl.mvpdemov2.view;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.sljr.sl.mvpdemov2.MyAdapter;
import com.sljr.sl.mvpdemov2.R;
import com.sljr.sl.mvpdemov2.entity.Data;
import com.sljr.sl.mvpdemov2.presenter.NewsPresenterV1;

import java.util.List;

public class MainActivity extends MVPBaseActivity<INewsView, NewsPresenterV1> implements INewsView {
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();


    }

    @Override
    protected NewsPresenterV1 createPresenter() {
        return new NewsPresenterV1();
    }


    private void init() {
        mRecyclerView = (RecyclerView) findViewById(R.id.id_rv);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mPresenter.fetch();
    }

    @Override
    public void showNews(List<Data> data) {

        MyAdapter adapter = new MyAdapter(data, this);
        adapter.setOnItemClickListener(new MyAdapter.OnItemClickListener() {
            @Override
            public void onItemClick() {
                Toast.makeText(MainActivity.this, "click", Toast.LENGTH_SHORT).show();
            }
        });
        mRecyclerView.setAdapter(adapter);
    }
}
