package tnu.it.stu4it31.bgcolor;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnRed,btnGreen,btnBlue,btnYellow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnRed = findViewById(R.id.btnRed);
        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View bg = findViewById(android.R.id.content);
                bg.setBackgroundColor(Color.RED);
            }
        });
        btnGreen = findViewById(R.id.btnGreen);
        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View bg = findViewById(android.R.id.content);
                bg.setBackgroundColor(Color.GREEN);
            }
        });
        btnBlue = findViewById(R.id.btnBlue);
        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View bg = findViewById(android.R.id.content);
                bg.setBackgroundColor(Color.BLUE);
            }
        });
        btnYellow = findViewById(R.id.btnYellow);
        btnYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View bg = findViewById(android.R.id.content);
                bg.setBackgroundColor(Color.YELLOW);
            }
        });
    }
}