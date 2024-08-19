package org.example;

public class Rectangle extends Shape {

    private final int a;
    private final int b;
    private final int h;

    public Rectangle(String borderColor, String fillColor, int a, int b, int h) {
        this.borderColor = borderColor;
        this.fillColor = fillColor;
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public double getArea() {
        return a * h;
    }

    @Override
    public double getPerimeter() {
        return (a + b) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "fillColor='" + fillColor + '\'' +
                ", borderColor='" + borderColor + '\'' +
                ", area='" + getArea() + '\'' +
                ", perimeter='" + getPerimeter() + '\'' +
                '}';
    }
}
