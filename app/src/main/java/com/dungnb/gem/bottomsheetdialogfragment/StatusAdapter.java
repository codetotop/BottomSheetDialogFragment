package com.dungnb.gem.bottomsheetdialogfragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
@SuppressLint("ResourceAsColor")
public class StatusAdapter extends RecyclerView.Adapter<StatusAdapter.ViewHolder> {
  ArrayList<String> mListStatus;
  Context mContext;


  public StatusAdapter(ArrayList<String> listStatus, Context context) {
    mListStatus = listStatus;
    mContext = context;
  }

  @NonNull
  @Override

  public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
    View view = LayoutInflater.from(mContext).inflate(R.layout.item_status, viewGroup, false);
    ViewHolder viewHolder = new ViewHolder(view);
    return viewHolder;
  }

  @Override
  public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
    String status = mListStatus.get(i);
    viewHolder.mTvStatus.setText(status);
    //viewHolder.itemView.setBackgroundColor(viewHolder.itemView.isSelected() ? R.color.colorSelected : R.color.colorUnSelected);
    viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {

      }
    });
  }

  @Override
  public int getItemCount() {
    return mListStatus.size();
  }

  class ViewHolder extends RecyclerView.ViewHolder {
    TextView mTvStatus;

    public ViewHolder(@NonNull View itemView) {
      super(itemView);
      mTvStatus = itemView.findViewById(R.id.tvStatus);
    }

  }
}
