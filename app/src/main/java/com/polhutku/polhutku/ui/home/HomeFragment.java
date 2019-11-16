package com.polhutku.polhutku.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.polhutku.polhutku.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private WebView mSecretView;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        homeViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        mSecretView = root.findViewById(R.id.secretView);
        mSecretView.loadUrl(homeViewModel.getBaseUrl());

        return root;
    }
}