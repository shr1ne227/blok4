package practice19.task2;

public class LabClassDriver {
    public static void main(String[] args) {
        StudentInfo[] students = {
            new Student("Иванов Иван Иванович", 4.2),
            new Student("Петрова Анна Сергеевна", 4.9),
            new Student("Сидоров Пётр Алексеевич", 3.7),
            new Student("Кузнецова Мария Андреевна", 4.6)
        };
        LabClass lab = new LabClass(students);
        LabClassUI ui = new LabClassUI(lab);
        ui.run();
    }
}
