package exam;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
public class ex9 {
    private static final int countOfNumbers = 1000;
    private static final int sortedNumbers = 2000;
    private static final int minNumber = 1;
    private static final int maxNumber = 100000;

    public static void main(String[] args) {
        File file = new File("in1.txt");//Создаём первый файл и используя массив записываем в него числа
        int[] in1 = new int[countOfNumbers];
        try (FileWriter writer = new FileWriter(file)) {
            for (int i = 0; i < countOfNumbers; i++) {
                in1[i] = minNumber + (int) (Math.random() * maxNumber);
                writer.write(in1[i] + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file1 = new File("in2.txt");//Создаём второй файл и используя массив записываем в него числа
        int[] in2 = new int[countOfNumbers];
        try (FileWriter writer = new FileWriter(file1)) {
            for (int i = 0; i < countOfNumbers; i++) {
                in2[i] = minNumber + (int) (Math.random() * maxNumber);
                writer.write(in2[i] + " ");
            }
        } catch (IOException f) {
            f.printStackTrace();
        }

        int[] sort = new int[in1.length + in2.length];//Создаём третий массив из первых двух и сортируем в нём числа
        System.arraycopy(in1, 0, sort, 0, in1.length);
        System.arraycopy(in2, 0, sort, in1.length, in2.length);
        Arrays.sort(sort);

        File file2 = new File("out.txt");//Создаём третий файл в который записываем все отсортированные числа
        try (FileWriter writer = new FileWriter(file2)) {
            for (int i = 0; i < sortedNumbers; i++) {
                writer.write(sort[i] + " ");
            }
        } catch (IOException g) {
            g.printStackTrace();
        }
    }
}


