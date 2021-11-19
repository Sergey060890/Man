package exam;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class ex8 {
    public static <K> Map<K, Integer> countValues(K[] massive) { //Принимаем на вход массив элементов типа K
        Map<K, Integer> map = new HashMap<>();//Создаём map
        for (K k : massive) {
            map.compute(k, new BiFunction<K, Integer, Integer>() { //Используем интерфейс BiFunction( два входных параметра и один выходной)
                @Override
                public Integer apply(K k, Integer count) { //метод apply с двумя входными параметрами
                    return count == null ? 1 : count + 1;
                }
            });
        }
        return map;//Возвращаем Map<K,Integer>
    }
}
