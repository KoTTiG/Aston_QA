package org.example;

public class Circle extends Shape {

    private final int radius;

    public Circle(int radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "fillColor='" + fillColor + '\'' +
                ", borderColor='" + borderColor + '\'' +
                ", area='" + getArea() + '\'' +
                ", perimeter='" + getPerimeter() + '\'' +
                '}';
    }
}
