package practice21.task4;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DirectoryList {
    public static List<String> readDirectory(String path) {
        File directory = new File(path);
        String[] names = directory.list();
        if (names == null) {
            throw new IllegalArgumentException("Каталог не найден или недоступен для чтения.");
        }
        List<String> result = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            result.add(names[i]);
        }
        return result;
    }

    public static void printFirstFive(List<String> names) {
        for (int i = 0; i < names.size() && i < 5; i++) {
            System.out.println(names.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите путь к каталогу (. — текущая папка): ");
        String path = scanner.nextLine();
        try {
            List<String> names = readDirectory(path);
            System.out.println("Всего элементов: " + names.size());
            System.out.println("Первые пять элементов (или все, если их меньше):");
            printFirstFive(names);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
