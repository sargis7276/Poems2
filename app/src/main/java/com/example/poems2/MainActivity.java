package com.example.poems2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.sargisabrahamyan.listview";
    String key = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myLV = findViewById(R.id.myListView);

        final String[] values = new String[]{"Pushkin: To ***","Pushkin: I loved you once...","Sergey Yesenin: The golden birch-tree grove has fallen silent", "Sergey Yesenin: Goodbye, my friend, goodbye.","Pushkin: Exegi Monumentum", "Pushkin: The Tale of Tsar Saltan"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.activity_list_item,android.R.id.text1,values);

        myLV.setAdapter(adapter);
        myLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    key = "1";
                    Intent myintent = new Intent(view.getContext(),Activity11.class);
                    myintent.putExtra(EXTRA_MESSAGE, key);
                    startActivity(myintent);
                }

                if(position==1){
                    Intent myintent = new Intent(view.getContext(),Activity11.class);
                    key = "2";
                    myintent.putExtra(EXTRA_MESSAGE, key);
                    startActivity(myintent);
                }
                if(position==2){
                    Intent myintent = new Intent(view.getContext(),Activity11.class);
                    key = "3";
                    myintent.putExtra(EXTRA_MESSAGE, key);
                    startActivity(myintent);
                }
                if(position==3){
                    key = "4";
                    Intent myintent = new Intent(view.getContext(),Activity11.class);
                    myintent.putExtra(EXTRA_MESSAGE, key);
                    startActivity(myintent);
                }

                if(position==4){
                    Intent myintent = new Intent(view.getContext(),Activity11.class);
                    key = "5";
                    myintent.putExtra(EXTRA_MESSAGE, key);
                    startActivity(myintent);
                }
                if(position==5){
                    Intent myintent = new Intent(view.getContext(),Activity11.class);
                    key = "6";
                    myintent.putExtra(EXTRA_MESSAGE, key);
                    startActivity(myintent);
                }
            }
        });

    }
}
