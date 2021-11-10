package exam.ex7.pair;
class Pair<T, S> {
    private T first;
    private S last;

    public Pair(T firstElement, S lastElement) {
        first = firstElement;
        last = lastElement;
    }

    public void swap() {
        T temp = first;
        first = (T) last;
        last = (S) temp;
    }

    public String toString() {
        return "" + first + ", " + last + "";
    }

    public T getFirst() {
        return first;
    }

    public S getLast() {
        return last;
    }

    public <T, S> Pair<T, S> replaceFirst(T newLast) {
        return new Pair(newLast, first);
    }

    public <T, S> Pair<T, S> replaceLast(T newFirst) {
        return new Pair(last, newFirst);
    }
}




