package practice21.task2;

public class ArrayStorageTest {
    public static void main(String[] args) {
        ArrayStorage<int[]> integers = new ArrayStorage<>(new int[]{1, 2, 3});
        ArrayStorage<long[]> longs = new ArrayStorage<>(new long[]{10L, 20L});
        ArrayStorage<double[]> doubles = new ArrayStorage<>(new double[]{1.5, 2.5});
        ArrayStorage<String[]> words = new ArrayStorage<>(new String[]{"Москва", "Минск"});

        System.out.println("int[]:");
        for (int i = 0; i < integers.getArray().length; i++) {
            System.out.println(integers.getArray()[i]);
        }
        System.out.println("long[]:");
        for (int i = 0; i < longs.getArray().length; i++) {
            System.out.println(longs.getArray()[i]);
        }
        System.out.println("double[]:");
        for (int i = 0; i < doubles.getArray().length; i++) {
            System.out.println(doubles.getArray()[i]);
        }
        System.out.println("String[]:");
        for (int i = 0; i < words.getArray().length; i++) {
            System.out.println(words.getArray()[i]);
        }
    }
}
