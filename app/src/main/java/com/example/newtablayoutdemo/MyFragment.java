package com.example.newtablayoutdemo;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class MyFragment extends Fragment {
    private int imageResource;

    /*构造函数*/
    public MyFragment(int imageResource) {
        this.imageResource = imageResource;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View linearLayout = getLayoutInflater().inflate(R.layout.fragment_my, null);
        ImageView imageView = linearLayout.findViewById(R.id.imageView);
        imageView.setImageResource(imageResource);
        return linearLayout;
    }
}