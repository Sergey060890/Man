package exam.ex6.Bouquet;
public class Flower {
    private final double price;
    private final String name;
    private Color color;
    private final int life;
    protected Flower(double price, String name, Color color,int life) {
        if (price < 0) {
            throw new IllegalArgumentException("Цена не может быть меньше нуля");//Проверка на правильный ввод цены
        }
        this.price = price;
        this.name = name;
        this.color = color;
        this.life = life;
    }
    public double getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public Color getColor() {
        return color;
    }
    public int getLife(){
        return life;
    }
}

