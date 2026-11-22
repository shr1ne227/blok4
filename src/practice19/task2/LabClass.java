package practice19.task2;

import java.util.Comparator;

public class LabClass {
    private StudentInfo[] students;

    public LabClass(StudentInfo[] students) {
        this.students = students;
    }

    public void printStudents() {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }

    public StudentInfo findStudent(String fullName)
            throws EmptyStringException, StudentNotFoundException {
        if (fullName.length() == 0) {
            throw new EmptyStringException("ФИО не должно быть пустым.");
        }
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFullName().equals(fullName)) {
                return students[i];
            }
        }
        throw new StudentNotFoundException("Студент " + fullName + " не найден.");
    }

    public void sortByGpa() {
        quickSort(0, students.length - 1, new SortingStudentsByGPA());
    }

    private void quickSort(int left, int right, Comparator<StudentInfo> comparator) {
        if (left >= right) {
            return;
        }
        int i = left;
        int j = right;
        StudentInfo pivot = students[(left + right) / 2];
        while (i <= j) {
            while (comparator.compare(students[i], pivot) < 0) {
                i++;
            }
            while (comparator.compare(students[j], pivot) > 0) {
                j--;
            }
            if (i <= j) {
                StudentInfo temporary = students[i];
                students[i] = students[j];
                students[j] = temporary;
                i++;
                j--;
            }
        }
        if (left < j) {
            quickSort(left, j, comparator);
        }
        if (i < right) {
            quickSort(i, right, comparator);
        }
    }
}
