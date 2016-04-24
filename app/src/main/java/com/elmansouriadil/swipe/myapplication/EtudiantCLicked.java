package com.elmansouriadil.swipe.myapplication;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
public class EtudiantCLicked extends DialogFragment{


    public EtudiantCLicked() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_etudiant_clicked, container, false);
    }


}
