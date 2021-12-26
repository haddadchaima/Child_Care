package com.example.mobileandroidnative;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class MyListAdapter2 extends RecyclerView.Adapter<MyListAdapter2.ViewHolder>{
    private MyListData2[] listdata;

    // RecyclerView recyclerView;
    public MyListAdapter2(MyListData2[] listdata) {
        this.listdata = listdata;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.list_item2, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final MyListData2 myListData2 = listdata[position];
        holder.txtViewTitleComment.setText(listdata[position].getTitleComment());
        holder.txtViewTime.setText(listdata[position].getTime());
        holder.txtViewComments.setText(listdata[position].getComments());
        holder.imgProfile.setImageResource(listdata[position].getImgProfile());
    }


    @Override
    public int getItemCount() {
        return listdata.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView txtViewTitleComment, txtViewTime, txtViewComments;
        ImageView imgProfile ;

        public ViewHolder(View itemView) {
            super(itemView);
            this.txtViewTitleComment = (TextView) itemView.findViewById(R.id.txt_title_comments);
            this.txtViewTime = (TextView) itemView.findViewById(R.id.txt_time);
            this.txtViewComments = (TextView) itemView.findViewById(R.id.comments);
            this.imgProfile = itemView.findViewById(R.id.img_friends);

        }
    }

}
