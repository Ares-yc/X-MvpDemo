package com.ares.x_mvpdemo;

import com.ares.mvplibrary.mvp.MVPBaseView;

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

public interface MainView extends MVPBaseView {

    void onLoginResult(String result);
}
