package org.example;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataBindingExample {

    public static void main(String[] args) {
        String json = "{\"name\":\"Nikolai\",\"age\":31,\"email\":\"rozhkovnick@mail.ru\"}";

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Person person = objectMapper.readValue(json, Person.class);
            System.out.println(person.getName());
            System.out.println(person.getAge());
            System.out.println(person.getEmail());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static class Person {

        private String name;
        private int age;
        private String email;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }
}
