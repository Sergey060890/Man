package credit;
import java.math.BigInteger;
import java.util.Scanner;
public class cr4 {public static void main(String[] args) {
    System.out.println("Введите целое число: ");
    Scanner scanner = new Scanner(System.in);
    Integer a = scanner.nextInt();
    BigInteger bigInteger = BigInteger.valueOf(a);
    boolean b = bigInteger.isProbablePrime((int) Math.log(a));
    if (b==false||a <= 1)
    {
        System.out.println("Число " + a + " не является простым");
    } else
    {
        System.out.println("Число " + a + " является простым");
    }
}
}
