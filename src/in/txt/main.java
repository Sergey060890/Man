package in.txt;
import java.io.*;
import java.util.*;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException {
        File file = new File("in.txt");
        try (Scanner sc = new Scanner(new FileInputStream(file))) {//считывание с файла
            List<Program> dataBeans = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                dataBeans.add(i, new Program(sc.next(), sc.next(), sc.nextInt(), sc.next()));
            }
            System.out.println("До сортировки:");
            for (Program s : dataBeans) {
                System.out.println(s);
            }
            System.out.println();

            Program.PersonNameComparator pers = new Program.PersonNameComparator();//создаём компораторы
            Program.PersonLastNameComparator last = new Program.PersonLastNameComparator();
            Program.PersonAgeComparator age = new Program.PersonAgeComparator();
            Program.PersonCityComparator city = new Program.PersonCityComparator();

            Collections.sort(dataBeans, pers.thenComparing(last).thenComparing(age).thenComparing(city));//сортировка

            System.out.println("После сортировки:");
            for (Program s : dataBeans) {
                System.out.println(s);
            }

            BufferedWriter writer = new BufferedWriter(new FileWriter("out.txt"));//запись в файл
            for (Program s : dataBeans) {
                writer.write((s) + " ");
                writer.write("\r\n");
            }
            writer.flush();
        }
    }
}