package exam;
import java.util.LinkedHashMap;
import java.util.Map;
public class ex5 {
    public static void main(String[] args) {
        String text = "World temperatures are rising because of human activity, and climate change now threatens every aspect of human life.";
        System.out.println(text);
        text = text.trim();
        String[] words = text.replaceAll("[^a-zA-Zа-яёА-ЯЁ]", " ").toLowerCase().split("\\s+");
            int count = 0;
            Map<String, String> hMap = new LinkedHashMap<String, String>();
            for (int i = 0; i < words.length; i++) {
                if (!hMap.containsKey(words[i])) {
                    hMap.put(words[i],"");
                    count++;
                }
            }
            System.out.println();
            System.out.println("Уникальное количество слов в тексте: " + count);
        }
    }

