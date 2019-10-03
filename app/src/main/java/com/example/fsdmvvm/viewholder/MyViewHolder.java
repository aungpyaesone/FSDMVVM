package com.example.fsdmvvm.viewholder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fsdmvvm.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MyViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.tv_rate)
    TextView tvRate;

    @BindView(R.id.tv_value)
    TextView tvValue;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }

    public void bindData(String str)
    {
        tvValue.setText(str);
    }
}
