package ru.mirea.heirs;

import java.awt.*;

public class Square extends Rectangle {


    public double getSide() {
        return width;
    }

    public void setSide(int side) {
        this.width = side;
    }

    public Square() {}

    public Square(double width, double centerX, double centerY) {
        super(width, width, centerX,centerY);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    @Override
    public void draw(Graphics2D p) {
        super.draw(p);
        p.drawRect(centerX,centerY,(int)width,(int)width);
    }


}
