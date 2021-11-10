package exam.ex7.pair;
public class Main {
    public static void main(String[] args) {
        Pair pair = new Pair("Sergey", 31);
        pair.toString();
        System.out.println("Возврат первого элемента: " + pair.getFirst());
        System.out.println("Возврат второго элемента: " + pair.getLast());
        pair.swap();
        System.out.println("Меняем элементы местами: " + pair);
        System.out.println("Замена первого элемента на новый: " + pair.replaceFirst("Egor"));
        System.out.println("Замена второго элемента на новый: " + pair.replaceLast(32));
    }
}
