package exam.ex7.pair;
public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Sergey", 31);
        System.out.println("Возврат первого элемента: " + pair.getFirst());
        System.out.println("Возврат второго элемента: " + pair.getLast());
        System.out.println("Меняем элементы местами: " + pair.swap());
        System.out.println("Замена первого элемента на новый: " + pair.replaceFirst("Egor"));
        System.out.println("Замена второго элемента на новый: " + pair.replaceLast(32));
    }
}
