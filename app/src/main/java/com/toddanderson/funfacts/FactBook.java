package com.toddanderson.funfacts;

import java.util.Random;

public class FactBook {
    // fields or member variables - properties
    String[] facts = {"C+7 is spelled C E G# Bb",
            "A German+6 chord sounds the same as a dominant seven chord, but resolves differently",
            "The leading tone in a V or vii chord resolves UP by step " +
                    "to the tonic pitch when going to I or vi."};
    // methods - actions the object can take
    public String getFact(){

        // the button was clicked, so update the fact Text View with a new fact
        // randomly select a fact

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);

        // you can convert int to str by concatenating
        // String fact = randomNumber + "";
        return facts[randomNumber];
    }

}
