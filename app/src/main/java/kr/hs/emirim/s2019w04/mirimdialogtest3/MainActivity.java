package kr.hs.emirim.s2019w04.mirimdialogtest3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg;
    RadioButton radio1, radio2, radio3, radio4;
    View dialogView;
    ImageView dlgImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg = findViewById(R.id.radioGroup);
        radio1 = findViewById(R.id.rg_btn1);
        radio2 = findViewById(R.id.rg_btn2);
        radio3 = findViewById(R.id.rg_btn3);
        radio4 = findViewById(R.id.rg_btn4);
        Button btnShow = findViewById(R.id.btn_image);
        btnShow.setOnClickListener(btnShowListener);
    }


}