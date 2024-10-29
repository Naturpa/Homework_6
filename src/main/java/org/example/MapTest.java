package org.example;

import java.util.*;

public class MapTest {

    public static <K, V> Map<V, K> swapKeysAndValues(Map<K, V> map) {
        Map<V, K> swappedMap = new HashMap<>();
        // проходится по всем элементам входной Map с помощью метода entrySet(),
        // который возвращает набор элементов в форме множества пар ключ-значение
        // для каждой записи во входной Map ключ и значение меняются местами и добавляются
        // в новую Map swappedMap, новая Map swappedMap возвращается как результат работы метода
        for (Map.Entry<K, V> entry : map.entrySet()) {
            swappedMap.put(entry.getValue(), entry.getKey());
        }
        return swappedMap;
    }

    public static void main(String[] args) {
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("One", 1);
        originalMap.put("Two", 2);
        originalMap.put("Three", 3);

        //принимает на вход Map с ключами типа K и значениями типа V и возвращает
        // новую Map с ключами типа V и значениями типа K
        Map<Integer, String> swappedMap = swapKeysAndValues(originalMap);

        System.out.println("Original map: " + originalMap);
        System.out.println("Swapped map: " + swappedMap);
    }
}
