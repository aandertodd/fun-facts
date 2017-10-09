package com.toddanderson.funfacts;

import android.graphics.Color;

import java.util.Random;

public class ColorWheel {
    // fields or member variables - properties
    private String[] colors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };

    // methods - actions the object can take
    int getColor() {

        // the button was clicked, so update the fact Text View with a new fact
        // randomly select a fact

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(colors.length);
        // takes hexadecimal string and converts to an int
        int color = Color.parseColor(colors[randomNumber]);
        // you can convert int to str by concatenating
        // String fact = randomNumber + "";
        return color;
    }
}