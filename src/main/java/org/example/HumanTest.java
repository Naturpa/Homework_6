package org.example;
import java.util.*;

// HumanComparatorByLastName реализует интерфейс Comparator для сравнения Human по фамилии
class HumanComparatorByLastName implements Comparator<Human> {
    @Override
    public int compare(Human h1, Human h2) {
        return h1.getLastName().compareTo(h2.getLastName());
    }
}

public class HumanTest {
    public static void main(String[] args) {
        List<Human> humans = Arrays.asList(
                new Human("Alice", "Smith", 30),
                new Human("Bob", "Johnson", 25),
                new Human("Charlie", "Brown", 35)
        );
        System.out.println("ORIGINAL: " + humans); // выводит начальный список

        // a) HashSet
        Set<Human> hashSet = new HashSet<>(humans);
        System.out.println("HashSet: " + hashSet); //  коллекция, которая не допускает повторяющихся элементов

        // b) LinkedHashSet
        Set<Human> linkedHashSet = new LinkedHashSet<>(humans);
        System.out.println("LinkedHashSet: " + linkedHashSet); // коллекция, которая сохраняет порядок добавления элементов

        // c) TreeSet с натуральной сортировкой
        Set<Human> treeSet = new TreeSet<>(humans);
        System.out.println("TreeSet: " + treeSet); //  коллекция, которая сортирует элементы либо в естественном порядке, либо с помощью компаратора

        // d) TreeSet с компаратором по фамилии
        Set<Human> treeSetByLastName = new TreeSet<>(new HumanComparatorByLastName());
        treeSetByLastName.addAll(humans);
        System.out.println("TreeSet with a last name comparator: " + treeSetByLastName);

        // e) TreeSet с анонимным компаратором по возрасту
        Set<Human> treeSetByAge = new TreeSet<>(Comparator.comparingInt(Human::getAge)); //
        treeSetByAge.addAll(humans);
        System.out.println("TreeSet with age comparator: " + treeSetByAge);
    }
}

