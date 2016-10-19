package shivani;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class CheckboxDemo extends Applet implements ItemListener
{	
	Checkbox mac,windows,linux,unix;
	String msg="";
	public void init()
	{
		mac=new Checkbox("Mac");
		windows=new Checkbox("Windows");
		linux=new Checkbox("Linux");
		unix=new Checkbox("Unix");
		add(mac);
		add(windows);
		add(linux);
		add(unix);
		mac.addItemListener(this);
		windows.addItemListener(this);
		linux.addItemListener(this);
		unix.addItemListener(this);
	}
	@Override
	public void itemStateChanged(ItemEvent ie) {
		
		repaint();
	}
	
	public void paint(Graphics g)
	{
		msg="current state : ";
		g.drawString(msg,10,80);
		msg="Mac : "+mac.getState();
		g.drawString(msg,10,100);
		msg="Windows : "+windows.getState();
		g.drawString(msg,10,120);
		msg="Linux : "+linux.getState();
		g.drawString(msg,10,140);
		msg="Unix : "+unix.getState();
		g.drawString(msg,10,160);
	}

}
