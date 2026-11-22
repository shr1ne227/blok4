package practice18.task4;

import java.util.Scanner;

public class Exception4 {
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
        } finally {
            System.out.println("Блок finally выполнен.");
        }
    }

    public static void main(String[] args) {
        Exception4 example = new Exception4();
        example.exceptionDemo();
    }
}
