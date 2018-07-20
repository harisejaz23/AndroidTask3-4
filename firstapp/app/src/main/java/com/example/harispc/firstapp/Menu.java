package com.example.harispc.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Menu extends AppCompatActivity {

    CheckBox cbpizza,cbcoffee,cbburger;
    Button buttonOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        addListenerOnButtonClick();
    }

    private void addListenerOnButtonClick() {
        cbpizza=(CheckBox)findViewById(R.id.pizza);
        cbcoffee=(CheckBox)findViewById(R.id.coffe);
        cbburger=(CheckBox)findViewById(R.id.burger);
        buttonOrder=(Button)findViewById(R.id.btSEnd);

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
                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
            }

        });
    }


}
