package com.priyanshnama.jagrati.ui.teaching;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.priyanshnama.jagrati.R;
import com.priyanshnama.jagrati.ui.classes.ClassesViewModel;

public class TeachingFragment extends Fragment {

    private TeachingViewModel teachingViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        teachingViewModel =
                ViewModelProviders.of(this).get(TeachingViewModel.class);
        View root = inflater.inflate(R.layout.fragment_teaching, container, false);
        final TextView textView = root.findViewById(R.id.text_teaching);
        teachingViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

}