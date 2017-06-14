package com.example.android.acadegildassignment101;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by CHANDAN on 6/14/2017.
 */

public class OutputFragment extends Fragment {
    private static TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.output_fragment,container,false);
        textView = (TextView)view.findViewById(R.id.outputTextView);

        return  view;
    }

    /**
     * public method to perform action to set text to TextView as result
     * @param text
     */
    public void changeTextProperties(String text){
        textView.setText(text);
    }
}

