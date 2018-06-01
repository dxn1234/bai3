package com.example.administrator.demointent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button btnSend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSend=findViewById(R.id.btn_send);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                ArrayList<String>arrayList=new ArrayList<>();
                arrayList.add("nguyễn");
                arrayList.add("xuân");
                arrayList.add("đức");
                Bundle bundle=new Bundle();
                bundle.putString("chuoi","text");
                bundle.putInt("so",123);
                bundle.putStringArrayList("arraylist",arrayList);
                intent.putExtra("bundle",bundle);
                startActivity(intent);
            }
        });
    }
}
