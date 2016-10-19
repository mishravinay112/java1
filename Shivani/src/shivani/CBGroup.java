package shivani;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class CBGroup extends Applet implements ItemListener {
	String msg="";
	Checkbox mac,linux,unix;
	CheckboxGroup cbg;
	public void init()
	{	
		cbg=new CheckboxGroup();
		mac=new Checkbox("Mac",cbg,true);
		linux=new Checkbox("Linux",cbg,false);
		unix=new Checkbox("Unix",cbg,false);
		add(mac);
		add(linux);
		add(unix);
		mac.addItemListener(this);
		linux.addItemListener(this);
		unix.addItemListener(this);
		
		
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	
	
	public void paint(Graphics g)
	{
		msg="mac : "+mac.getState();
		g.drawString(msg, 10, 100);
		msg="linux : "+linux.getState();
		g.drawString(msg, 10, 120);
		msg="unix :"+unix.getState();
		g.drawString(msg, 10, 140);
	}
}
