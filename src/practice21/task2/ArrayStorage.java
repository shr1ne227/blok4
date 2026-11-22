package practice21.task2;

public class ArrayStorage<T> {
    private T values;

    public ArrayStorage(T values) {
        this.values = values;
    }

    public T getArray() {
        return values;
    }
}
