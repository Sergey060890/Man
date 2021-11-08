package credit.cr9.homeappliances;
public class Fridge extends HomeAppliances{
    private final static String name = "Холодильник";
    private final static int power = 400;
    private final static int lifeTime = 10;
    private final static String appointment = "Приготовление и хранение пищи";
    private boolean isOn = false;

    public Fridge() {
        super(name, power, lifeTime, appointment);
    }
}
