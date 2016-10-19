package shivani;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class FrameTest {
	public static void main(String[] args) {
		MyNewFrame mnf=new MyNewFrame("Frame");
		mnf.resize(300,200);
		mnf.show();
	}
	
}


class MyNewFrame extends Frame
{
	public MyNewFrame(String title) {
		
		
		super(title);
		setLayout(new FlowLayout());
		MyWindowAdapter ad=new MyWindowAdapter(this);
		addWindowListener(ad);
		Label n=new Label("User Name");
		TextField t1=new TextField(25);
		Label g=new Label("Sex");
		TextField t2=new TextField(6);
		Label q=new Label("Qualification");
		TextField t3=new TextField(25);
		Label a=new Label("Address");
		TextField t4=new TextField(40);
		Button s=new Button("submit");
		Button r=new Button("reset");
		add(n);
		add(t1);
		add(g);
		add(t2);
		add(q);
		add(t3);
		add(a);
		add(t4);
		add(s);
		add(r);
		
		
	}
	
	
}

class MyWindowAdapter extends WindowAdapter
{
	MyNewFrame mynewframw;
	public MyWindowAdapter(MyNewFrame mynewframe) {
		this.mynewframw=mynewframe;
	}
	
	public void windowClosing(WindowEvent we)
	{
		mynewframw.setVisible(false);
	}
}