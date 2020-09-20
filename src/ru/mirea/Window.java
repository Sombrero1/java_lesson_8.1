package ru.mirea;

import ru.mirea.heirs.Circle;
import ru.mirea.heirs.Rectangle;
import ru.mirea.heirs.Square;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Window extends JFrame {

    JButton btn;

    Window(){
        super("Example");

        btn= new JButton("Press me please");

        setBounds(100,100,1000,700);//окошко
        setDefaultCloseOperation(EXIT_ON_CLOSE); // выход при закрытии

        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        container.add(btn);
        btn.addMouseListener(new MyMouseListener(this));


        setVisible(true);

        //Graphics g = getGraphics();
//        paint(g);

    }

    @Override
    public void paint(Graphics g) {
        Graphics2D gr2d= (Graphics2D) g;


        for (int i=0, z=0; i<20; i++, z=((int)(Math.random()*10))%3){
            Random rand= new Random();
            gr2d.setColor( new Color(Math.abs(rand.nextInt())));
            switch (z) {
                case 0:
                    drawShape(new Circle(Math.random()*100,Math.abs(rand.nextInt())%500+50,Math.abs(rand.nextInt())%500+50),gr2d);
                    break;
                case 1://Math.abs(rand.nextInt())%500+100
                    drawShape(new Rectangle(Math.random()*100,Math.random()*100, Math.abs(rand.nextInt())%500+50,Math.abs(rand.nextInt())%500+50),gr2d);
                    break;
                case 2:
                    drawShape(new Square(Math.random()*100,Math.abs(rand.nextInt())%500+50,Math.abs(rand.nextInt())%500+50),gr2d);
                    break;

            }
        }
    }

    private void drawShape(Shape a, Graphics2D gr2d) {
        a.draw(gr2d);
    }
}
