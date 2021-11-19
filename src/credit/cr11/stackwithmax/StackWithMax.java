package credit.cr11.stackwithmax;

import java.util.Stack;

public class StackWithMax extends Stack<NodeWithMax> {
    public void push(int value) {// push с отслеживанием максимального элемента
        int newMax = Math.max(value, max());
        super.push(new NodeWithMax(value, newMax));
    }

    public int max() {// нахождение максимального элемента за О(1)
        if (this.isEmpty()) {
            return Integer.MIN_VALUE;
        } else {
            return peek().max;
        }
    }
}
