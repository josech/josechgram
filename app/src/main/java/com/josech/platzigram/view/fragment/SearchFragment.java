package com.josech.platzigram.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
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
public class SearchFragment extends Fragment {


    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_search, container, false);
        RecyclerView searchRecycler = (RecyclerView) view.findViewById(R.id.searchRecycler);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2, GridLayoutManager.VERTICAL, false);
        searchRecycler.setLayoutManager(gridLayoutManager);

        PictureAdapterRecyclerView pictureAdapterRecyclerView =
                new PictureAdapterRecyclerView(buildPicture(), R.layout.cardview_picture, getActivity());
        searchRecycler.setAdapter(pictureAdapterRecyclerView);

        return view;
    }

    public ArrayList<Picture> buildPicture(){
        ArrayList<Picture> pictures = new ArrayList<>();
        pictures.add(new Picture("https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRrFbOzLzNanorC-ytElyeVL--id0UFeSY3yuVUgbpxCa-83Jr95w","Josech Martínez", "4 días", "3 Me Gusta"));
        pictures.add(new Picture("https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRfyZb1waVxH2RVFeZzj-Fs85yP14PAlHVRpi9aISf3plDzpHl7","Jhon Martínez", "3 días", "2 Me Gusta"));
        pictures.add(new Picture("https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcQh8yAeNcBt5BRDRO7JytNN-4QRc2zva3NXtjEG4FEqWPaNzjc9","Milena Pineda", "2 días", "1 Me Gusta"));
        pictures.add(new Picture("https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRArqYEZ1hE_MTs8cyCZvmsL5gxdEhV-VjO6PoCRuQv18bhFrZe","Josech", "10 días", "11 Me Gusta"));
        pictures.add(new Picture("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSN-XxjDa_g2vhqwyefFAkwaDUcjGBPexpQGEki2yTuKb7Zech5","Shinigami", "2 días", "8 Me Gusta"));
        pictures.add(new Picture("https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcR6A3y7rQbaFdv_LMkr223azsEp3lvV1Ftpn2AA1z1DwcF1DUx1","Kira", "2 días", "4 Me Gusta"));
        return pictures;
    }

}
