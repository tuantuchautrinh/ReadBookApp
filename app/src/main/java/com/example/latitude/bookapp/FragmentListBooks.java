package com.example.latitude.bookapp;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.ListFragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FragmentListBooks extends Fragment {
    private BookApdapter bookApdapter;
    private ListView lvBook;
    ArrayList<Book> arrBook ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.listbook,container, false);




        return view;
    }
}
