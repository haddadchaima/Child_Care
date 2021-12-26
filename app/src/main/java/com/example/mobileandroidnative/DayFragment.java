package com.example.mobileandroidnative;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


public class DayFragment extends Fragment {

    RecyclerView recyclerView ;
    LinearLayout linearRecycle ;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view= inflater.inflate(R.layout.fragment_day, container, false);

        recyclerView = view.findViewById(R.id.recycleview_1);
        linearRecycle = view.findViewById(R.id.linear_recycle);


        MyListData[] myListData = new MyListData[] {
                new MyListData("Toxic comment!", "12:34 PM", "Mama always said life was like a box of chocolates. You never know what…"),
                new MyListData("Sleep depreviation!", "12:34 PM", "Mama always said life was like a box of chocolates. You never know what…"),

        };


        MyListAdapter adapter = new MyListAdapter(myListData);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);

        return view ;
    }
}
