package com.example.temperatures;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText fahBox;
    private EditText celBox;
    private RadioButton FtoCRadio;
    private RadioButton CtoFRadio;
    private Button Clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fahBox=findViewById(R.id.fahBox);
        celBox=findViewById(R.id.celBox);
        FtoCRadio= findViewById(R.id.FtoCRadio);
        CtoFRadio= findViewById(R.id.CtoFRadio);
        Clear= findViewById(R.id.Clear);


    }


    public void convert(View v){
        if(FtoCRadio.isChecked()) {
            if(input.length>0){
            String input = fahBox.getText().toString();
            double fahValue = Double.parseDouble(input);
            double celValue = (fahValue - 32) * 5.0 / 9.0;
            celBox.setText(String.format("%.1f", celValue));
            }else{
                Toast.makeText(this, "No Fahrenheit Value entered",Toast.LENGTH_SHORT).show();
            }
        }else if(CtoFRadio.isChecked()) {
            if (input.length > 0) {
                String input = celBox.getText().toString();
                double celValue = Double.parseDouble(input);
                double fahValue = (celValue * 9.0 / 5.0) + 32.0;
                fahBox.setText(String.format("%.1f", fahValue));
            }else{
                Toast.makeText(this, "No Celsius Value entered",Toast.LENGTH_SHORT).show();
            }
        }

    }

}