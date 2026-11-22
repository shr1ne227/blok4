package practice20.task1_3;

public class TripleTest {
    public static void main(String[] args) {
        Triple<String, Dog, Integer> first = new Triple<>("Собака", new Dog("Шарик"), 5);
        System.out.println(first.getFirst());
        System.out.println(first.getSecond());
        System.out.println(first.getThird());
        first.printClassNames();

        Triple<Integer, Dog, Double> second = new Triple<>(10, new Dog("Бобик"), 2.5);
        System.out.println(second.getFirst());
        System.out.println(second.getSecond());
        System.out.println(second.getThird());
        second.printClassNames();
    }
}
