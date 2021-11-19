package credit.cr11.stackwithmax;
public class Main {
    public static void main(String[] args) {
        StackWithMax stack = new StackWithMax();
        stack.push(1);//добавляем элементы на верх стека
        stack.push(3);
        stack.push(4);
        stack.push(2);
        stack.push(5);
        stack.pop();//удаляем верхний элемент стека
        System.out.println("Максимальный элемент стека: " + stack.max());
    }
}
