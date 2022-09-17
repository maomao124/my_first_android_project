package com.example.my_first_android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "onCreate: 调试日志");
        Log.i("MainActivity", "onCreate: 日志");
        Log.w("MainActivity", "onCreate: 警告日志", new RuntimeException());
        Log.e("MainActivity", "onCreate: 错误日志", new RuntimeException());

        TextView TextView = this.findViewById(R.id.tv_hello);
        TextView.setText("你好，世界！");

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(MainActivity.this, Main2.class));
            }
        });
        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(MainActivity.this, MainActivity3.class));
            }
        });

    }


}