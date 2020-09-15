package ru.mirea;

import ru.mirea.heirs.Circle;
import ru.mirea.heirs.Rectangle;
import ru.mirea.heirs.Square;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Window extends JFrame {
    JTextField jta = new JTextField(10);
    Font fnt= new Font("Calibre", Font.BOLD, 20);

    Window(){
        super("Example");
        setLayout(new FlowLayout());
        setSize(1850,1080);
        jta.setForeground(Color.GREEN);
        setVisible(true);

    }

    @Override
    public void paint(Graphics g) {
        Graphics2D gr2d= (Graphics2D) g;


        for (int i=0, z=0; i<20; i++, z=((int)(Math.random()*10))%3){
            Random rand= new Random();
            gr2d.setColor( new Color(Math.abs(rand.nextInt())));
            switch (z) {
                case 0:
                    drawShape(new Circle(Math.random()*100),gr2d);
                    break;
                case 1:
                    drawShape(new Rectangle(Math.random()*100,Math.random()*100),gr2d);
                    break;
                case 2:
                    drawShape(new Square(Math.random()*100),gr2d);
                    break;

            }
        }
    }

    private void drawShape(Shape a, Graphics2D gr2d) {
        a.draw(gr2d);
    }
}
