package credit;
import java.text.DecimalFormat;
import java.util.Scanner;
public class cr1 {
    public static void main(String[] args) {
        System.out.println("Введите размер отверстия 'a': ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.println("Введите размер отверстия 'b': ");
        double b = scanner.nextDouble();
        System.out.println("Введите радиус 'r': ");
        double r = scanner.nextDouble();
        DecimalFormat dF = new DecimalFormat("#.##");
        double value = a;
        double value1 = b;
        double value2 = r;
        if ((r * 3.14 * 2) >= (2 * (a + b))) {
            System.out.println("Картонка с радиусом " + (dF.format(value2)) + " закрывает полностью отверстие размером " +
                    (dF.format(value)) + " на " + (dF.format(value1)));
        } else {
            System.out.println("Картонка с радиусом " + (dF.format(value2)) + " не закрывает полностью отверстие размером " +
                    (dF.format(value)) + " на " + (dF.format(value1)));
        }
    }
}
