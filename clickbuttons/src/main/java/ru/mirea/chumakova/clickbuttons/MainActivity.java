package ru.mirea.chumakova.clickbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.service.autofill.TextValueSanitizer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
TextView tvOut;
Button btnOk;
Button btnCancel;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);

        View.OnClickListener oclBtnOk = new View.OnClickListener(){
            @Override
           public void onClick(View v){
                tvOut.setText("Нажата кнопка Ок");
            }

    };
   btnOk.setOnClickListener(oclBtnOk);

        View.OnClickListener oclBtnCancel = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                tvOut.setText("Нажата кнопка Cancel");
            }

        };
        btnCancel.setOnClickListener(oclBtnCancel);

    }
}
