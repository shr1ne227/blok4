package practice19.task2;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<StudentInfo> {
    @Override
    public int compare(StudentInfo first, StudentInfo second) {
        if (first.getGpa() > second.getGpa()) {
            return -1;
        }
        if (first.getGpa() < second.getGpa()) {
            return 1;
        }
        return 0;
    }
}
