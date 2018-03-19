package com.example.rodneytressler.week1assessment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textviewm;
    private EditText edittextm;
    private Button buttonm;
    private String InputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textviewm = findViewById(R.id.textView);
        edittextm = findViewById(R.id.edit_text);
        buttonm = findViewById(R.id.button);


        setListener() {


        }

    private void setListener() {
        buttonm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = get.edittextm;
                set.inputText("");
            }
        });
    }
}

