package com.mazaiting.materialdesigndemo;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import butterknife.InjectView;
import com.mazaiting.materialdesigndemo.activity.appbar.AppbarLayoutActivity;
import com.mazaiting.materialdesigndemo.activity.collapsingtoolbar.CollapsingToolbarLayoutActivity;
import com.mazaiting.materialdesigndemo.activity.coordinator.CoordinatorLayoutActivity;
import com.mazaiting.materialdesigndemo.activity.fab.FabActivity;
import com.mazaiting.materialdesigndemo.activity.nav.NavigationViewActivity;
import com.mazaiting.materialdesigndemo.activity.nav.NavigationViewToolBarActivity;
import com.mazaiting.materialdesigndemo.activity.snack.SnackActivity;
import com.mazaiting.materialdesigndemo.activity.tablayout.TabLayoutActivity;
import com.mazaiting.materialdesigndemo.activity.textinput.TextInputLayoutActivity;
import com.mazaiting.materialdesigndemo.base.BaseActivity;
import java.util.ArrayList;
import java.util.List;

/**
 * 主页面
 * @author mazaiting
 */
public class MainActivity extends BaseActivity {
  private Class[] mClasses = {
      NavigationViewToolBarActivity.class, NavigationViewActivity.class, TextInputLayoutActivity.class,
      FabActivity.class, SnackActivity.class, TabLayoutActivity.class, CoordinatorLayoutActivity.class,
      AppbarLayoutActivity.class, CollapsingToolbarLayoutActivity.class
  };
  @InjectView(R.id.list) ListView mListView;
  @Override protected void initData() {
    initList();
  }
  private void initList() {
    List<String> list = new ArrayList<>();
    list.add("NavigationView(ToolBar)");
    list.add("NavigationView");
    list.add("TextInputLayout");
    list.add("FloatingActionButton");
    list.add("SnackBar");

    list.add("TabLayout");
    list.add("CoordinatorLayout");
    list.add("AppbarLayout");
    list.add("CollapsingToolbarLayout");


    ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
    mListView.setAdapter(adapter);

    mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
      @Override public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        onNextActivity(mClasses[position]);
      }
    });
  }

  @Override protected int getLayoutId() {
    return R.layout.activity_main;
  }

}
