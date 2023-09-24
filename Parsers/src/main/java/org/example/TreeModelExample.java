package org.example;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TreeModelExample {

    public static void main(String[] args) {
        String json = "{\"name\":\"Nikolai\",\"age\":31,\"email\":\"rozhkovnick@mail.ru\"}";

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootNode = objectMapper.readTree(json);
            String name = rootNode.get("name").asText();
            int age = rootNode.get("age").asInt();
            String email = rootNode.get("email").asText();
            System.out.println(name);
            System.out.println(age);
            System.out.println(email);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
