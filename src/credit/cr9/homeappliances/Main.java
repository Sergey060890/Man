package credit.cr9.homeappliances;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Fridge fri = new Fridge(); //Создание обьетов бытовой техники
        ElectricKettle kettle = new ElectricKettle();
        VacuumCleaner vacuum = new VacuumCleaner();
        Computer comp = new Computer();
        Iron iron = new Iron();
        TV tv = new TV();

        tv.on();//Включаем некоторые приборы в розетку
        iron.on();
        vacuum.on();

        Hierarchy hierarchy = new Hierarchy();
        hierarchy.addHome(fri).addHome(vacuum).addHome(tv).addHome(comp).addHome(kettle).addHome(iron);
        System.out.println("Потребляемая мощность включённых приборов: " + hierarchy.getGeneralPower() + "Вт");
        System.out.println();

        HashMap<String, Integer> map = new HashMap<>();//Сортировка приборов
        System.out.println("Cортировка приборов по потребляемой мощности (Вт): ");
        map.put(fri.getName(), fri.getPower());
        map.put(kettle.getName(), kettle.getPower());
        map.put(comp.getName(), comp.getPower());
        map.put(iron.getName(), iron.getPower());
        map.put(tv.getName(), tv.getPower());
        map.put(vacuum.getName(), vacuum.getPower());
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
        System.out.println();
        System.out.println("Кухонный прибор соответствующий заданному диапазону параметров: " + hierarchy.list);
    }
}


