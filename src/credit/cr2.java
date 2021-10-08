package credit;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class cr2 {
    public static void main(String[] args) {
        System.out.println("Введите день: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Введите месяц: ");
        int b = scanner.nextInt();
        System.out.println("Введите год: ");
        int c = scanner.nextInt();
        b=b-1;
        Calendar date = new GregorianCalendar(c, b, a);
        SimpleDateFormat dateFormat = new SimpleDateFormat("d.M.yyyy");
        Calendar d = date;
        d.add(Calendar.DATE, +1);
        System.out.println (dateFormat.format (d.getTime ()));
    }
}
