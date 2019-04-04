package com.example.mrpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkClicked(View view) {
        CheckBox checkbox = (CheckBox) view;
        String checkboxstr = checkbox.getText().toString();
        ImageView image = (ImageView) findViewById(R.id.arms);
        switch(checkboxstr) {
            case "Arms":
                image = (ImageView) findViewById(R.id.arms);
                break;
            case "Ears":
                image = (ImageView) findViewById(R.id.ears);
                break;
            case "Eyebrows":
                image = (ImageView) findViewById(R.id.eyebrows);
                break;
            case "Eyes":
                image = (ImageView) findViewById(R.id.eyes);
                break;
            case "Glasses":
                image = (ImageView) findViewById(R.id.glasses);
                break;
            case "Hat":
                image = (ImageView) findViewById(R.id.hat);
                break;
            case "Mouth":
                image = (ImageView) findViewById(R.id.mouth);
                break;
            case "Mustache":
                image = (ImageView) findViewById(R.id.mustache);
                break;
            case "Shoes":
                image = (ImageView) findViewById(R.id.shoes);
                break;
            case "Nose":
                image = (ImageView) findViewById(R.id.nose);
                break;
            default:
                System.out.println("nop");
        }

        if(checkbox.isChecked()) {
            image.setVisibility(View.VISIBLE);
        }
        else {
            image.setVisibility(View.INVISIBLE);
        }

    }
}
