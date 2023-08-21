package org.example;

public class GsonParser {
    public static void main(String[] args) {
        Person person = new Person("Nikolai", "31", "Russia");
        ObjectToJson objectToJson = new ObjectToJson();
        System.out.println(objectToJson.convertToJson(person));
    }
}