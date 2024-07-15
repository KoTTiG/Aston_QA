package org.example;


public class Main {
    public static void main(String[] args) {

        Employee adam = new Employee("Adam", "QA", "a@a.a", "1234", 30_000, 20);
        adam.printInfo();

        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Adam", "QA", "a@a.a", "1234", 30_000, 20);
        empArray[1] = new Employee("Jhon", "Engineer", "j@a.a", "1235", 70_000, 22);
        empArray[2] = new Employee("Robbert", "Dev", "r@a.a", "1236", 60_000, 21);
        empArray[3] = new Employee("Sam", "Dev", "s@a.a", "1237", 20_000, 25);
        empArray[4] = new Employee("Rick", "QA", "ri@a.a", "1238", 300_000, 24);


    }
}