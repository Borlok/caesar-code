package com.company;

import java.util.*;

public class Decoder {


    public void decode(String text, int offset) {

        String finalCode = Arrays.stream(text.toLowerCase().split("\\.*"))
                .map(x -> !(x.equals(",") || x.equals(" ") || x.equals(".")) ? (getAlphabet().get(getAlphabet().indexOf(x) + offset)) : x)
                .reduce("", String::concat);
        System.out.println(finalCode);
    }


    private ArrayList<String> getAlphabet() {
        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяабвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        return new ArrayList<>(Arrays.asList(alphabet.split("\\.*")));

    }
}
