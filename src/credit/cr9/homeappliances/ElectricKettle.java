package credit.cr9.homeappliances;
public class ElectricKettle extends HomeAppliances{
    private final static String name = "Электрический чайник";
    private final static int power = 1300;
    private final static int lifeTime = 3;
    private final static String appointment = "Приготовление и хранение пищи";

    public ElectricKettle() {
        super(name, power, lifeTime, appointment);
    }
}
