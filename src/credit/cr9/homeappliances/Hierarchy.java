package credit.cr9.homeappliances;
import java.util.*;
public class Hierarchy {
    private int generalPower;
    private HashSet<HomeAppliances> appliance = new HashSet<HomeAppliances>();
    protected List<String> list = new ArrayList<>();

    public int getGeneralPower() {
        return generalPower;
    }

    public Hierarchy addHome(HomeAppliances appliance) {
        generalPower += appliance.getSum();//Нахождение потребляемой мощности включённых приборов
        //Нахождение прибора в квартире по заданному диапазону параметров
        if (appliance.getLifeTime() > 3 && appliance.getPower() > 1200 && appliance.getAppointment() == "Уборка дома") {
            list.add(appliance.getName());
        }
        return this;
    }
}

