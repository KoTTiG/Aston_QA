package org.example;

public class Animal {

    String name;
    int runSpeed;
    int swimSpeed;

    public Animal(String name, int runSpeed, int swimSpeed) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
    }

    public void run(int length){
        int runned = Math.min(runSpeed, length);
        if (runSpeed == 0) System.out.println(name+ " не умеет бегать");
        else System.out.println(name+ " пробежал " + runned + " метров");
    }

    public void swim(int length){
        int swimmed = Math.min(swimSpeed, length);
        if (swimSpeed == 0) System.out.println(name+ " не умеет плавать");
        else System.out.println(name+ " проплыл " + swimmed + " метров");
    }

}
