package org.example.jsonparser;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.*;

public class JsonParser {

    public static List<String> parseArray(String json) {
        ArrayList<String> result = new ArrayList<>();
        boolean startsWith = json.startsWith("[");
        boolean endsWith = json.endsWith("]");
        if (startsWith && endsWith) {
            String subString = json.substring(1, json.length() - 1);
            List<String> list = Arrays.asList(subString.split("\\{|},\\{|}"));
            list.forEach(element -> {
                if (element.length() > 0) {
                    result.add(String.format("{%s}", element));
                }
            });
        }
        return result;
    }

    public static <T> T func(Class<T> tClass, String json) {
        try {
            boolean startsWith = json.startsWith("{");
            boolean endsWith = json.endsWith("}");
            if (startsWith && endsWith) {
                String subString = json.substring(1, json.length() - 1);
                String[] split = subString.split(",");
                HashMap<String, String> hashMap = new HashMap<>();
                Arrays.stream(split).forEach(element -> {
                    String replace = element.replace("\"", "");
                    String[] elementMap = replace.split(":");
                    hashMap.put(elementMap[0].trim(), elementMap[1].trim());
                });

                Constructor<T> constructor = tClass.getConstructor();
                T object = constructor.newInstance();
                Field[] fields = tClass.getFields();
                for (Field field : fields) {
                    String nameField = field.getName();
                    Class<?> typeField = field.getType();
                    String nameFieldWithUpperCase = nameField.substring(0, 1).toUpperCase()
                            + nameField.substring(1);
                    Object obj = null;
                    try {
                        obj = typeField.cast(hashMap.get(nameFieldWithUpperCase));
                    } catch (ClassCastException e) {
                        if (typeField.equals(Integer.class)) {
                            obj = Integer.valueOf(hashMap.get(nameFieldWithUpperCase));
                        }
                    }
                    field.set(object, obj);
                }
                return object;
            }
        } catch (Exception e) {
            return null;
        }
        return null;
    }
}
