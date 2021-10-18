package credit;
import java.util.Arrays;
public class cr7 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length;i++) {
            numbers[i] = (int) (Math.random() * 101-50);
        }
        reverse(numbers);
    }
    public static void reverse(int[] input) {
        System.out.println("Оригинальный массив : " +  Arrays.toString(input));
        for (int i = 0; i < input.length / 2; i++) {
            int temp = input[i];
            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = temp;
        }
        System.out.println("Перевёрнутый массив : " + Arrays.toString(input));
        }
    }

