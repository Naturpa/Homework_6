import java.util.*;
// Задание первое "Массив, список, сортировка"
public class MainArrayList {
    public static void main(String[] args) {
        // a) Создаем массив из N случайных чисел
        int N = 20; // кол-во элементов в массиве
        Random random = new Random(); // рандомные значения
        int[] array = new int[N]; // инициализация массива
        for (int i = 0; i < N; i++) {
            array[i] = random.nextInt(101); // заполнение массива
        }
        System.out.println("An array of random numbers: " + Arrays.toString(array)); // вывод массива со случайными значениями

        // b) Создаем список List на основе массива
        List<Integer> list = new ArrayList<>();
        for (int num : array) {
            list.add(num);
        }

        // c) Сортируем список по возрастанию
        Collections.sort(list);
        System.out.println("Sorted list in ascending order: " + list); // выводим элементы списка по возрастанию

        // d) Сортируем список в обратном порядке
        Collections.reverse(list);
        System.out.println("Sorted list in reverse order: " + list); // выводим обратный порядок элементов (по убыванию)

        // e) Перемешиваем список
        Collections.shuffle(list);
        System.out.println("The shuffled list: " + list); // выводим перемешанный список

        // f) Циклический сдвиг на 1 элемент
        Collections.rotate(list, 1);
        System.out.println("Cyclic shift by 1 element: " + list); // выводим список эл-тов со сдвигом на 1 вправо

        // g) Оставляем только уникальные элементы
        Set<Integer> uniqueSet = new HashSet<>(list);
        System.out.println("Unique elements: " + uniqueSet); // оставляем уникальные эл-ты при помощи метода Set

        // h) Оставляем только дублирующиеся элементы
        Set<Integer> duplicates = new HashSet<>();
        Set<Integer> uniqueElements = new HashSet<>();
        for (Integer num : list) {
            if (!uniqueElements.add(num)) { // сравнивает эл-ты списка с содержащимися в uniqueElements
                duplicates.add(num); // добавление повторяющихся эл-тов
            }
        }
        System.out.println("Duplicate elements: " + duplicates); // выводим повторяющиеся эл-ты

        // i) Получаем массив из списка
        Integer[] arrayFromList = list.toArray(new Integer[0]);
        System.out.println("Array from the list: " + Arrays.toString(arrayFromList)); // выводим массив из списка

        // j) Подсчитываем количество вхождений каждого числа
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arrayFromList) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        System.out.println("The number of occurrences of each number: " + countMap); // выводим эл-ты и кол-во их в массиве
    }
}
