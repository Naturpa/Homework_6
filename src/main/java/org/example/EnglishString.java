package org.example;

import java.util.*;

public class EnglishString {

    public static void main(String[] args) {
        String text = "Over and over!"; // заданная строка
        // строка преобразуется в нижний регистр и все символы, не являющиеся буквами, заменяются на пробелы
        text = text.toLowerCase().replaceAll("[^a-zA-Z ]", " ");
        // строка разбивается на слова с помощью метода split(" "), что позволяет получить массив слов
        String[] words = text.split(" ");
        // объект типа Map<String, Integer>, который будет хранить слова и их частоту встречаемости
        Map<String, Integer> wordFrequency = new HashMap<>();
        // Итерация по массиву слов и проверка каждого слова на пустоту.
        // Для каждого слова, если оно не пустое, увеличивается его частота в словаре wordFrequency.
        // Если слово встречается впервые, оно добавляется в словарь с частотой 1.
        for (String word : words) {
            if (!word.isEmpty()) {
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }
        }
        // Итерация по элементам словаря wordFrequency с помощью метода entrySet().
        // Для каждой записи выводится слово и его частота встречаемости на экран с помощью метода println().
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
