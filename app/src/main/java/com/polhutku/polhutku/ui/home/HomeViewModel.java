package com.polhutku.polhutku.ui.home;

import android.webkit.WebView;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private final static String BASE_URL = "http://polhutku.com/polhutku/";
    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
    }

    public String getBaseUrl(){
        return BASE_URL;
    }

    public LiveData<String> getText() {
        return mText;
    }
}