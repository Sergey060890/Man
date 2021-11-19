package credit.cr10.measurement;
import java.util.Collection;
public class Result extends Measurement{
    private String collectionType;
    private final static String dataType = "String";
    private long elements;
    private int time;

    protected Result(Collection c, long elementsCount) {
        super(c, elementsCount);
    }

    public String toString() {
        return "Тип коллекции: " + getC().getClass().getSimpleName() + "," + " тип данных: " + dataType + ","
                + " количество элементов: " + getElementsCount()
                + "," + " операция: " + TypeOfTransaction.ADD + "," + " время: " + getAdd() + "ms";
    }

    public String toString1() {
        return "Тип коллекции: " + getC().getClass().getSimpleName() + "," + " тип данных: " + dataType + ","
                + " количество элементов: " + getElementsCount()
                + "," + " операция: " + TypeOfTransaction.REMOVE + "," + " время: " + getRemove() + "ms";
    }

    public String toString2() {
        return "Тип коллекции: " + getC().getClass().getSimpleName() + "," + " тип данных: " + dataType + ","
                + " количество элементов: " + getElementsCount()
                + "," + " операция: " + TypeOfTransaction.CONTAINS + "," + " время: " + getContains() + "ms";
    }

    public enum TypeOfTransaction {
        ADD("добавление элементов"),
        REMOVE("удаление элементов"),
        CONTAINS("поиск элементов");

        private String displayName;

        TypeOfTransaction(String displayName) {
            this.displayName = displayName;
        }

        public String displayName() {
            return displayName;
        }

        @Override
        public String toString() {
            return displayName;
        }
    }

    public String getCollectionType() {
        return collectionType;
    }

    public long getElements() {
        return elements;
    }

    public int getTime() {
        return time;
    }
}
