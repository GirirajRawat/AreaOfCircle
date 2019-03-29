package com.AreaOfCircle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etRadius;
    private Button btnCalculate;
    private TextView tvOutput;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etRadius=(EditText) findViewById(R.id.etRadius);
        btnCalculate=(Button) findViewById(R.id.btnCalculate);
        tvOutput=(TextView)findViewById(R.id.tvOutput);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double radius = Integer.parseInt(etRadius.getText().toString());
                AreaOfCircle ar=new AreaOfCircle(radius);
                double result=ar.calculate();
                tvOutput.setText(Double.toString(result));
            }
        });

    }
}
