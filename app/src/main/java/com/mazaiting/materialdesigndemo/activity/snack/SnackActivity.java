package com.mazaiting.materialdesigndemo.activity.snack;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.mazaiting.materialdesigndemo.R;
import com.mazaiting.materialdesigndemo.base.BaseActivity;

/**
 * SnackActivity
 * @author mazaiting
 */
public class SnackActivity extends BaseActivity {

  @Override protected void initData() {
    //Snackbar.make(this.getWindow().getDecorView(), "SnackBar", Snackbar.LENGTH_SHORT).show();
    Snackbar.make(this.getWindow().getDecorView(), "SnackBar", Snackbar.LENGTH_SHORT)
        .setAction("确定", new View.OnClickListener() {
          @Override public void onClick(View v) {
            Toast.makeText(SnackActivity.this, "点击", Toast.LENGTH_SHORT).show();
          }
        })
        .show();
  }

  @Override protected int getLayoutId() {
    return R.layout.activity_snack;
  }
}
