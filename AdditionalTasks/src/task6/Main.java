package task6;

//Выводим новый список, содержащий первый и последний элемент изначального списка.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> originalList = new ArrayList<>();
        originalList.add(10);
        originalList.add(20);
        originalList.add(30);
        originalList.add(40);
        originalList.add(50);

        List<Integer> newList = new ArrayList<>();
        newList.add(originalList.get(0)); // добавляем первый элемент
        newList.add(originalList.get(originalList.size() - 1)); // добавляем последний элемент

        System.out.println("Изначальный список: " + originalList);
        System.out.println("Новый список: " + newList);
    }
}