package org.example;
import com.jayway.jsonpath.JsonPath;

public class JsonPathExample {

    public static void main(String[] args) {
        String json = "{\"name\":\"Nikolai\",\"age\":31,\"email\":\"rozhkovnick@mail.ru\"}";

        String name = JsonPath.read(json, "$.name");
        int age = JsonPath.read(json, "$.age");
        String email = JsonPath.read(json, "$.email");

        System.out.println(name);
        System.out.println(age);
        System.out.println(email);
    }
}
