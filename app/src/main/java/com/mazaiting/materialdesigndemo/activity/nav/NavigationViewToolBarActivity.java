package com.mazaiting.materialdesigndemo.activity.nav;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import butterknife.InjectView;
import com.mazaiting.materialdesigndemo.R;
import com.mazaiting.materialdesigndemo.base.BaseActivity;

/**
 * 带有Toolbar的侧滑菜单
 * @author mazaiting
 */
public class NavigationViewToolBarActivity extends BaseActivity {
  @InjectView(R.id.drawer_layout) DrawerLayout mDrawerLayout;
  @InjectView(R.id.nav_view) NavigationView mNavigationView;
  @InjectView(R.id.toolbar) Toolbar mToolbar;
  @Override protected void initData() {
    setUpDrawer();
    initNavigationView();
    setHeaderViewListener();
  }

  /**
   * 设置头视图中的图片点击监听
   */
  private void setHeaderViewListener() {
    LinearLayout linearLayout = (LinearLayout) mNavigationView.getHeaderView(0);
    ImageView imageView = (ImageView) linearLayout.getChildAt(0);
    imageView.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        Toast.makeText(NavigationViewToolBarActivity.this, "图片点击", Toast.LENGTH_SHORT).show();
      }
    });
  }

  /**
   * 设置侧滑菜单点击监听
   */
  private void initNavigationView() {
    mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
      @Override public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
          case R.id.navi_blog:
            Toast.makeText(NavigationViewToolBarActivity.this, "blog", Toast.LENGTH_SHORT).show();
            break;
          default:
            break;
        }
        return true;
      }
    });
  }

  /**
   * 设置DrawerLayout与ToolBar结合
   */
  private void setUpDrawer() {
    setSupportActionBar(mToolbar);
    ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
        this, mDrawerLayout, mToolbar, R.string.navigation_drawer_open,R.string.navigation_drawer_close
    );
    mDrawerLayout.addDrawerListener(toggle);
    toggle.syncState();
  }

  @Override protected int getLayoutId() {
    return R.layout.activity_navigation_view_tool_bar;
  }
}
