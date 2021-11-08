package credit.cr9.homeappliances;
public class HomeAppliances {
    private String name;
    private int power;
    private int lifeTime;
    private String appointment;
    private int sum;
    private boolean isOn;

    public void on() {
        this.isOn = true;
        sum = power;
        System.out.print(getName() + " включён");
        System.out.println();
    }

    protected HomeAppliances(String name, int power, int lifeTime, String appointment) {
        this.name = name;
        this.power = power;
        this.lifeTime = lifeTime;
        this.appointment = appointment;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getLifeTime() {
        return lifeTime;
    }

    public String getAppointment() {
        return appointment;
    }

    public int getSum() {
        return sum;
    }
}
