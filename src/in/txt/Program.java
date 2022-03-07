package in.txt;
import java.io.*;
import java.util.Comparator;

public class Program implements Serializable {
    private String name;
    private String lastname;
    private int age;
    private String city;

    public Program(String name, String lastname, int age, String city) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLastname() {
        return lastname;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return getName() + "\t" + getLastname() + "\t" + getAge() + "\t" + getCity();
    }

    static class PersonNameComparator implements Comparator<Program> {
        public int compare(Program a, Program b) {
            return a.getName().toUpperCase().compareTo(b.getName().toUpperCase());
        }
    }

    static class PersonLastNameComparator implements Comparator<Program> {
        public int compare(Program a, Program b) {
            return a.getLastname().toUpperCase().compareTo(b.getLastname().toUpperCase());
        }
    }

    static class PersonAgeComparator implements Comparator<Program> {
        public int compare(Program a, Program b) {
            if (a.getAge() > b.getAge())
                return 1;
            else if (a.getAge() < b.getAge())
                return -1;
            else
                return 0;
        }
    }

    static class PersonCityComparator implements Comparator<Program> {
        public int compare(Program a, Program b) {
            return a.getCity().toUpperCase().compareTo(b.getCity().toUpperCase());
        }
    }
}
