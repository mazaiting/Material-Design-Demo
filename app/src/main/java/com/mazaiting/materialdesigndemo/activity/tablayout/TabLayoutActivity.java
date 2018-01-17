package com.mazaiting.materialdesigndemo.activity.tablayout;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import butterknife.InjectView;
import com.mazaiting.materialdesigndemo.R;
import com.mazaiting.materialdesigndemo.base.BaseActivity;
import com.mazaiting.materialdesigndemo.fragment.BlankFragment;
import java.util.ArrayList;
import java.util.List;

/**
 * TabLayout
 * @author mazaiting
 */
public class TabLayoutActivity extends BaseActivity {
  @InjectView(R.id.tablayout) TabLayout mTabLayout;
  @InjectView(R.id.tab_viewpager) ViewPager mViewPager;
  private List<Fragment> mList = new ArrayList<>();

  @Override protected void initData() {
    initTab();
    bindViewPager();
  }

  /**
   * 初始化ViewPager
   */
  private void bindViewPager() {
    mViewPager.setAdapter(new MyAdapter(getSupportFragmentManager()));
    mTabLayout.setTabMode(TabLayout.MODE_FIXED);
    mTabLayout.setupWithViewPager(mViewPager);
  }

  /**
   * 初始Tab
   */
  private void initTab() {
    //mTabLayout.addTab(mTabLayout.newTab());
    //mTabLayout.addTab(mTabLayout.newTab().setText("Tab 2"));
    //mTabLayout.addTab(mTabLayout.newTab().setText("Tab 3"));
    //tab的字体选择器,默认黑色,选择时红色
    mTabLayout.setTabTextColors(Color.BLACK, Color.RED);
    //tab的下划线颜色,默认是粉红色
    mTabLayout.setSelectedTabIndicatorColor(Color.BLUE);


    mList.add(new BlankFragment());
    mList.add(new BlankFragment());
    mList.add(new BlankFragment());
  }

  @Override protected int getLayoutId() {
    return R.layout.activity_tab_layout;
  }

  class MyAdapter extends FragmentPagerAdapter{

    public MyAdapter(FragmentManager fm) {
      super(fm);
    }

    @Override public Fragment getItem(int position) {
      return mList.get(position);
    }

    @Override public int getCount() {
      return mList.size();
    }

    @Override public CharSequence getPageTitle(int position) {
      return "Tab " + position;
    }
  }

}
