package practice21.task3;

public class ArrayElement {
    public static <T> T getElement(T[] values, int index) {
        if (index < 0 || index >= values.length) {
            throw new IndexOutOfBoundsException("Нет элемента с индексом " + index);
        }
        return values[index];
    }

    public static void main(String[] args) {
        String[] words = {"Москва", "Минск", "Казань"};
        Integer[] numbers = {10, 20, 30};
        System.out.println("Строка с индексом 1: " + getElement(words, 1));
        System.out.println("Число с индексом 2: " + getElement(numbers, 2));
        try {
            System.out.println(getElement(numbers, 3));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
