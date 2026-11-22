package practice21.task1;

import java.util.ArrayList;
import java.util.List;

public class ArrayToList {
    public static <T> List<T> toList(T[] values) {
        List<T> result = new ArrayList<>();
        for (int i = 0; i < values.length; i++) {
            result.add(values[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words = {"Москва", "Минск", "Казань"};
        Integer[] integers = {1, 2, 3};
        Double[] doubles = {1.5, 2.5, 3.5};
        System.out.println(toList(words));
        System.out.println(toList(integers));
        System.out.println(toList(doubles));
    }
}
