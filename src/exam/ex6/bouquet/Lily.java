package exam.ex6.bouquet;
public class Lily extends Flower{
    private final static String name = "Лилия";
    private final static int life = 10;
    public Lily(double price, Color color) {
        super(price, name, color,life);
    }
}
