package com.josech.platzigram.view.fragment;


import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.josech.platzigram.R;
import com.josech.platzigram.adapter.PictureAdapterRecyclerView;
import com.josech.platzigram.model.Picture;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {


    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        showToolbar("",false,view);

        RecyclerView pictureRecycler = (RecyclerView) view.findViewById(R.id.pictureProfileRecycler);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        pictureRecycler.setLayoutManager(linearLayoutManager);
        PictureAdapterRecyclerView pictureAdapterRecyclerView =
                new PictureAdapterRecyclerView(buildPicture(), R.layout.cardview_picture, getActivity());
        pictureRecycler.setAdapter(pictureAdapterRecyclerView);

        return view;
    }

    public ArrayList<Picture> buildPicture(){
        ArrayList<Picture> pictures = new ArrayList<>();
        pictures.add(new Picture("https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRrFbOzLzNanorC-ytElyeVL--id0UFeSY3yuVUgbpxCa-83Jr95w","Josech Martínez", "4 días", "3 Me Gusta"));
        pictures.add(new Picture("https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRfyZb1waVxH2RVFeZzj-Fs85yP14PAlHVRpi9aISf3plDzpHl7","Jhon Martínez", "3 días", "2 Me Gusta"));
        pictures.add(new Picture("https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcQh8yAeNcBt5BRDRO7JytNN-4QRc2zva3NXtjEG4FEqWPaNzjc9","Milena Pineda", "2 días", "1 Me Gusta"));
        return pictures;
    }

    public void showToolbar(String tittle, boolean upButton, View view){
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(tittle);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }

}
