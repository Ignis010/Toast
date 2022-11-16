package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton human, dwarf, elf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dwarf = findViewById(R.id.imageButton);
        elf = findViewById(R.id.imageButton2);
        human = findViewById(R.id.imageButton3);

        dwarf.setOnClickListener(this);
        elf.setOnClickListener(this);
        human.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast toast;
        switch (view.getId()){
            case R.id.imageButton:
                toast = Toast.makeText(getApplicationContext(),"Ваша раса: дварф", Toast.LENGTH_LONG);
                    toast.show();
                    break;
            case R.id.imageButton2:
                toast = Toast.makeText(getApplicationContext(),"Ваша раса: эльф'", Toast.LENGTH_LONG);
                toast.show();
                break;
            case R.id.imageButton3:
                toast = Toast.makeText(getApplicationContext(),"Ваша раса: человек'", Toast.LENGTH_LONG);
                toast.show();
                break;
        }
    }
}