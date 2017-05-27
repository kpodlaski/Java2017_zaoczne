package zajecia5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by Krzysztof Podlaski on 14.05.2017.
 */
public class PaintedPanel extends JPanel{
    private double x,y;
    private double X=70,Y=90;
    private double vx=0.5,vy=0.5;
    Image img =  Toolkit.getDefaultToolkit().createImage(
            ".\\bird.gif");
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor( Color.MAGENTA );
        //Rysowanie prostokąta//g.drawRect(12,56,30,50);
        g.fillRect((int) x,(int) y,20,20);
        g.setColor(new Color(122,122,122));
        g.drawImage(img,(int)X , (int)Y,
                40,40, null);
        g.setColor(Color.BLUE);
        g.drawString("Rozmiar ekranu: w="+getWidth() + "h="+getHeight(),30,250);
        //Trójkąt:
        int Cx[] = {13,45,170};
        int Cy[] = {33,56,88};
        g.drawPolygon(Cx,Cy,Cx.length);
    }

    void animate(){
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
               while (true){
                   x+=vx;
                   y+=vy;
                   if (x<0 || x>getWidth() - 20) vx=-vx;
                   if (y<0 || y>getHeight() - 20 ) vy=-vy;
                   repaint();
                   try {
                       Thread.sleep(30);
                   } catch (InterruptedException e) {
                       e.printStackTrace();}
               } }         });
        t.start();
    }



    public static void main(String[] args) {
        JFrame frame = new JFrame("Apka");
        PaintedPanel p = new PaintedPanel();
        frame.setSize(300,300);
        frame.setContentPane(p);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        p.animate();
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                switch(e.getKeyCode()){
                    case KeyEvent.VK_LEFT : p.X -= 1; break;
                    case KeyEvent.VK_RIGHT : p.X += 1; break;
                    case KeyEvent.VK_UP: p.Y-=1; break;
                    case KeyEvent.VK_DOWN: p.Y+=1; break;
                }
            }
        });
    }

}
