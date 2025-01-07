package com.example.ex06031;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView textV;
    Button btn;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        textV = findViewById(R.id.textV);
    }
    public void clicked(View view)
    {
        count ++;
        textV.setText("This is click number: " + count);
        textV.setBackgroundColor(Color.WHITE);
        textV.setTextColor(Color.BLACK);
        if(count == 6)
        {
            textV.setText("Enough to click. Go to new start!");
            textV.setBackgroundColor(Color.BLUE);
            textV.setTextColor(Color.WHITE);
            count = 0;
        }
    }
}