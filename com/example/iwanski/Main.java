package com.example.iwanski;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CheckNumber checkNumber = new CheckNumber();

        for (int i = 1; i <= 100; i++){
            System.out.println(checkNumber.checkNumber(i));
        }

    }
}