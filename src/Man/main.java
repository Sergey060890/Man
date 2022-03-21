package Man;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Man man = new Man("Sergey", 31, "Belarus", 1.83f);
        man.profession("Java developer");
        man.hobbies("football", "music", "travel");
        man.englishLevel("A1");
        Method method = man.getClass().getMethod("reflectionInfo", Object.class);
        Object[] arg = new Object[]{man};
        Object d = method.invoke(man, arg);
    }
}
