package com.mazaiting.materialdesigndemo.activity.coordinator;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import butterknife.InjectView;
import butterknife.OnClick;
import com.mazaiting.materialdesigndemo.R;
import com.mazaiting.materialdesigndemo.base.BaseActivity;

/**
 * CoordinatorLayout与FloatingActionButton及Snackbar结合
 * @author mazaiting
 */
public class CoordinatorLayoutActivity extends BaseActivity {
  @InjectView(R.id.coordinatorLayout) CoordinatorLayout mCoordinatorLayout;
  @OnClick(R.id.fab) void onClick(){
    Snackbar.make(mCoordinatorLayout, "点击", Snackbar.LENGTH_SHORT).show();
  }

  @Override protected void initData() {

  }

  @Override protected int getLayoutId() {
    return R.layout.activity_coordinator_layout;
  }
}
