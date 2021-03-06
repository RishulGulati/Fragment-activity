package com.example.rishul.fragmentactivityexample;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class FragmentTwo extends Fragment {
    public FragmentTwo() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_fragment_two, container, false);

        RecyclerView rv2 = (RecyclerView) rootView.findViewById(R.id.rv_recycler_view_two);
        rv2.setHasFixedSize(true);
        MyAdapter adapter = new MyAdapter(new String[]{"2) test 1", "2) test two", "2) test three", "2)test four", "2)test five" , "2) test six" , "2) test seven"},getActivity());
        rv2.setAdapter(adapter);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv2.setLayoutManager(llm);

        return rootView;
    }

}


