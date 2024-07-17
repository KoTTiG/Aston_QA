package org.example;

public class Triangle implements Shape{

    private String borderColor;
    private String fillColor;
    private int a;
    private int b;
    private int c;
    private int h;

    public Triangle(String borderColor, String fillColor, int a, int b, int c, int h) {
        this.borderColor = borderColor;
        this.fillColor = fillColor;
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    public double perimeter(){
        return a+b+c;
    }

    public double area(){
        return 0.5 * a * h;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public String getFillColor() {
        return fillColor;
    }
}
