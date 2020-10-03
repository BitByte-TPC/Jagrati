package com.priyanshnama.jagrati.ui.teaching;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TeachingViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TeachingViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is teaching fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}