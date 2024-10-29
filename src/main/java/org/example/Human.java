package org.example;

import java.util.*;
// класс с переменными имя, фамилия, возраст
class Human implements Comparable<Human> {
    private String firstName;
    private String lastName;
    private int age;

    // инициализация переменных
    public Human(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    // сравнивает Human по полю firstName
    public int compareTo(Human other) {
        return this.firstName.compareTo(other.firstName);
    }
    // возвращает строковое представление Human в формате "firstName lastName (age)"
    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + age + ")";
    }
    // возвращает фамилию человека
    public String getLastName() {
        return lastName;
    }
    // возвращает возраст человека
    public int getAge() {
        return age;
    }
}