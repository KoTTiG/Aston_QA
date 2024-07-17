package org.example;

public class Circle implements Shape{

    private String borderColor;
    private String fillColor;
    private int radius;

    public Circle(int radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public double perimeter(){
        return 2*radius * Math.PI;
    }

    public double area(){
        return radius*radius * Math.PI;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public String getFillColor() {
        return fillColor;
    }

    public int getRadius() {
        return radius;
    }
}
