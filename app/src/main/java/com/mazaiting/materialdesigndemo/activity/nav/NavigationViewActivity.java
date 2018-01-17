package com.mazaiting.materialdesigndemo.activity.nav;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import butterknife.InjectView;
import com.mazaiting.materialdesigndemo.R;
import com.mazaiting.materialdesigndemo.base.BaseActivity;

/**
 * 不带Toolbar的侧滑菜单
 *
 * @author mazaiting
 */
public class NavigationViewActivity extends BaseActivity {
  @InjectView(R.id.nav_view) NavigationView mNavigationView;

  @Override protected void initData() {
    setHeaderViewListener();
    initNavigationView();
  }

  /**
   * 设置头视图中的图片点击监听
   */
  private void setHeaderViewListener() {
    LinearLayout linearLayout = (LinearLayout) mNavigationView.getHeaderView(0);
    ImageView imageView = (ImageView) linearLayout.getChildAt(0);
    imageView.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        Toast.makeText(NavigationViewActivity.this, "图片点击", Toast.LENGTH_SHORT).show();
      }
    });
  }

  /**
   * 设置侧滑菜单点击监听
   */
  private void initNavigationView() {
    mNavigationView.setNavigationItemSelectedListener(
        new NavigationView.OnNavigationItemSelectedListener() {
          @Override public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
              case R.id.navi_blog:
                Toast.makeText(NavigationViewActivity.this, "blog", Toast.LENGTH_SHORT)
                    .show();
                break;
              default:
                break;
            }
            return true;
          }
        });
  }

  @Override protected int getLayoutId() {
    return R.layout.activity_navigation_view;
  }
}
