package com.priyanshnama.jagrati.ui.material;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.priyanshnama.jagrati.R;

import java.util.ArrayList;

public class MaterialFragment extends Fragment {
    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    private MaterialViewModel notificationsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                ViewModelProviders.of(this).get(MaterialViewModel.class);
        View root = inflater.inflate(R.layout.fragment_material, container, false);
        mRecyclerView = root.findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myAdapter = new MyAdapter(getActivity(),getMyList());
        mRecyclerView.setAdapter(myAdapter);
        return root;
    }
    private ArrayList<Model> getMyList(){
        ArrayList<Model> models = new ArrayList<>();
        Model m = new Model();
        m.setClassNo("Class 1");
        m.setDate("Last Updated: 17 Sept 2019");
        models.add(m);
        m = new Model();
        m.setDate("Last Updated: 21 Sept 2019");
        m.setClassNo("Class 2");
        models.add(m);
        return models;
    }
}