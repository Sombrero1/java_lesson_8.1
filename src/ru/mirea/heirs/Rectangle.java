package ru.mirea.heirs;

import ru.mirea.Shape;

import java.awt.*;

public class Rectangle extends Shape {
    protected double width;
    protected double lenght;



    public Rectangle() {}

    public Rectangle(double width, double lenght, double centerX, double centerY) {
        super.generateXY((int)centerX,(int)centerY);
        this.width = width;
        this.lenght = lenght;
    }

    public Rectangle(String color, boolean filled, double width, double lenght) {
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }

    @Override
    public double getArea() {
        return width*lenght;
    }

    @Override
    public double getPerimeter() {
        return (width+lenght)*2;
    }

    @Override
    public void draw(Graphics2D p) {
        p.drawRect(centerX,centerY,(int)width,(int)lenght);

    }

}
