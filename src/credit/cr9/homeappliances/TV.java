package credit.cr9.homeappliances;
public class TV extends HomeAppliances{
    private final static String name = "Телевизор";
    private final static int power = 250;
    private final static int lifeTime = 7;
    private final static String appointment = "Развлекательные и информационные устройства";

    public TV() {
        super(name, power, lifeTime, appointment);
    }
}
