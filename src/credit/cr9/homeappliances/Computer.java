package credit.cr9.homeappliances;
public class Computer extends HomeAppliances{
    private final static String name = "Компьютер";
    private final static int power = 600;
    private final static int lifeTime = 7;
    private final static String appointment = "Развлекательные и информационные устройства";

    public Computer() {
        super(name, power, lifeTime, appointment);
    }
}
