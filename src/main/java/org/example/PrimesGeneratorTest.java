package org.example;
import java.util.Iterator;
import java.util.Stack;

public class PrimesGeneratorTest {
    public static void main(String[] args) {
        // создаем объект PrimesGenerator для генерации первых 10 простых чисел
        PrimesGenerator primesGenerator = new PrimesGenerator(10);
        // создаем итератор и выводим первые 10 простых чисел в порядке возрастания
        Iterator<Integer> iterator = primesGenerator.iterator();
        System.out.println("First 10 prime numbers in ascending order:");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        // создаем итератор для вывода первых 10 простых чисел в порядке убывания
        // для этого сначала пропускается 10 чисел вызовом метода next(),
        // а затем выводятся оставшиеся числа
        System.out.println("\nFirst 10 prime numbers in descending order:");
        Stack<Integer> reversedPrimes = new Stack<>();
        iterator = primesGenerator.iterator();
        for (int i = 0; i < 10; i++) {
            reversedPrimes.push(iterator.next());
        }
        while (!reversedPrimes.isEmpty()) {
            System.out.print(reversedPrimes.pop() + " ");
        }
    }
}
// Создается стек reversedPrimes для хранения простых чисел в обратном порядке.
// Получается итератор primesGenerator для генерации простых чисел.
// Затем выполняется цикл for, в котором первые 10 простых чисел добавляются в стек reversedPrimes
// с помощью метода push().
// После этого происходит печать простых чисел из стека reversedPrimes с помощью метода pop(),
// что приводит к выводу этих чисел в обратном порядке через пробел.