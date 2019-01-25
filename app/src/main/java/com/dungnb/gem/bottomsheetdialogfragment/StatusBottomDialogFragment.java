package com.dungnb.gem.bottomsheetdialogfragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import butterknife.BindView;

public class StatusBottomDialogFragment extends BaseBottomSheetFragment {
  @BindView(R.id.btnCancel)
  Button mBtnCancel;
  @BindView(R.id.rcvStatus)
  RecyclerView mRcvStatus;

  ArrayList<String> mListStatus;
  StatusAdapter mStatusAdapter;

  @Override
  public int getLayoutId() {
    return R.layout.fragment_status_bottom_dialog;
  }

  @Override
  public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    addControls();
    addEvents();
  }

  private void addControls() {
    mListStatus = (ArrayList<String>) getArguments().get(Constant.BUNDLE.LIST_STATUS);
    mStatusAdapter = new StatusAdapter(mListStatus, getActivity());
    mRcvStatus.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
    mRcvStatus.setAdapter(mStatusAdapter);
  }

  private void addEvents() {
    mBtnCancel.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        StatusBottomDialogFragment.this.dismiss();
      }
    });
  }
}
