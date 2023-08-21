package task3;

//        Даны списки: a = [1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89]; b = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13].
//        Возвращаем список, который состоит из элементов, общих для этих двух списков.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(5);
        a.add(8);
        a.add(13);
        a.add(21);
        a.add(34);
        a.add(55);
        a.add(89);

        List<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(2);
        b.add(3);
        b.add(4);
        b.add(5);
        b.add(6);
        b.add(7);
        b.add(8);
        b.add(9);
        b.add(10);
        b.add(11);
        b.add(12);
        b.add(13);

        List<Integer> result = getCommonElements(a, b);
        System.out.println(result);
    }

    public static List<Integer> getCommonElements(List<Integer> a, List<Integer> b) {
        Set<Integer> setA = new HashSet<>(a);
        List<Integer> result = new ArrayList<>();
        for (int num : b) {
            if (setA.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }
}
