package com.example.intent_java_vazifa2;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.intent_java_vazifa2.user.User;

public class DetailActivity extends AppCompatActivity {
    public final String TAG = DetailActivity.class.toString();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        initViews();
    }

    void initViews(){
        TextView tv_detail = findViewById(R.id.tv_detail);

        User user = (User) getIntent().getSerializableExtra("user");
        Log.d(TAG, user.toString());

        tv_detail.setText(user.toString());
    }
}
