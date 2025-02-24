import javax.Swing.*;
import java.awt.*;
public class Drawshapes extends JFrame 
{
private int frameWidth = 700, frameHeight = 500;
public Drawshapes() {
setBounds(100,100,framewidth,frameheight);
setDefaultCloseOperation(JFrame.EXIST_ON_CLOSE);
setVisible(true);
}
public void paint(Graphics g)
{
g.setColor(Color,black);
g.fillRect(0,0,frameWidth,frameHeight);

g.setColor(Color,white);
g.fillRect(30,40,100,50);

g.setColor(Color,cyan);
g.fillOval(150,150,200,200);
}
public static void main(String[] args)
{
new Drawshapes();
}
}