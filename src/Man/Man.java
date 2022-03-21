package Man;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Man {
    private String name;
    private int age;
    private String country;
    private float height;

    public Man(String name, int age, String country, float height) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.height = height;
    }

    public void profession(String prof) {
        System.out.println(getFirstname() + " from " + getCountry() + " works as a " + prof);
    }

    public void hobbies (String hobbiesOne, String hobbiesTwo, String hobbiesThree) {
        System.out.println(getFirstname() + " has a hobby: " + hobbiesOne + ", " + hobbiesTwo + ", " + hobbiesThree);
    }

    public void englishLevel(String eng) {
        switch (eng){
            case "A0":
                System.out.println(getFirstname() + ", " + "you still have everything ahead!");
                break;
            case "A1":
                System.out.println(getFirstname() + ", " + "you are on the right track! Keep it up!");
                break;
            case "A2":
                System.out.println(getFirstname() + ", " + "you definitely go to the goal and it is worthy of respect!");
                break;
            case "B1":
                System.out.println(getFirstname() + ", " + "we are clearly on the way! You have already achieved a lot!");
                break;
            case "B2":
                System.out.println(getFirstname() + ", " + "a little more and you will become a real professional!");
                break;
            case "C1":
                System.out.println(getFirstname() + ", " + "you are a true master! It's a pleasure to do business with you!");
                break;
            case "C2":
                System.out.println(getFirstname() + ", " + "are you from London by any chance?) Your pronunciation is just perfect!");
                break;
            default:
                System.out.println("Answer options: A0 , A1 , A2 , B1 , B2 , C1 , C2");
        }
    }

    public void reflectionInfo(Object obj){
        System.out.println();
        System.out.println("Class information:");
        String s = obj.getClass().getName();
        System.out.println("Class name: " + s);
        System.out.println("------------------------");
        System.out.println("Сlass field information:");
        System.out.println("------------------------");
        Class cl = obj.getClass();
        Field[] publicFields = cl.getDeclaredFields();
        for (Field field : publicFields) {
            Class fieldType = field.getType();
            System.out.println("name: " + field.getName());
            System.out.println("type: " + fieldType.getName());
            System.out.println();
        }

        System.out.println("Method information:");
        System.out.println("-------------------");
        Class c = obj.getClass();
        Method[] methods = c.getMethods();
        for (Method method : methods) {
            System.out.println("method name: " + method.getName());
            System.out.println("return type: " + method.getReturnType().getName());

            Class[] paramTypes = method.getParameterTypes();
            System.out.print("parameter types: ");
            for (Class paramType : paramTypes) {
                System.out.print(" " + paramType.getName());
            }
            System.out.println();
            System.out.println();
        }
        System.out.println();
        System.out.println("Information about constructors:");
        System.out.println("------------------------------");
        Constructor[] constructors = c.getConstructors();
        for (Constructor constructor : constructors) {
            Class[] paramTypes = constructor.getParameterTypes();
            System.out.print("Constructor: ");
            for (Class paramType : paramTypes) {
                System.out.print(paramType.getName() + ", ");
            }
            System.out.println();
        }


    }

    public String getFirstname() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public float getHeight() {
        return height;
    }
}
