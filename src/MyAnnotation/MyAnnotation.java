package MyAnnotation;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Объявление типа аннотации
@Retention(RetentionPolicy.RUNTIME)
@interface AcademyInfo {
    String str();
    int year();
}

class Meta {

    @AcademyInfo(str = "Пример аннотации:", year = 2022)
    public static void myMeth() {

    }

    public  static void myMethTwo(){

    }
}

