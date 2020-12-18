package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Details extends AppCompatActivity {
    ImageView back,share,image;
    TextView nav_title,title,text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        back=findViewById(R.id.back);
        share=findViewById(R.id.share);
        image=findViewById(R.id.image);
        nav_title=findViewById(R.id.nav_title);
        title=findViewById(R.id.title);
        text=findViewById(R.id.text);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        image.setImageResource(bundle.getInt("image",0));
        text.setText(bundle.getString("text"));
        title.setText(bundle.getString("title"));
        nav_title.setText(bundle.getString("title"));
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Details.this,MainActivity.class);
                startActivities(new Intent[]{intent1});
            }
        });
    }
}