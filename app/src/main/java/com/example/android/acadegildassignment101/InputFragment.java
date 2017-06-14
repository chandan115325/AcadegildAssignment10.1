package com.example.android.acadegildassignment101;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by CHANDAN on 6/14/2017.
 */

public class InputFragment extends Fragment {

    private static EditText inputText;
    private static Button submitButton;
    //Define the listener of the interface type
    //listener will attch the activity instance containing fragment
    private OnNumberAdditionListener listener;

    //Define the events that the fragment will use to communicate
    public interface OnNumberAdditionListener{
        public void onInputNumber(String num);
    }
    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        try{
            listener = (OnNumberAdditionListener) context;

        } catch (ClassCastException e){
            throw new ClassCastException(context.toString());
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        //Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.input_fragment,
                container,false);
        inputText = (EditText)view.findViewById(R.id.inputEditText);
        submitButton = (Button)view.findViewById(R.id.submitButton) ;
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClicked(view);
            }
        });
        return  view;
    }

    //public method buttonClicked to handle event
    public void buttonClicked(View view){
        listener.onInputNumber(inputText.getText().toString());
    }
}
