package credit;
import java.util.Scanner;
public class cr6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();}
        int max;
        max = array[0];
        for (int i=0;i < array.length;i++){
            if (array[i]> max){
                max = array[i];
            }
        }
        int min;
        min = array[0];
        for (int i=0;i < array.length;i++){
            if (array[i]< min){
                min = array[i];
            }
        }
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);
    }
}
