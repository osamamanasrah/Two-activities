package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.edtMsg);
    }

    public void btnSendOnclick(View view) {
        String msg = editText.getText().toString();
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("data", msg);
        startActivity(intent);
    }
}