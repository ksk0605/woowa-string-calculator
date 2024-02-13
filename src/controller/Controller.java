package controller;

import model.Calculator;
import view.View;

import java.text.CharacterIterator;
import java.util.Arrays;
import java.util.Scanner;

public class Controller {
    private final View view = new View();

    void calculate() {
        String input = view.inputData();
        String separators = getSeparators(input);
        final String[] tokens = input.split(separators);
        Arrays.stream(tokens).forEach(Integer.parseInt());
        new Calculator();
        String s = view.inputData();
        Scann    }
    private String getSeparators(String input) {
        String tokens = ",|:";
        String prefix = "";
        if (input.startsWith("//")){
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                prefix += c;
                if (prefix.endsWith("\n")){
                    prefix = prefix.replace("//", "|");
                    prefix = prefix.replace("\n", "");
                    tokens += prefix;
                    break;
                }
            }
        }
        return tokens;
    }
}
