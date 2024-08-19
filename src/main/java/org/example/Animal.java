package org.example;

public abstract class Animal {

    protected  String name;
    protected  int runSpeed;
    protected  int swimSpeed;

    public Animal(String name, int runSpeed, int swimSpeed) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
    }

    abstract public void run(int length);

    abstract public void swim(int length);

}
