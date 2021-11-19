package credit;
import java.io.*;
import java.text.DecimalFormat;

public class cr13 {
    private static final int countOfNumbers = 30;
    private static final int minNumber = 1;
    private static final int maxNumber = 100;

    public static void main(String[] args) {
        try {
            int sum = 0;
            double average = 0;

            DataOutputStream out = new DataOutputStream(new FileOutputStream("binary.bin"));// Создаём бинарный файл
            int[] in1 = new int[countOfNumbers];
            for (int i = 0; i < countOfNumbers; i++) {
                in1[i] = minNumber + (int) (Math.random() * maxNumber);
                out.writeInt(in1[i]);// Записываем числа в файл
                sum += in1[i];
                average = (double) sum / countOfNumbers;// Находим среднее арифметическое чисел
            }
            out.close();

            DataInputStream in = new DataInputStream(new FileInputStream("binary.bin")); // Считываем данные из файла
            System.out.print("Записанные в бинарный файл числа: ");
            int c;
            while ((c = in.read()) != -1)//Считываем из файла целочисленные значения int
                if (c != 0) {
                    System.out.print(c + " ");
                }
            DecimalFormat dF = new DecimalFormat("#.##");// Приводим значение среднего арифметического к формату
            double value = average;
            System.out.println();
            System.out.println("Среднее арифметическое записанных чисел: " + (dF.format(value)));
            in.close();
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}