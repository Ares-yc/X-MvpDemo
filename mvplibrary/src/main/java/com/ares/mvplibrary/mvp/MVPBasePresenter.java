package com.ares.mvplibrary.mvp;

/**
 * ====================================
 * 作    者：Ares(颜崔)
 * 地    址：https://github.com/Ares-yc
 * 描    述：MVP架构高度封装的Presenter抽象类
 * 版    本：1.0.0
 * 创建时间：2017/8/11/011.
 * 修改时间：2017/8/11/011.
 * ====================================
 */

public abstract class MVPBasePresenter<V extends MVPBaseView> {

    private V view;

    public MVPBasePresenter(){}

    //绑定
    public void onAttachView(V _view){
        this.view = _view;
    }

    //解绑
    public void onDetachView(){
        this.view = null;
    }
}
