package org.example;

public class Cat extends Animal{

    boolean feed = false;

    public Cat(String name) {
        super(name, 200, 0);
    }

    public boolean eat(Bowl bowl, int hunger) {
        if (hunger > 0) {
            feed = bowl.removeFood(hunger);
        }
        return feed;
    }

    public void isFeed() {
        if (feed) System.out.println(name+ " пока сыт");
        else System.out.println(name+ " все еще голоден");
    }


}
