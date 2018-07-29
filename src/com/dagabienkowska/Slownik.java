package com.dagabienkowska;

import java.util.*;

public class Slownik {
    public static void main(String[] args) {

        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("dom", "house");
        dictionary.put("samochód", "car");
        dictionary.put("kot", "cat");
        dictionary.put("jeleń", "deer");
        dictionary.put("chmura", "cloud");
        dictionary.put("liść", "leaf");
        dictionary.put("słońce", "sun");

        System.out.println("Podaj słowo do przetłumaczenia");
        Scanner scanner = new Scanner(System.in);
        String check = scanner.nextLine();
        System.out.println(dictionary.get(check));

        System.out.println("\nPodaj zdanie do przetłumaczenia");
        check = scanner.nextLine();
        List<String> splited = new ArrayList<>(Arrays.asList(check.split(" ")));
        String translate = "";
        for (int i = 0; i < splited.size(); i++){
            if (dictionary.containsKey(splited.get(i))){
                translate += dictionary.get(splited.get(i)) + " ";
            } else {
                translate += splited.get(i) + " ";
            }
            System.out.println(translate + " ");
        }
    }
}
