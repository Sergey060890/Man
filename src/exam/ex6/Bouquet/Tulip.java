package exam.ex6.Bouquet;
public class Tulip extends Flower{
    private final static String name = "Тюльпан";
    private final static int life = 4;
    public Tulip(double price, Color color) {
        super(price, name, color,life);
    }
}
