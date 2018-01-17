package com.mazaiting.materialdesigndemo.activity.collapsingtoolbar;

import android.graphics.Color;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import butterknife.InjectView;
import com.mazaiting.materialdesigndemo.R;
import com.mazaiting.materialdesigndemo.base.BaseActivity;

/**
 * CollapsingToolbarLayout作用是提供了一个可以折叠的Toolbar，它继承至FrameLayout
 * @author mazaiting
 */
public class CollapsingToolbarLayoutActivity extends BaseActivity {
  @InjectView(R.id.toolbar) Toolbar mToolbar;
  @InjectView(R.id.collapsing_toolbar_layout) CollapsingToolbarLayout mCollapsingToolbarLayout;
  ////使用CollapsingToolbarLayout必须把title设置到CollapsingToolbarLayout上，设置到Toolbar上则不会显示
  //CollapsingToolbarLayout mCollapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar_layout);
  //mCollapsingToolbarLayout.setTitle("CollapsingToolbarLayout");
  ////通过CollapsingToolbarLayout修改字体颜色
  //mCollapsingToolbarLayout.setExpandedTitleColor(Color.WHITE);//设置还没收缩时状态下字体颜色
  //mCollapsingToolbarLayout.setCollapsedTitleTextColor(Color.GREEN);//设置收缩后Toolbar上字体的颜色
  @Override protected void initData() {
    setToolBar();
    //使用CollapsingToolbarLayout必须把title设置到CollapsingToolbarLayout上，设置到Toolbar上则不会显示
    mCollapsingToolbarLayout.setTitle("CollapsingToolbarLayout");
    //通过CollapsingToolbarLayout修改字体颜色
    //设置还没收缩时状态下字体颜色
    mCollapsingToolbarLayout.setExpandedTitleColor(Color.WHITE);
    //设置收缩后Toolbar上字体的颜色
    mCollapsingToolbarLayout.setCollapsedTitleTextColor(Color.GREEN);
  }

  /**
   * 设置Toolbar
   */
  private void setToolBar() {
    setSupportActionBar(mToolbar);
    if (null != getSupportActionBar()){
      getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        onBackPressed();
      }
    });
  }

  @Override protected int getLayoutId() {
    return R.layout.activity_collapsing_toolbar_layout;
  }
}
