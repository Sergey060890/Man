package exam.ex7.pair;
public class Main {
    public static void main(String[] args) {
        Pair pair = new Pair("Sergey", 31);
        pair.toString();
        System.out.println("Первый элемент: " + pair.getFirst());
        System.out.println("Второй элемент: " + pair.getLast());
        pair.swap();
        System.out.println("Меняем элементы местами: " + pair);
        System.out.println("Замена первого элемента: " + pair.replaceFirst("Egor"));//Замена первого элемента
        System.out.println("Замена второго элемента: " + pair.replaceLast(30));//Замена второго элемента
    }
}
