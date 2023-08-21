package org.example;

public class Person {
    @JsonElement()
    private String name;
    @JsonElement(key = "age")
    private String age;
    @JsonElement(key = "PersonCountry")
    private String country;

    public Person(String name, String age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }
}
