package task4;

import java.util.HashMap;
import java.util.Map;

//        Программа для слияния нескольких словарей в один.
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> dictionary1 = new HashMap<>();
        dictionary1.put("apple", 1);
        dictionary1.put("banana", 2);

        Map<String, Integer> dictionary2 = new HashMap<>();
        dictionary2.put("orange", 3);
        dictionary2.put("grape", 4);

        Map<String, Integer> dictionary3 = new HashMap<>();
        dictionary3.put("kiwi", 5);
        dictionary3.put("mango", 6);

        Map<String, Integer> mergedDictionary = mergeDictionaries(dictionary1, dictionary2, dictionary3);
        System.out.println(mergedDictionary);
    }

    public static Map<String, Integer> mergeDictionaries(Map<String, Integer>... dictionaries) {
        Map<String, Integer> mergedDictionary = new HashMap<>();
        for (Map<String, Integer> dictionary : dictionaries) {
            mergedDictionary.putAll(dictionary);
        }
        return mergedDictionary;
    }
}
