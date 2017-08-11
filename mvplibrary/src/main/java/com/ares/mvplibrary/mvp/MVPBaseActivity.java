package com.ares.mvplibrary.mvp;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * ====================================
 * 作    者：Ares(颜崔)
 * 地    址：https://github.com/Ares-yc
 * 描    述：
 * 版    本：1.0.0
 * 创建时间：2017/8/11/011.
 * 修改时间：2017/8/11/011.
 * ====================================
 */

public abstract class MVPBaseActivity<V extends MVPBaseView,P extends MVPBasePresenter<V>> extends AppCompatActivity{

    private V view;
    private P presenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        init();
    }

    //初始化并完成绑定
    private void init() {
        if (this.view == null){
            this.view = createView();
        }
        if (this.presenter == null){
            this.presenter = createPresenter();
        }
        if (this.presenter != null && this.view != null){
            this.presenter.onAttachView(this.view);
        }
    }

    //交由继承者去实现，实例化具体的View对象
    protected abstract V createView();

    //交由继承者去实现，实例化具体的Presenter对象
    protected abstract P createPresenter();


    //销毁并解除绑定
    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.presenter.onDetachView();
    }
}
