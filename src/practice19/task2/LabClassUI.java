package practice19.task2;

import java.util.Scanner;

public class LabClassUI {
    private LabClass lab;

    public LabClassUI(LabClass lab) {
        this.lab = lab;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("1 — список, 2 — сортировка по баллу, 3 — поиск, 0 — выход");
            System.out.print("Выберите действие: ");
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        lab.printStudents();
                        break;
                    case 2:
                        lab.sortByGpa();
                        lab.printStudents();
                        break;
                    case 3:
                        System.out.print("Введите ФИО полностью: ");
                        System.out.println(lab.findStudent(scanner.nextLine()));
                        break;
                    case 0:
                        running = false;
                        break;
                    default:
                        System.out.println("Такого пункта меню нет.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Нужно ввести номер пункта меню.");
            } catch (EmptyStringException e) {
                System.out.println(e.getMessage());
            } catch (StudentNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
