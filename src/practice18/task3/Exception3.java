package practice18.task3;

import java.util.Scanner;

public class Exception3 {
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
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Exception3 example = new Exception3();
        example.exceptionDemo();
    }
}
