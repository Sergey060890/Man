package credit;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class cr12 {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("file.txt", false))// Создаём текстовый файл
        {
            String text = "Finland missed out on a play-off spot for the World Cup finals as goals " +
                    "from Karim Benzema and Kylian Mbappe gave France victory in Helsinki.\n" +
                    "Finland began the night second in the group but the defeat saw them overtaken by Ukraine," +
                    " who won 2-0 against Bosnia-Herzegovina." +
                    "\n" + "Substitute Benzema combined with Mbappe for the opening goal for France," +
                    " who had already sealed top spot in Group D." +
                    "\n" + "In-form Mbappe then scored his fifth goal of this international break." +
                    "\n" + "His strike in Helsinki followed his four-goal performance in the 8-0 win against Kazakhstan on Saturday" +
                    " that sealed his side's progress to the finals in Qatar.";
            text = text.trim().replaceAll("\\s{2,}", " ");
            writer.write(text);// Записываем в файл текст
            writer.flush();// Сбрасываем содержимое в файл
            try (FileReader reader = new FileReader("file.txt"))// Читаем файл
            {
                System.out.println("Текст: ");
                int c;
                while ((c = reader.read()) != -1) {
                    System.out.print((char) c);
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            System.out.println();

            Pattern pattern = Pattern.compile("[!(),.:;?—\"]");// Считаем количество знаков препинания в тексте
            Matcher matcher = pattern.matcher(text);
            int count = 0;
            while (matcher.find()) {
                count++;
            }
            System.out.println();
            System.out.println("Количество знаков препинания в тексте : " + count);

            File file = new File("file.txt");// Считаем количество слов в тексте
            try (Scanner sc = new Scanner(new FileInputStream(file))) {
                int count1 = 0;
                while (sc.hasNext()) {
                    sc.next();
                    count1++;
                }
                System.out.println("Количество слов в тексте: " + count1);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}