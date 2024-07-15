package org.example;

public class Park {

    private Attraction[] buildings;

    public class Attraction{
        private String name;
        private String time;
        private int price;

        public Attraction(int price, String time, String name) {
            this.price = price;
            this.time = time;
            this.name = name;
        }
    }
}
