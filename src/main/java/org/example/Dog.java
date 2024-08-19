package org.example;

public class Dog extends Animal {

    public Dog(String name) {
        super(name, 500, 10);
    }

    @Override
    public void run(int length) {
        int runned = Math.min(runSpeed, length);
        System.out.println(name+ " пробежал " + runned + " метров");
    }

    @Override
    public void swim(int length) {
        int swimmed = Math.min(swimSpeed, length);
        System.out.println(name+ " проплыл " + swimmed + " метров");

    }
}
