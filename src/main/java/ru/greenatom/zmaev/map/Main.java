package ru.greenatom.zmaev.map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> originalMap = new HashMap<>();
        originalMap.put("a", 1);
        originalMap.put("b", 2);
        originalMap.put("c", 3);

        System.out.println("Original Map");
        for (Map.Entry<String, Integer> entry : originalMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        HashMap<Integer, String> swappedMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : originalMap.entrySet()) {
            swappedMap.put(entry.getValue(), entry.getKey());
        }

        System.out.println("Swapped Map");
        for (Map.Entry<Integer, String> entry : swappedMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
