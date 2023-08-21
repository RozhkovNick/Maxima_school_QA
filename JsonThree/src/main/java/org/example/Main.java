package org.example;

import org.example.jsonparser.JsonParser;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String json = "[{\"Name\": \"Nikolai\", \"Age\": 31, \"Country\": \"Russia\"},{\"Name\": \"Tania\", \"Age\": 28, \"Country\": \"Russia\"}]";
        ArrayList<String> strings = (ArrayList<String>) JsonParser.parseArray(json);
        strings.forEach(System.out::println);
        ArrayList<Person> people = new ArrayList<>();
        strings.forEach(element -> {
            people.add(JsonParser.func(Person.class, element));
        });

        people.stream();
    }
}