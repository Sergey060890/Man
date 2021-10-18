package credit;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class cr8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Pattern pattern = Pattern.compile("[!(),.:;?—\"]");
        Matcher matcher = pattern.matcher(s);
        int count = 0;
        while (matcher.find()){
            count++;
        }
        System.out.println("Общее количество знаков препинания : " + count);
    }
}
