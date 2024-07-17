package org.example;

public class Rectangle implements Shape{

    private String borderColor;
    private String fillColor;
    private int a;
    private int b;

    private int h;

    public Rectangle(String borderColor, String fillColor, int a, int b, int h) {
        this.borderColor = borderColor;
        this.fillColor = fillColor;
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public double perimeter(){
        return a+b * 2;
    }

    public double area(){
        return a * h;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public String getFillColor() {
        return fillColor;
    }
}
