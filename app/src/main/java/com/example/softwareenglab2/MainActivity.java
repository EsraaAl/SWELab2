package com.example.softwareenglab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button send_button;
EditText send_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        send_button = (Button)findViewById(R.id.SendButton);
        send_text = findViewById(R.id.Enter);

        send_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String nameA = send_text.getText().toString();
                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                intent.putExtra("personName" , nameA);
                startActivity(intent);
            }

        });


    }


}