package org.example;

public abstract class Shape implements Area,Perimeter {

    protected String fillColor;
    protected String borderColor;

    @Override
    public abstract double getArea();

    @Override
    public abstract double getPerimeter();
}
