package org.example;

import java.util.Iterator;

public class PrimesGenerator implements Iterable<Integer> {
    private int count;

    public PrimesGenerator(int count) {
        this.count = count; //создаем объект с заданным количеством необходимых простых чисел
    }

    @Override
    // Метод возвращающий итератор, который будет перебирать простые числа
    // Итератор содержит два поля: current (текущее простое число)
    // и generated (количество уже сгенерированных простых чисел)
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int current = 2;
            private int generated = 0;

    //метод проверяющий, было ли сгенерировано достаточное количество простых чисел
            @Override
            public boolean hasNext() {
                return generated < count;
            }
                // метод, генерирующий следующее простое число, увеличивая текущее число на 1 до тех пор,
                // пока не найдется следующее простое число
            @Override
            public Integer next() {
                while (!isPrime(current)) {
                    current++;
                }
                generated++;
                return current++;
            }
                // метод проверяющий является ли число простым - меньше 2 оно не простое,
                // иначе в цикле проверяется, делится ли число нацело на другое число
                // до его квадратного корня
            private boolean isPrime(int num) {
                if (num < 2) return false;
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) return false;
                }
                return true;
            }
        };
    }
}


