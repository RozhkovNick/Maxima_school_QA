package task11;

import java.util.ArrayList;
import java.util.List;

// Принимаем от пользователя последовательность чисел, разделённых запятой.
// Возвращаем список и кортеж с этими числами.

public class Main {
    public static void main(String[] args) {
        String input = "1,2,3,4,5";
        List<Integer> list = new ArrayList<>();
        String[] numbers = input.split(",");

        for (String number : numbers) {
            list.add(Integer.parseInt(number));
        }

        System.out.println("List: " + list);

        Integer[] tuple = new Integer[list.size()];
        tuple = list.toArray(tuple);

        System.out.println("Tuple: " + tuple);
    }
}
