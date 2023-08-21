package task2;

import java.util.ArrayList;
import java.util.List;

//        Есть список a = [1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89].
//        Возвращаем новый список, все элементы, которые меньше 5.

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

        List<Integer> result = getElementsLessThan5(a);
        System.out.println(result);
    }

    public static List<Integer> getElementsLessThan5(List<Integer> a) {
        List<Integer> result = new ArrayList<>();
        for (int num : a) {
            if (num < 5) {
                result.add(num);
            }
        }
        return result;
    }
}
