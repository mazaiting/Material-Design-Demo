package com.mazaiting.materialdesigndemo.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.mazaiting.materialdesigndemo.R;

/**
 * 空白的Fragment
 * @author mazaiting
 */
public class BlankFragment extends Fragment {

  public BlankFragment() {
  }

  @Override public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    return inflater.inflate(R.layout.fragment_blank, container, false);
  }
}
