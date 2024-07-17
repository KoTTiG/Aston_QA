package org.example;

public interface Shape {


    default double perimeter() {
        return 0.0;
    }

    default double area() {
        return 0.0;
    }

}
