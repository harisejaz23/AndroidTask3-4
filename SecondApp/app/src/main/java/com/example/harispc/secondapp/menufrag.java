package com.example.harispc.secondapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class menufrag extends Fragment {

    CheckBox cbpizza, cbcoffee, cbburger;
    Button buttonOrder;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.menu_fragment, container, false);

        cbpizza=(CheckBox)view.findViewById(R.id.pizza);
        cbcoffee=(CheckBox)view.findViewById(R.id.coffe);
        cbburger=(CheckBox)view.findViewById(R.id.burger);
        buttonOrder=(Button)view.findViewById(R.id.btSEnd);

        buttonOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int totaling =0;

                StringBuilder result=new StringBuilder();

                result.append("Selected Items:");

                if(cbpizza.isChecked()){
                    result.append("\nPizza 500Rs");
                    totaling+=100;
                }
                if(cbcoffee.isChecked()){
                    result.append("\nCoffee 250Rs");
                    totaling+=50;
                }
                if(cbburger.isChecked()){
                    result.append("\nBurger 400Rs");
                    totaling+=120;
                }
                result.append("\nTotal: "+totaling+"Rs");
                //Displaying the message on the toast
                Toast.makeText(getActivity(), result.toString(), Toast.LENGTH_LONG).show();
            }

        });

        return view;
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}