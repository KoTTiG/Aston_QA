package org.example;

public class Employee {
    private String name;
    private String job;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String job, String email, String phone, int salary, int age) {
        this.name = name;
        this.job = job;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo(){

        System.out.println("Имя сотрудника:" + this.name + "\n" +
                "Должность сотрудника:" + this.job + "\n" +
                "Почтовый адресс:" + this.email + "\n" +
                "Телефон:" + this.phone + "\n" +
                "Зарплата:" + this.salary + "\n" +
                "Возраст:" + this.age);
    }

    public String getName() {
        return name;
    }
}
