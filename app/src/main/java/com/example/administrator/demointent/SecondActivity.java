package com.example.administrator.demointent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    TextView txtKetQua;
    Button btnSecond;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btnSecond=findViewById(R.id.btn_secondactivity);
        txtKetQua=findViewById(R.id.txt_ketqua);
        Intent intent=getIntent();
        Bundle bundle=intent.getBundleExtra("bundle");
        int so=bundle.getInt("so");
        Log.d("kiemtra",so+"");
        String chuoi=bundle.getString("chuoi");
        Log.d("kiemtra",chuoi+"");
        ArrayList<String>arrayList=new ArrayList<>();
        arrayList=bundle.getStringArrayList("arraylist");
        for(int i=0;i<arrayList.size();i++){
            Log.d("kiemtra",arrayList.get(i));
        }
        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
