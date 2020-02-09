package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String textToDecorate, PoemDecorator decoratePoem){

        String resultOfDecorate = decoratePoem.decorate(textToDecorate);
        System.out.println("Result of decorate: " + resultOfDecorate);

    }
}
