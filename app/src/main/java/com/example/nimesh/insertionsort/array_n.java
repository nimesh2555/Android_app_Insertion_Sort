package com.example.nimesh.insertionsort;

import android.content.Intent;
import android.icu.text.LocaleDisplayNames;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class array_n extends AppCompatActivity {
  int i,p;
    int[] a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_n);
        String l = getIntent().getExtras().getString("length");
        TextView t=(TextView)findViewById(R.id.textView);
        final Button b=(Button) findViewById(R.id.button2);
        final EditText e=(EditText)findViewById(R.id.editText2);
        Toast.makeText(getApplicationContext(), "length of Array "+l,
                Toast.LENGTH_LONG).show();
        final int lengthInInt = Integer.parseInt(l);
         a=new int[lengthInInt];
        t.setText("Enter "+l+ " Elements for Insertion sort");
        b.setText("Enter 1 element");
        i=0;
         p=0;
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    String edit= e.getText().toString();
                    Log.d("edit",edit);
                    int v = Integer.parseInt(edit);
                    a[p]=v;

                    Log.d("value",""+a[p]);
                    p++;
                    i++;
                    int c=i+1;
                    b.setText("Enter " +c+ " element");
                    e.setText("");
                    if(i==(lengthInInt))
                    {
                        e.setVisibility(View.GONE);
                        b.setVisibility(view.GONE);
                        Toast.makeText(getApplicationContext(), "PERFORMING Insertion Sort",
                                Toast.LENGTH_LONG).show();
                        Log.d("sorting0","Sorting");
                        for (int i2=0; i2<lengthInInt;i2++){
                            Log.d("sorting0",""+a[i2]);

                        }

                        Intent myIntent = new Intent(array_n.this,sort.class);
                        myIntent.putExtra("number",a);
                        myIntent.putExtra("length",lengthInInt);
                        startActivity(myIntent);
                    }
                }
            });




    }

}
