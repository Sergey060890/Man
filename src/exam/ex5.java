package exam;
import java.util.*;
public class ex5 {
    public static void main(String[] args) {
        String text = "World temperatures are rising because of human activity, and climate change now threatens every aspect of human life.";
        System.out.println(text);
        text = text.trim();
        String[] words = text.replaceAll("[^a-zA-Zа-яёА-ЯЁ]", " ").toLowerCase().split("\\s+");
        Set<String> mySet = new HashSet<>();
        Collections.addAll(mySet, words);
        System.out.println("Уникальное количество слов в тексте: " + mySet.size());
    }
}

