package shivani;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class ButtonDemo extends Applet implements ActionListener{
	Button yes,no;
	String msg="";
	public void init()
	{
		yes=new Button("yes");
		no=new Button("no");
		add(yes);
		add(no);
		yes.addActionListener(this);
		no.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String str=ae.getActionCommand();
		if(str.equals("yes"))
		{
			msg="you pressed yes";
		}
		else
		{
			msg="you pressed no";
		}
		repaint();
	}
	
	public void paint(Graphics g)
	{
		g.drawString(msg,100,100);
	}
}
