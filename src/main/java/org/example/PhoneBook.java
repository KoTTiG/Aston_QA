package org.example;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class PhoneBook {
    private final List<Phone> phones = new LinkedList<>();

    private static class Phone{
        String surname;
        String phone;

        public Phone(String surname, String phone) {
            this.surname = surname;
            this.phone = phone;
        }
    }

    public void findPhone(String surname){
        List<String> surnamePhones = new LinkedList<>();
        for (Phone phone : phones){
            if (Objects.equals(phone.surname, surname)){
                surnamePhones.add(phone.phone);
            }
        }
        if (surnamePhones.isEmpty()){
            System.out.println("\n Фамилии нет в справочнике");
        }
        else {
            System.out.println("\n" + surname + ":");
            for (String phone: surnamePhones){
                System.out.println(phone);
            }
        }

    }

    public void addPhone(String surname,String phone){
        phones.add(new Phone(    surname,phone));
    }
}


