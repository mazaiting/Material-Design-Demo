package com.mazaiting.materialdesigndemo.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import butterknife.ButterKnife;

/**
 * 基类
 * @author mazaiting
 * @date 2017/11/30
 */

public abstract class BaseActivity extends AppCompatActivity {
  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(getLayoutId());
    ButterKnife.inject(this);
    initData();
  }

  /**
   * 开启新界面
   * @param cls Activity类
   */
  protected void onNextActivity(Class cls){
    startActivity(new Intent(this, cls));
  }

  /**
   * 初始化数据
   */
  protected abstract void initData();

  /**
   * 获取布局ID
   * @return 布局ID
   */
  protected abstract int getLayoutId();
}
