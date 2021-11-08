package credit.cr9.homeappliances;
public class Iron extends HomeAppliances{
    private final static String name = "Утюг";
    private final static int power = 1200;
    private final static int lifeTime = 6;
    private final static String appointment = "Уход за одеждой";

    public Iron() {
        super(name, power, lifeTime, appointment);
    }
}
