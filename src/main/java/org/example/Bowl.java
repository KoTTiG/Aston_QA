package org.example;

public class Bowl {
    private int food;

    public Bowl(int food) {
        this.food = food;
    }

    public void addFood(int value) {
        food += value;
    }

    public boolean removeFood(int value) {
        if (food - value >= 0) {
            food -= value;
            return true;
        } else return false;
    }
}
