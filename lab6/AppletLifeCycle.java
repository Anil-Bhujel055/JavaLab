import java.applet.Applet;
import java.awt.*;

public class AppletLifeCycle extends Applet
{
	public void init()
	{
		int a = 7;
	}

	public void start()
	{
		System.out.println("Let's START");
	}

	public void stop()
	{
		System.out.println("Stop");
	}

	public void paint (Graphics g)
	{
		g.drawString("paint", 100, 100);
	}

	public void destroy()
	{
		System.out.println("Destroy");
	}
}
/*<applet code = "AppletLifeCycle.class" width="400" height="400"></applet> */