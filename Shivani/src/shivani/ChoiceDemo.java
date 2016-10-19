package shivani;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class ChoiceDemo	extends Applet implements ItemListener {
	Choice os,browser;
	String msg="";
	public void init()
	{
		os=new Choice();
		browser=new Choice();
		os.add("windows");
		os.add("mac");
		os.add("linux");
		browser.add("safari");
		browser.add("chrome");
		browser.add("firefox");
		add(os);
		add(browser);
		os.addItemListener(this);
		browser.addItemListener(this);
	}
	
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	
	public void paint(Graphics g)
	{
		msg="current selection - ";
		g.drawString(msg, 10, 100);
		msg="Selected OS : ";
		msg+=os.getSelectedItem();
		g.drawString(msg, 10, 120);
		msg="selected Browser : ";
		msg+=browser.getSelectedItem();
		g.drawString(msg, 10, 140);
		
		
	}
}
