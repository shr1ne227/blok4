package practice19.task2;

public class Student implements StudentInfo {
    private String fullName;
    private double gpa;

    public Student(String fullName, double gpa) {
        this.fullName = fullName;
        this.gpa = gpa;
    }

    @Override
    public String getFullName() {
        return fullName;
    }

    @Override
    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return fullName + ", средний балл: " + gpa;
    }
}
