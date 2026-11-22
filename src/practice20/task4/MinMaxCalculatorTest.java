package practice20.task4;

public class MinMaxCalculatorTest {
    public static void main(String[] args) {
        Integer[] integers = {5, -2, 9, 1, 9};
        MinMax<Integer> integerValues = new MinMax<>(integers);
        System.out.println("Минимум целых: " + integerValues.getMin());
        System.out.println("Максимум целых: " + integerValues.getMax());

        Double[] doubles = {2.5, -1.5, 7.0};
        MinMax<Double> doubleValues = new MinMax<>(doubles);
        System.out.println("Минимум дробных: " + doubleValues.getMin());
        System.out.println("Максимум дробных: " + doubleValues.getMax());

        String[] words = {"Москва", "Минск", "Казань"};
        MinMax<String> stringValues = new MinMax<>(words);
        System.out.println("Минимальная строка: " + stringValues.getMin());
        System.out.println("Максимальная строка: " + stringValues.getMax());

        System.out.println("Сумма: " + Calculator.sum(10, 2.5));
        System.out.println("Произведение: " + Calculator.multiply(4L, 1.5f));
        System.out.println("Частное: " + Calculator.divide(7, 2.0));
        System.out.println("Разность: " + Calculator.subtraction(10.5, 3L));
        try {
            System.out.println(Calculator.divide(5, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
