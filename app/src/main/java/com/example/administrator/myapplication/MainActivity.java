package com.example.administrator.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.administrator.myapplication.base.BaseActivity;

public class MainActivity extends BaseActivity {

    private String TITLE = "济南";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public String setTitle() {
        return TITLE;
    }

    @Override
    public boolean setLeftBtn(ImageView mLeftBtn) {
        mLeftBtn.setImageResource(R.drawable.touxiang);
        mLeftBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"返回",Toast.LENGTH_SHORT).show();

            }
        });
        return true;
    }
}
