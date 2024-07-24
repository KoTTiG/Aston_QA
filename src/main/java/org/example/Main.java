package org.example;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            taskOne();
            taskTwo();
    }

    public static void taskOne(){

        String[] array = new String[]{
            "cat",
            "fish",
            "dog",
            "apple",
            "cat",
            "black",
            "cat",
            "table",
            "word",
            "fish",
            "pain"
        };
        HashMap<String, Integer> countDuplicates = new HashMap<>();

        System.out.println("Массив с повторами");
        for (String s : array) {
            System.out.println(s);
            Integer count = countDuplicates.get(s);
            if (count == null){
                countDuplicates.put(s,1);
            } else {
                countDuplicates.put(s, count+1);
            }
        }

        Set<String> noDuplicates = new HashSet<>(Arrays.asList(array));
        System.out.println("\n Массив Без повторов");
        for (String s : noDuplicates) {
            System.out.println(s);
        }
        System.out.println("\n Количество повторений");
        for(Map.Entry<String, Integer> entry : countDuplicates.entrySet()) {
            System.out.println(entry.getKey() + " "+entry.getValue());
        }
    }

    public static void taskTwo(){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addPhone("Ivanov", "1234");
        phoneBook.addPhone("Ivanov", "12345");
        phoneBook.addPhone("Ivanov", "1236");
        phoneBook.addPhone("Petrov", "1236");

        phoneBook.findPhone("Ivanov");
        phoneBook.findPhone("Petrov");
    }
}