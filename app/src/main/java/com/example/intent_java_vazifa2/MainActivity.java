package com.example.intent_java_vazifa2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.intent_java_vazifa2.user.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    void initViews(){
        Button b_open_detail = findViewById(R.id.b_open_detail);
        b_open_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user = new User("Azizbek",20);
                openDetailActivity(user);
            }
        });
    }

    void openDetailActivity(User user){
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("user",user);
        startActivity(intent);
    }
}