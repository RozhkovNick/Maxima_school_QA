package task7;

// Программа, которая принимает имя файла и возвращает его расширение.
// Если расширение у файла определить невозможно, выбрасывает исключение.

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String fileName = "vcs.xml";
        try {
            String extension = getFileExtension(fileName);
            System.out.println("Расширение файла: " + extension);
        } catch (IllegalArgumentException e) {
            System.out.println("Не удалось определить расширение файла.");
            e.printStackTrace();
        }
    }

    public static String getFileExtension(String fileName) throws IllegalArgumentException {
        File file = new File(fileName);
        String extension = "";

        if (file.isDirectory()) {
            throw new IllegalArgumentException("Данное имя является директорией, а не файлом.");
        }
        int dotIndex = fileName.lastIndexOf(".");
        if (dotIndex != -1) {
            extension = fileName.substring(dotIndex + 1);
        } else {
            throw new IllegalArgumentException("Не удалось определить расширение файла.");
        }
        return extension;
    }
}