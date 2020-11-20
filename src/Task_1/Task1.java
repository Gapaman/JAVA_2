package Task_1;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        String[] vegetable = {
                "Капуста",
                "Морковь",
                "Лук",
                "Капуста",
                "Баклажан",
                "Огурец",
                "Помидор",
                "Морковь",
                "Перец",
                "Кабачок",
                "Кукуруза",
                "Огурец",
                "Баклажан",
                "Баклажан"};
        HashSet<String> unique = new HashSet<String>();
        Collections.addAll(unique, vegetable);
        System.out.println(Arrays.toString(vegetable));
        System.out.println(unique.toString());
        for (String words_count : unique) {
            System.out.println(words_count + " - " + Collections.frequency(Arrays.asList(vegetable), words_count));
        }


    }
}