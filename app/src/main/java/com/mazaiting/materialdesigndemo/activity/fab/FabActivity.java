package com.mazaiting.materialdesigndemo.activity.fab;

import android.widget.Toast;
import butterknife.OnClick;
import com.mazaiting.materialdesigndemo.R;
import com.mazaiting.materialdesigndemo.base.BaseActivity;

/**
 * 带有悬浮按钮的activity
 * @author mazaiting
 */
public class FabActivity extends BaseActivity {

  @OnClick(R.id.fab) void onClick(){
    Toast.makeText(this, "点击", Toast.LENGTH_SHORT).show();
  }

  @Override protected void initData() {

  }

  @Override protected int getLayoutId() {
    return R.layout.activity_fab;
  }
}
