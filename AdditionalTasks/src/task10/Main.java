package task10;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

// Возвращаем список файлов в указанной директории.

public class Main {
    public static void main(String[] args) {
        String directory = "C:\\Users\\USER";
        List<File> fileList = getFilesInDirectory(directory);

        System.out.println("Список файлов в директории " + directory + ":");
        for (File file : fileList) {
            System.out.println(file.getName());
        }
    }

    public static List<File> getFilesInDirectory(String directory) {
        File folder = new File(directory);
        File[] files = folder.listFiles();
        List<File> fileList = new ArrayList<>();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    fileList.add(file);
                }
            }
        }
        return fileList;
    }
}
