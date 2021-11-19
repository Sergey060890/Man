package credit.cr10.measurement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {
        Result result = new Result(new LinkedList(), 100);//LinkedList
        result.measureAdd();
        result.measureRemove();
        result.measureContains();
        System.out.println(result.toString());
        System.out.println(result.toString1());
        System.out.println(result.toString2());
        Result result1 = new Result(new LinkedList(), 10000);
        result1.measureAdd();
        result1.measureRemove();
        result1.measureContains();
        System.out.println(result1.toString());
        System.out.println(result1.toString1());
        System.out.println(result1.toString2());
        Result result2 = new Result(new LinkedList(), 1000000);
        result2.measureAdd();
        result2.measureRemove();
        result2.measureContains();
        System.out.println(result2.toString());
        System.out.println(result2.toString1());
        System.out.println(result2.toString2());
        System.out.println();

        Result result9 = new Result(new ArrayList(), 100);//ArrayList
        result9.measureAdd();
        result9.measureRemove();
        result9.measureContains();
        System.out.println(result9.toString());
        System.out.println(result9.toString1());
        System.out.println(result9.toString2());
        Result result10 = new Result(new ArrayList(), 10000);
        result10.measureAdd();
        result10.measureRemove();
        result10.measureContains();
        System.out.println(result10.toString());
        System.out.println(result10.toString1());
        System.out.println(result10.toString2());
        Result result11 = new Result(new ArrayList(), 1000000);
        result11.measureAdd();
        result11.measureRemove();
        result11.measureContains();
        System.out.println(result11.toString());
        System.out.println(result11.toString1());
        System.out.println(result11.toString2());
        System.out.println();

        Result result3 = new Result(new HashSet(), 100);//HashSet
        result3.measureAdd();
        result3.measureRemove();
        result3.measureContains();
        System.out.println(result3.toString());
        System.out.println(result3.toString1());
        System.out.println(result3.toString2());
        Result result4 = new Result(new HashSet(), 10000);
        result4.measureAdd();
        result4.measureRemove();
        result4.measureContains();
        System.out.println(result4.toString());
        System.out.println(result4.toString1());
        System.out.println(result4.toString2());
        Result result5 = new Result(new HashSet(), 1000000);
        result5.measureAdd();
        result5.measureRemove();
        result5.measureContains();
        System.out.println(result5.toString());
        System.out.println(result5.toString1());
        System.out.println(result5.toString2());
        System.out.println();

        Result result6 = new Result(new TreeSet(), 100);//TreeSet
        result6.measureAdd();
        result6.measureRemove();
        result6.measureContains();
        System.out.println(result6.toString());
        System.out.println(result6.toString1());
        System.out.println(result6.toString2());
        Result result7 = new Result(new TreeSet(), 10000);
        result7.measureAdd();
        result7.measureRemove();
        result7.measureContains();
        System.out.println(result7.toString());
        System.out.println(result7.toString1());
        System.out.println(result7.toString2());
        Result result8 = new Result(new TreeSet(), 1000000);
        result8.measureAdd();
        result8.measureRemove();
        result8.measureContains();
        System.out.println(result8.toString());
        System.out.println(result8.toString1());
        System.out.println(result8.toString2());
        System.out.println();
    }
}
