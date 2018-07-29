package com.dagabienkowska;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ZliczanieZnakow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj słowo");
        String word = scanner.nextLine();

        char[] wordsToChar = word.toCharArray();
        Set<Character> unique = new HashSet<>();
        for (int i=0; i<wordsToChar.length; i++){
            unique.add(wordsToChar[i]);
        }
        System.out.println(unique.size());
    }
}
