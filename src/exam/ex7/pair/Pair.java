package exam.ex7.pair;
public class Pair<T> {
    private T name;
    private T age;

    public Pair(T firstElement, T lastElement) {
        name = firstElement;
        age = lastElement;
    }

    public T getFirst() {
        return name;
    }

    public T getLast() {
        return age;
    }

    public void swap() {
        T temp = name;
        name = age;
        age = temp;
    }

    public String toString() {
        return "" + name + " " + age + "";
    }

    public <T> Pair<T> replaceFirst(T newName) {
        return new Pair(newName, name);
    }

    public <T> Pair<T> replaceLast(T newAge) {
        return new Pair(age, newAge);
    }
}

