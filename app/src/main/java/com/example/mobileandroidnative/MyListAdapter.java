package com.example.mobileandroidnative;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.ViewHolder>{
    private MyListData[] listdata;

    // RecyclerView recyclerView;
    public MyListAdapter(MyListData[] listdata) {
        this.listdata = listdata;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final MyListData myListData = listdata[position];
        holder.txtViewTitleComment.setText(listdata[position].getTitleComment());
        holder.txtViewTime.setText(listdata[position].getTime());
        holder.txtViewComments.setText(listdata[position].getComments());
    }


    @Override
    public int getItemCount() {
        return listdata.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView txtViewTitleComment, txtViewTime, txtViewComments;

        public ViewHolder(View itemView) {
            super(itemView);
            this.txtViewTitleComment = (TextView) itemView.findViewById(R.id.txt_title_comments);
            this.txtViewTime = (TextView) itemView.findViewById(R.id.txt_time);
            this.txtViewComments = (TextView) itemView.findViewById(R.id.comments);

        }
    }

}
