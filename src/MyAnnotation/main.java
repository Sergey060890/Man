package MyAnnotation;

import java.lang.reflect.Method;

public class main {
    public static void main(String[] args) {
        Meta ob = new Meta();
        try {
            // сначала получить объект типа Class,
            // представляющий данный класс
            Class<?> c = ob.getClass();
            // затем получить объект типа Method,
            // представляющий данный метод
            Method m = c.getMethod("myMeth");
            // далее получить аннотацию для данного класса
            AcademyInfo anno = m.getAnnotation(AcademyInfo.class);

            if (anno == null) {
                System.out.println("В методе нет данной аннотации"); // и наконец, вывести значения членов аннотации
            } else {
                System.out.println(anno);
                System.out.println(anno.str() + " " + anno.year());
            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        System.out.println();
        try {
            // сначала получить объект типа Class,
            // представляющий данный класс
            Class<?> c = ob.getClass();
            // затем получить объект типа Method,
            // представляющий данный метод
            Method m = c.getMethod("myMethTwo");
            // далее получить аннотацию для данного класса
            AcademyInfo anno = m.getAnnotation(AcademyInfo.class);

            if (anno == null) {
                System.out.println("В методе нет данной аннотации"); // и наконец, вывести значения членов аннотации
            } else {
                System.out.println(anno);
                System.out.println(anno.str() + " " + anno.year());
            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
