package practice19.task1;

import java.util.Scanner;

public class OnlineShop {
    private String[] fullNames = {
        "Иванов Иван Иванович",
        "Петров Пётр Петрович"
    };
    private String[] innNumbers = {
        "123456789047",
        "123456789159"
    };

    public void checkInn(String fullName, String inn) throws InvalidInnException {
        for (int i = 0; i < fullNames.length; i++) {
            if (fullNames[i].equals(fullName) && innNumbers[i].equals(inn)) {
                return;
            }
        }
        throw new InvalidInnException("ФИО и ИНН не совпали с записью в учебной базе.");
    }

    public void printClients() {
        System.out.println("Учебная база клиентов:");
        for (int i = 0; i < fullNames.length; i++) {
            System.out.println(fullNames[i] + ": " + innNumbers[i]);
        }
    }

    public static void main(String[] args) {
        OnlineShop shop = new OnlineShop();
        shop.printClients();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ФИО: ");
        String fullName = scanner.nextLine();
        System.out.print("Введите ИНН: ");
        String inn = scanner.nextLine();
        try {
            shop.checkInn(fullName, inn);
            System.out.println("Данные верны. Заказ оформлен.");
        } catch (InvalidInnException e) {
            System.out.println("Заказ не оформлен: " + e.getMessage());
        }
    }
}
