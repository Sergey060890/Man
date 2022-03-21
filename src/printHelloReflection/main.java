package printHelloReflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        PrintHello printHello = new PrintHello();
        Class c = printHello.getClass();
        //Class[] paramTypes = new Class[] { String.class, int.class }; если нужно указываем входные данные
        Method method = c.getMethod("printHelloWorld"); //имя метода и параметры если они есть
        Object[] arg = new Object[] { new String() };//выходные данные
        Double d = (Double) method.invoke(printHello, args);
    }
}
