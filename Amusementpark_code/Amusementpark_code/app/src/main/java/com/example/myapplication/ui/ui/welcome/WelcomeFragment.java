package com.example.myapplication.ui.ui.welcome;

import android.app.ActivityOptions;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Build;
import android.transition.Slide;
import android.view.Gravity;
import android.view.animation.DecelerateInterpolator;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import androidx.lifecycle.ViewModelProviders;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.myapplication.R;

import com.example.myapplication.ui.login.LoginActivity;
import com.example.myapplication.ui.welcome;

import java.io.File;
import java.util.ArrayList;

public class WelcomeFragment extends Fragment {

    private WelcomeViewModel mViewModel;
    Button savedPlans;
    ListView listView;
    AlertDialog dialog;
    Button back;
    ArrayAdapter<String> adapter;
    public static WelcomeFragment newInstance() {
        return new WelcomeFragment();
    }

    @Nullable

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.welcome_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setSavedPlans();
        Button atPark= (Button) getView().findViewById(R.id.atpark) ;

        Button planner=(Button)getView().findViewById(R.id.planmytrip);

        mViewModel = ViewModelProviders.of(this).get(WelcomeViewModel.class);
        // TODO: Use the ViewModel
    }
    void setSavedPlans(){
        savedPlans=getView().findViewById(R.id.welcome_savedBtn);
    }


}
