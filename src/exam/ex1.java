package exam;
import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        System.out.println("Введите количество секунд: ");
        Scanner scanner = new Scanner(System.in);
        long tot_seconds = scanner.nextLong();
        long hours = tot_seconds / 3600;
        long minutes = (tot_seconds % 3600) / 60;
        long seconds = tot_seconds % 60;
        if (hours == 0&&minutes>0&&seconds>0) {
            System.out.println(minutes + " " + declension(minutes, "Minutes") + " " + seconds + " " +
                    declension(seconds, "Seconds"));
        }
        else if (minutes==0&&hours>0&&seconds>0) {
            System.out.println(hours + " " + declension(hours, "Hour")+ " " + seconds + " "
                    + declension(seconds, "Seconds"));
        } else if (seconds==0&&hours>0&minutes>0) {
            System.out.println(hours + " " + declension( hours, "Hour")+ " " + minutes + " "
                    + declension( minutes, "Minutes"));
        } else if (minutes==0&&hours==0) {
            System.out.println(seconds + " " + declension( seconds, "Seconds"));
        } else if (minutes==0&&seconds==0) {
            System.out.println(hours + " " + declension(hours, "Hour"));
        } else if (hours==0&&seconds==0) {
            System.out.println(minutes + " " + declension( minutes, "Minutes"));
        } else {
            System.out.println(hours + " " + declension( hours, "Hour")+ " " + minutes + " "
                    + declension(minutes,"Minutes")+ " "+ seconds + " " + declension(seconds, "Seconds"));
        }
        long week = tot_seconds / 604800;
        long days = (tot_seconds % 604800) / 86400;
        long hours1 = (tot_seconds % 86400) / 3600;
        long minutes1 = (tot_seconds % 3600) / 60;
        long seconds1 = tot_seconds % 60;
        System.out.println(week + " " + declension(week, "Week") + " " + days + " " +
                declension(days, "Days") + " " + hours1 + " " + declension(hours1, "Hour") + " "
                + minutes1 + " " + declension(minutes1, "Minutes") + " " + seconds1 + " " +
                declension(seconds1, "Seconds"));
    } public static String declension ( long count, String type){
        String one = "";
        String two = "";
        String five = "";
        if (type.equals("Week")) {
            one = "неделя";
            two = "недели";
            five = "недель";
        } else if (type.equals("Days")) {
            one = "день";
            two = "дня";
            five = "дней";
        } else if (type.equals("Hour")) {
            one = "час";
            two = "часа";
            five = "часов";
        } else if (type.equals("Minutes")) {
            one = "минута";
            two = "минуты";
            five = "минут";
        } else if (type.equals("Seconds")) {
            one = "секунда";
            two = "секунды";
            five = "секунд";
        }
        if (count > 100)
            count %= 100;
        if (count > 20)
            count %= 10;
        if (count==1)
        {
            return one;
        }
        else if(count==2||count==3||count==4)
        {
            return two;
        }
        else
        {
            return five;
        }
    }
}
