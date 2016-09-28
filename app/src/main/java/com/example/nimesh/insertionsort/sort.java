package com.example.nimesh.insertionsort;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sort extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sort);
        TextView originalsort=(TextView)findViewById(R.id.originalsort);
        TextView finalsort=(TextView)findViewById(R.id.finalsort);
        TextView iterationsort=(TextView)findViewById(R.id.iterations);
        Button Exit =(Button)findViewById(R.id.exit);
        Bundle extras = getIntent().getExtras();
        int[] a = extras.getIntArray("number");
        int l = extras.getInt("length");
        originalsort.setText("Original Array : "+Arrays.toString(a));
        String pass="";
        for (int i1=0;i1<l-1;i1++)
        {
            for (int j1=i1+1; j1>0;j1--){
                if(a[j1-1]>a[j1]){
                    int m1;
                    m1=a[j1];
                    a[j1]=a[j1-1];
                    a[j1-1]=m1;

                }
            }
            String newLine = System.getProperty("line.separator");
              pass = pass.concat("Iteration "+i1+" : "+Arrays.toString(a)+newLine);

               iterationsort.setText(pass);


        }

        for (int i2=0; i2<l;i2++){
            Log.d("Final Sorted Array",""+a[i2]);

        }
        finalsort.setText("Final Sorted Array : "+Arrays.toString(a));

        Exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                moveTaskToBack(true);
            }
        });
    }

}
