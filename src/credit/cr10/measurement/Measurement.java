package credit.cr10.measurement;
import java.util.Collection;
public class Measurement{
    private Collection c;
    private long elementsCount;
    private long add;
    private long remove;
    private long contains;

    protected Measurement(Collection c, long elementsCount) {
        this.c = c;
        this.elementsCount = elementsCount;
    }

    public void measureAdd() {
        String s = " ";
        long start = System.currentTimeMillis();
        for (int i = 0; i < elementsCount; i++) {
            c.add(s + i);
        }
        long end = System.currentTimeMillis();
        add = end - start;
    }

    public void measureRemove() {
        String s = " ";
        long start = System.currentTimeMillis();
        for (int i = 0; i < elementsCount; i++) {
            c.remove(s + i);
        }
        long end = System.currentTimeMillis();
        remove = end - start;
    }

    public void measureContains() {
        String s = " ";
        long start = System.currentTimeMillis();
        for (int i = 0; i < elementsCount; i++) {
            c.contains(s + i);
        }
        long end = System.currentTimeMillis();
        contains = end - start;
    }

    public Collection getC() {
        return c;
    }

    public long getElementsCount() {
        return elementsCount;
    }

    public long getAdd() {
        return add;
    }

    public long getRemove() {
        return remove;
    }

    public long getContains() {
        return contains;
    }
}
