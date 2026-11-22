package practice18.task2;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        String text = scanner.nextLine();
        try {
            int number = Integer.parseInt(text);
            System.out.println("2 / " + number + " = " + 2 / number);
        } catch (NumberFormatException e) {
            System.out.println("Введено не целое число.");
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль.");
        }
    }

    public static void main(String[] args) {
        Exception2 example = new Exception2();
        example.exceptionDemo();
    }
}
