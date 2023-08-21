package task8;

import java.util.ArrayList;
import java.util.List;

//  Программа, которая вернет новый список, который содержит чётные числа из
//  заданного списка и останавливается если  встретит число 237

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(12);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);
        numbers.add(237);
        numbers.add(12);

        List<Integer> result = getEvenNumbers(numbers);

        System.out.println("Новый список, содержащий только четные числа:");
        for (int number : result) {
            System.out.println(number);
        }
    }

    public static List<Integer> getEvenNumbers(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();

        for (int number : numbers) {
            if (number == 237) {
                break;
            }
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }
}