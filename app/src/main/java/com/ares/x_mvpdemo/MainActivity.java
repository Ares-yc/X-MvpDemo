package com.ares.x_mvpdemo;

import android.os.Bundle;

import com.ares.mvplibrary.mvp.MVPBaseActivity;

public class MainActivity extends MVPBaseActivity<MainView,MainPresenter> implements MainView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onLoginResult(String result) {

    }

    @Override
    protected MainView createView() {
        return this;
    }

    @Override
    protected MainPresenter createPresenter() {
        return new MainPresenter();
    }
}
