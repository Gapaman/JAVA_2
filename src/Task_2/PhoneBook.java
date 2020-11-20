package Task_2;

import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {
    private HashMap<String, HashSet<String>> book;

    public PhoneBook() {
        book = new HashMap<>();
    }

    public void add(String name, String phone_number) {
        HashSet<String> phone_numbers = book.getOrDefault(name, new HashSet<>());
        phone_numbers.add(phone_number);
        book.put(name, phone_numbers);
        System.out.println(name+" добавлен в книгу. Номер - "+phone_number);
    }

    public void get(String name) {
        if (book.containsKey(name)){
            System.out.println(name + "-"+ book.get(name));
        }else {
            System.out.println("Номера "+name+" нет");
        }
    }

}
