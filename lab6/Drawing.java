import java.applet.Applet;
import java.awt.*;

public class Drawing extends Applet
{
	public void init()
	{
		setSize(1000,1000);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.drawRect(100,200,100,200);
		g.drawLine(100,100,100,100);
		g.drawOval(200,70,150,150);
	}
}