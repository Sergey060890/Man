package exam.ex7.pair;

class Pair<T, S> {
    private T first;
    private S last;

    public Pair(T firstElement, S lastElement) {
        first = firstElement;
        last = lastElement;
    }

    public String toString() {
        return "" + first + ", " + last + "";
    }

    public Pair<T, S> swap() {
        return new Pair(last, first);
    }

    public T getFirst() {
        return first;
    }

    public S getLast() {
        return last;
    }

    public <G>Pair<T, S> replaceFirst(G newFirst) {
        return new Pair(newFirst, last);
    }

    public <F>Pair<T, S> replaceLast(F newLast) {
        return new Pair(first, newLast);
    }
}




