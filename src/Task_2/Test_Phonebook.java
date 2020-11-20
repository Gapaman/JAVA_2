package Task_2;

import Task_2.PhoneBook;

public class Test_Phonebook {
    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();
        book.add("Петров", "99887867554");
        book.add("Николаенко", "3246576");
        book.add("Шульженко", "687656");
        book.add("Носов", "878674656");
        book.add("Польский", "677677676");
        book.add("Дашко", "78877644");
        book.add("Польский", "7755434");
        System.out.println("  ________________________________________");

        book.get("Шульженко");
        book.get("Польский");
        book.get("Дорошенко");}}