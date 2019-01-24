package com.dungnb.gem.bottomsheetdialogfragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

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

  }
}
