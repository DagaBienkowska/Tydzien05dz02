package com.dagabienkowska;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapaPracownikow {
    public static void main(String[] args) {
        Map<String, String> workers = new HashMap<>();
        workers.put("a1234", "Janek Kowalski");
        workers.put("a9283", "Marysia Kula");
        workers.put("a2734", "Basia Janik");
        workers.put("a9312", "Marian Lubicz");
        workers.put("a0923", "Andrzej Jakcinaimie");
        workers.put("a1267", "Miecio Kloszard");
        workers.put("a4325", "Klemens Wypukły");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ID pracownika (\"a0000\")");
        String idScanner = scanner.nextLine();

        System.out.println(workers.get(idScanner.toLowerCase()));
    }
}
