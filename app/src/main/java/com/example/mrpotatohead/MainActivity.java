package com.example.mrpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // reminds if the pictures ere visibile or not, and if the game is recreated and
        // makes this visible in the app
        if (savedInstanceState != null) {
            int armsVisibility = savedInstanceState.getInt("arms_visibility");
            ImageView arms = (ImageView) findViewById(R.id.arms);
            arms.setVisibility(armsVisibility);

            int earsVisibility = savedInstanceState.getInt("ears_visibility");
            ImageView ears = (ImageView) findViewById(R.id.ears);
            ears.setVisibility(earsVisibility);

            int eyebrowsVisibility = savedInstanceState.getInt("eyebrows_visibility");
            ImageView eyebrows = (ImageView) findViewById(R.id.eyebrows);
            eyebrows.setVisibility(eyebrowsVisibility);

            int eyesVisibility = savedInstanceState.getInt("eyes_visibility");
            ImageView eyes = (ImageView) findViewById(R.id.eyes);
            eyes.setVisibility(eyesVisibility);

            int glassesVisibility = savedInstanceState.getInt("glasses_visibility");
            ImageView glasses = (ImageView) findViewById(R.id.glasses);
            glasses.setVisibility(glassesVisibility);

            int hatVisibility = savedInstanceState.getInt("hat_visibility");
            ImageView hat = (ImageView) findViewById(R.id.hat);
            hat.setVisibility(hatVisibility);

            int mouthVisibility = savedInstanceState.getInt("mouth_visibility");
            ImageView mouth = (ImageView) findViewById(R.id.mouth);
            mouth.setVisibility(mouthVisibility);

            int mustacheVisibility = savedInstanceState.getInt("mustache_visibility");
            ImageView mustache = (ImageView) findViewById(R.id.mustache);
            mustache.setVisibility(mustacheVisibility);

            int shoesVisibility = savedInstanceState.getInt("shoes_visibility");
            ImageView shoes = (ImageView) findViewById(R.id.shoes);
            shoes.setVisibility(shoesVisibility);

            int noseVisibility = savedInstanceState.getInt("nose_visibility");
            ImageView nose = (ImageView) findViewById(R.id.nose);
            nose.setVisibility(noseVisibility);

        }

    }

    // reminds the visbility of the images
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState); // always call super
        ImageView arms = (ImageView) findViewById(R.id.arms);
        int armsVis = arms.getVisibility();
        outState.putInt("arms_visibility", armsVis);

        ImageView ears = (ImageView) findViewById(R.id.ears);
        int earsVis = ears.getVisibility();
        outState.putInt("ears_visibility", earsVis);

        ImageView eyebrows = (ImageView) findViewById(R.id.eyebrows);
        int eyebrowsVis = eyebrows.getVisibility();
        outState.putInt("eyebrows_visibility", eyebrowsVis);

        ImageView eyes = (ImageView) findViewById(R.id.eyes);
        int eyesVis = eyes.getVisibility();
        outState.putInt("eyes_visibility", eyesVis);

        ImageView glasses = (ImageView) findViewById(R.id.glasses);
        int glassesVis = glasses.getVisibility();
        outState.putInt("glasses_visibility", glassesVis);

        ImageView hat = (ImageView) findViewById(R.id.hat);
        int hatVis = hat.getVisibility();
        outState.putInt("hat_visibility", hatVis);

        ImageView mouth = (ImageView) findViewById(R.id.mouth);
        int mouthVis = mouth.getVisibility();
        outState.putInt("mouth_visibility", mouthVis);

        ImageView mustache = (ImageView) findViewById(R.id.mustache);
        int mustacheVis = mustache.getVisibility();
        outState.putInt("mustache_visibility", mustacheVis);

        ImageView shoes = (ImageView) findViewById(R.id.shoes);
        int shoesVis = shoes.getVisibility();
        outState.putInt("shoes_visibility", shoesVis);

        ImageView nose = (ImageView) findViewById(R.id.nose);
        int noseVis = nose.getVisibility();
        outState.putInt("nose_visibility", noseVis);
    }

    //this function set an image on visible if it is clicked
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
