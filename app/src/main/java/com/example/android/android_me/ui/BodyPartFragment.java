package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

/**
 * Created by Vlad on 5/1/2018.
 */

public class BodyPartFragment extends Fragment {

    private ImageView bodyPartImageView;
    public BodyPartFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_body_part, container, false);
        ImageView bodyPartImageView = (ImageView) rootView.findViewById(R.id.iv_body_part);
        bodyPartImageView.setImageResource(AndroidImageAssets.getHeads().get(0));
        return rootView;
    }
}
