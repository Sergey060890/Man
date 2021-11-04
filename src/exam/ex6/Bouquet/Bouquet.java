package exam.ex6.Bouquet;
import java.util.*;
public class Bouquet {
    private double price;
    private int maxLife = 0;
    private List<Flower> flowers = new ArrayList<Flower>();
    protected List<String> list = new ArrayList<>();
    public double getPrice() {
        return price;
    }
    public int getMaxLife() {
        return maxLife;
    }

    public Bouquet addFlower(Flower flower) {
        flowers.add(flower); //Добавляем цветы в коллекцию
        price += flower.getPrice();//Находим общую стоимость букета

        if (flower.getLife() > maxLife) {//Находим когда полностью завянет букет
            maxLife = flower.getLife();}

        list.add(String.valueOf(flower.getColor()));//Определяем цвета используемые в букете
        for (int i = 0; i < list.size(); i++) {
        }

        Set<String> s = new LinkedHashSet<>(list);;//Удаляем повторяющиеся элементы (цвета)
        list.clear();
        list.addAll(s);
        return this;
    }
}



