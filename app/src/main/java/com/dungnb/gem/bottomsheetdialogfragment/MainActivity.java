package com.dungnb.gem.bottomsheetdialogfragment;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

@SuppressLint("ResourceType")
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

  Unbinder mUnBinder;
  @BindView(R.id.tvShowBottomSheetDialogFragment)
  TextView mTvShowBottomSheetDialogFragment;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mUnBinder = ButterKnife.bind(this);
    mTvShowBottomSheetDialogFragment.setOnClickListener(this);
  }

  @Override
  public void onClick(View view) {
    switch (view.getId()) {
      case R.id.tvShowBottomSheetDialogFragment:
        showBottomFragmentDialog();
        break;
      default:
        break;
    }
  }

  private void showBottomFragmentDialog() {
    StatusBottomDialogFragment fragment = new StatusBottomDialogFragment();
    Bundle bundle = new Bundle();
    //ArrayList<String> list_status = (ArrayList<String>) Collections.singletonList(getResources().getString(R.array.list_status));
    ArrayList<String> list_status = new ArrayList<>();
    list_status.add("Open");
    list_status.add("Working");
    list_status.add("Closing");
    bundle.putStringArrayList(Constant.BUNDLE.LIST_STATUS, list_status);
    fragment.setArguments(bundle);
    fragment.show(getSupportFragmentManager(), StatusBottomDialogFragment.class.getSimpleName());
  }
}
