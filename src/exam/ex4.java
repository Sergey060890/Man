package exam;
import java.text.DecimalFormat;
public class ex4 {
    public static void main(String[] args) {
        int a = 1;int maxElement = 9;int c = -1;int d = -9;int sum = 0;int sum2 = 0;double count = 0;double average = 0;
        int[][] array = new int[7][7];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0, x = array[i].length - 1; j < array[i].length; j++, x--) {
                if (i==j||i==x)
                        array[i][j] = 0;
                else if ((i==0)||(i==6)||(j>i&&j<5&&i<3)||(i>j&&i>3&&j>1))
                        array [i][j] = a + (int) (Math.random() * maxElement);
                else    array [i][j] = c + (int) (Math.random() * d);
                System.out.printf("%2d ", array[i][j]);
                sum += array[i][j];
                }
                System.out.println();
                }
                System.out.println();
                System.out.println("Сумма всех элементов: " + sum);
        if (sum >= maxElement) {
                System.out.println("В массиве нет подходящих элементов");
                return;
        } else {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (array[i][j] > sum) {
                        sum2 += array[i][j];
                        ++count;
                        average = sum2 / count;}
                }
            }
        }
        DecimalFormat dF = new DecimalFormat("#.####");
        double value = average;
                System.out.println("Cреднее арифметическое всех элементов больше " + sum + ": " + (dF.format(value)));
        }
    }

