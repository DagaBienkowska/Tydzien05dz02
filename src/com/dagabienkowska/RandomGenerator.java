package com.dagabienkowska;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomGenerator {

    public static void main(String[] args) {

        List<Float> numbers = new ArrayList<>();
        Random r = new Random();
        float random = 0;
        do {
            random = r.nextFloat() * (100);
            numbers.add(random);
            System.out.println(numbers);
        }while (random >=0.1);

for (float x : numbers){
    float xpi = 0;
    xpi = x * (float) Math.PI;
    System.out.println(xpi);
}
    }
}
