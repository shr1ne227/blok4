package practice18.task1;

public class Exception1 {
    public void exceptionDemo() {
        int zero = 0;
        try {
            System.out.println(2 / zero);
        } catch (ArithmeticException e) {
            System.out.println("Целое число нельзя делить на ноль.");
        }
        System.out.println("Деление double на ноль: " + 2.0 / 0.0);
    }

    public static void main(String[] args) {
        Exception1 example = new Exception1();
        example.exceptionDemo();
    }
}
