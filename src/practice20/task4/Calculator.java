package practice20.task4;

public class Calculator {
    public static <T extends Number, K extends Number> double sum(T first, K second) {
        return first.doubleValue() + second.doubleValue();
    }

    public static <T extends Number, K extends Number> double multiply(T first, K second) {
        return first.doubleValue() * second.doubleValue();
    }

    public static <T extends Number, K extends Number> double divide(T first, K second) {
        if (second.doubleValue() == 0) {
            throw new ArithmeticException("Деление на ноль.");
        }
        return first.doubleValue() / second.doubleValue();
    }

    public static <T extends Number, K extends Number> double subtraction(T first, K second) {
        return first.doubleValue() - second.doubleValue();
    }
}
