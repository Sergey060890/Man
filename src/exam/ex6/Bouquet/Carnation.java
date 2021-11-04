package exam.ex6.Bouquet;
public class Carnation extends  Flower{
    private final static String name = "Гвоздика";
    private final static int life = 17;
    public Carnation(double price, Color color) {
        super(price, name, color,life);
    }
}
