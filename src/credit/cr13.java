package credit;

import java.io.*;
import java.text.DecimalFormat;

public class cr13 {
    private static final byte countOfNumbers = 30;
    private static final byte minNumber = 1;
    private static final byte maxNumber = 100;

    public static void main(String[] args) {
        double sum = 0;
        double average = 0;
        FileOutputStream fos = null;

        byte[] binary = new byte[countOfNumbers];
        for (byte i = 0; i < countOfNumbers; i++) {
            binary[i] = (byte) (minNumber + (byte) (Math.random() * maxNumber));
            sum += binary[i];
            average = sum / countOfNumbers;// Находим среднее арифметическое чисел
        }

        try {
            fos = new FileOutputStream("binary.bin");
            fos.write(binary);// Записываем числа в файл
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        try (FileInputStream fin = new FileInputStream("binary.bin")) {
            System.out.println("Записанные в бинарный файл числа:");
            int i;
            while ((i = fin.read()) != -1) { //Читаем файл
                System.out.print((byte) i + " ");
            }
            DecimalFormat dF = new DecimalFormat("#.##");// Приводим значение среднего арифметического к формату
            double value = average;
            System.out.println();
            System.out.println("Среднее арифметическое записанных чисел: " + (dF.format(value)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

