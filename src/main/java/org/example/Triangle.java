package org.example;

public class Triangle extends Shape {

    private final int a;
    private final int b;
    private final int c;
    private final int h;

    public Triangle(String borderColor, String fillColor, int a, int b, int c, int h) {
        this.borderColor = borderColor;
        this.fillColor = fillColor;
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }


    @Override
    public double getArea() {
        return a * h / 2.0;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "fillColor='" + fillColor + '\'' +
                ", borderColor='" + borderColor + '\'' +
                ", area='" + getArea() + '\'' +
                ", perimeter='" + getPerimeter() + '\'' +
                '}';
    }
}
