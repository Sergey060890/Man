package exam.ex6.Bouquet;
public class Main {
    public static void main(String[] args) {
        Rouse ros1 = new Rouse(6.5, Color.Red); //Создание объектов цветов типа "Роза"
        Rouse ros2 = new Rouse(6, Color.White);
        Rouse ros3 = new Rouse(7, Color.Yellow);

        Carnation car1 = new Carnation(3, Color.Red); //Создание объектов цветов типа "Гвоздика"
        Carnation car2 = new Carnation(3.5, Color.Pink);
        Carnation car3 = new Carnation(4, Color.White);

        Tulip tul1 = new Tulip(4.5, Color.Red);//Создание объектов цветов типа "Тюльпан"
        Tulip tul2 = new Tulip(4, Color.Brown);
        Tulip tul3 = new Tulip(5, Color.Purple);

        Lily lil1 = new Lily(17, Color.White);//Создание объектов цветов типа "Лилия"
        Lily lil2 = new Lily(15.5, Color.Yellow);
        Lily lil3 = new Lily(16, Color.Pink);

        Gerbera ger1 = new Gerbera(5, Color.Red);//Создание объектов цветов типа "Гербера"
        Gerbera ger2 = new Gerbera(5.5, Color.Purple);
        Gerbera ger3 = new Gerbera(6, Color.Green);

        Bouquet bouquet = new Bouquet(); //Создание букета
        bouquet.addFlower(ros1).addFlower(ros1).addFlower(ger2).addFlower(lil2).addFlower(ger1); //Добавление в букет цветов
        System.out.println("Стоимость букета: " + bouquet.getPrice() + " " +
                declension(bouquet.getPrice(), "Price"));
        System.out.println("Используемые цвета в букете: " + bouquet.list);
        System.out.println("Букет завянет через " + bouquet.getMaxLife() + " " +
                declension(bouquet.getMaxLife(), "Days"));
    }
    public static String declension(double count, String type) { //Проверка на окончания
        String[] declension = new String[3];
        declension[0] = "";
        declension[1] = "";
        declension[2] = "";
        if (type.equals("Price")) {
            declension = new String[]{"рубль", "рубля", "рублей"};
        } else if (type.equals("Days")) {
            declension = new String[]{"день", "дня", "дней"};
        }
        if (count > 100)
            count %= 100;
        if (count > 20)
            count %= 10;
        if (count == 1.5||count == 1.0) {
            return declension[0];
        } else if (count == 2.5 || count == 3.5 || count == 4.5||count==2.0||count==3.0||count==4.0) {
            return declension[1];
        } else {
            return declension[2];
        }
    }
}