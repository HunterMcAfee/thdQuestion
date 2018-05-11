package com.demoproject;

import java.awt.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        String str = "Given I  visit   HomeDepot!,.com";
        System.out.println(reverse(str));
    }

    public static String reverse(String stringToReverse) {
        String newStr = "";
        String[] strArr = stringToReverse.split("");
        String wordToReverse = "";
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].contains(" ") || i == strArr.length - 1) {
                if (i == strArr.length - 1) {
                    wordToReverse += strArr[i];
                }
                String reversedWord = "";
                for (int j = wordToReverse.length() - 1; j >= 0; j--) {
                    reversedWord += wordToReverse.charAt(j);
                }
                newStr += reversedWord;
                if (!(i == strArr.length - 1)) {
                    newStr += " ";
                }
                wordToReverse = "";
            } else if (strArr[i].contains("!") || strArr[i].contains(",") || strArr[i].contains(".")) {
                if (i == strArr.length - 1) {
                    wordToReverse += strArr[i];
                }
                String reversedWord = "";
                for (int j = wordToReverse.length() - 1; j >= 0; j--) {
                    reversedWord += wordToReverse.charAt(j);
                }
                newStr += reversedWord;
                if (!(i == strArr.length - 1)) {
                    if (strArr[i].contains("!")) {
                        newStr += "!";
                    } else if (strArr[i].contains(",")) {
                        newStr += ",";
                    } else if (strArr[i].contains(".")) {
                        newStr += ".";
                    }
                }
                wordToReverse = "";
            } else {
                wordToReverse += strArr[i];
            }
        }
        return newStr;
    }
}
