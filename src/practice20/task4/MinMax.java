package practice20.task4;

public class MinMax<T extends Comparable<T>> {
    private T[] values;

    public MinMax(T[] values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым.");
        }
        this.values = values;
    }

    public T getMin() {
        T minimum = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i].compareTo(minimum) < 0) {
                minimum = values[i];
            }
        }
        return minimum;
    }

    public T getMax() {
        T maximum = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i].compareTo(maximum) > 0) {
                maximum = values[i];
            }
        }
        return maximum;
    }
}
