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
        String[] declension = new String[3];
        declension[0] = "";
        declension[1] = "";
        declension[2] = "";
        if (type.equals("Week")) {
            declension = new String[]{"неделя","недели","недель"};
        } else if (type.equals("Days")) {
            declension = new String[]{"день","дня","дней"};
        } else if (type.equals("Hour")) {
            declension = new String[]{"час","часа","часов"};
        } else if (type.equals("Minutes")) {
            declension = new String[]{"минута","минуты","минут"};
        } else if (type.equals("Seconds")) {
            declension = new String[]{"секунда","секунды","секунд"};
        }
        if (count > 100)
            count %= 100;
        if (count > 20)
            count %= 10;
        if (count==1)
        {
            return declension[0];
        }
        else if(count==2||count==3||count==4)
        {
            return declension[1];
        }
        else
        {
            return declension[2];
        }
    }
}
