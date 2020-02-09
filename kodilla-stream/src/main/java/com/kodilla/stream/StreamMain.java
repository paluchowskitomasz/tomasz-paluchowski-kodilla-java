package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        PoemBeautifier newPoemBeautifier = new PoemBeautifier();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println("Text Beautifier: ");
        newPoemBeautifier.beautify("tekst nr 1",(textToDecorate) -> textToDecorate.toLowerCase());
        newPoemBeautifier.beautify("tekst nr 2",(textToDecorate) -> textToDecorate.toUpperCase());
        newPoemBeautifier.beautify("tekst nr 3",(textToDecorate) -> textToDecorate.replace("3","0"));
        newPoemBeautifier.beautify("tekst nr 4",(textToDecorate) -> textToDecorate.replaceAll("\\s",""));
        newPoemBeautifier.beautify("tekst nr 5",(textToDecorate) -> String.format("Text to decorate: %s", textToDecorate));

    }
}