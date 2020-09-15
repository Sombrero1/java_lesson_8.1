package ru.mirea.heirs;

import ru.mirea.Shape;

import java.awt.*;

public class Circle extends Shape {
    protected double radius;


    public Circle(){}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }


    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void draw(Graphics2D p) {
        super.draw(p);
        p.drawRoundRect(centerX,centerY,(int)radius*2,(int)radius*2,1000,1000);

    }


}
