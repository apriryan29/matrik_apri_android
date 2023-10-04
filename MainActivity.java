package com.example.konversiberat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView3, textView4, textView7,textView6;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView7 = findViewById(R.id.textView7);
        textView6 = findViewById(R.id.textView6);

        editText = findViewById(R.id.editTextNumber);

        button = findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ConvertFromKiloToGram();
            }
        });
    }

    private void ConvertFromKiloToGram() {
        String valueEnteredinKILO = editText.getText().toString();
        double Kilo = Double.parseDouble(valueEnteredinKILO);
        double gram = Kilo * 1000;

        textView6.setText("" + gram);
    }
}
