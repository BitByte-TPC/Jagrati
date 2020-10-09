package com.priyanshnama.jagrati.ui.material;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.priyanshnama.jagrati.R;

public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    TextView mClassNo, mDate;
    ItemClickListener itemClickListener;
    MyHolder(@NonNull View itemView) {
        super(itemView);
        this.mClassNo=itemView.findViewById(R.id.classNoTextView);
        this.mDate=itemView.findViewById(R.id.dateTextView);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        this.itemClickListener.onItemClickListener(v, getLayoutPosition());
    }
    public void setItemClickListener(ItemClickListener ic){
        this.itemClickListener=ic;
    }
}
