package com.example.android.acadegildassignment101;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class MainActivity extends FragmentActivity implements
    InputFragment.OnNumberAdditionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     *
     * @param num
     */
    @Override
    public void onInputNumber(String num) {
        OutputFragment outputFragment =
                (OutputFragment)getSupportFragmentManager()
                .findFragmentById(R.id.fragment6);
        outputFragment.changeTextProperties(num);
    }
}
