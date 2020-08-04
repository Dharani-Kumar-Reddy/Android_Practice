package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.text_input);
        button=findViewById(R.id.activity_btn);
        textView=findViewById(R.id.text_field);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("username","Pruthvi");
                startActivity(intent);
            }
        });
    }

    public void change_text(View v){
        String text=editText.getText().toString();
        textView.setText(text);

    }
}