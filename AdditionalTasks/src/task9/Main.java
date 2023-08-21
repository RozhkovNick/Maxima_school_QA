package task9;

import java.util.ArrayList;
import java.util.List;

// Программа, которая принимает два списка и возвращает новый список,
// который содержит все элементы первого, которых нет во втором.

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);

        List<Integer> result = getUniqueElements(list1, list2);

        System.out.println("Новый список, содержащий элементы первого списка, которых нет во втором:");
        for (int number : result) {
            System.out.println(number);
        }
    }

    public static List<Integer> getUniqueElements(List<Integer> list1, List<Integer> list2) {
        List<Integer> uniqueElements = new ArrayList<>(list1);
        uniqueElements.removeAll(list2);
        return uniqueElements;
    }
}
