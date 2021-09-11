package com.example.parimpar;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtResults;
    private EditText etxtInputNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.etxtInputNumber = findViewById(R.id.etxtInputNumber);
        this.txtResults = findViewById(R.id.txtResults);
    }

    public void onClickCheck(View view){
        String input = this.etxtInputNumber.getText().toString();
        int inputValue = Integer.parseInt(input);

        if(inputValue % 2 != 0){
            String res = inputValue + " " +getString(R.string.is_odd);
            this.txtResults.setText(res);
        }else {
            String res = inputValue + " " +getString(R.string.is_even);
            this.txtResults.setText(res);
        }
        this.etxtInputNumber.setText("");
    }
}