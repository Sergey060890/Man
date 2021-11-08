package credit.cr9.homeappliances;
public class VacuumCleaner extends HomeAppliances {
    private final static String name = "Пылесос";
    private final static int power = 1800;
    private final static int lifeTime = 5;
    private final static String appointment = "Уборка дома";

    public VacuumCleaner() {
        super(name, power, lifeTime, appointment);
    }
}
