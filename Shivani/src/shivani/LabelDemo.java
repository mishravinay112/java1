package shivani;
import java.applet.*;
import java.awt.*;
public class LabelDemo extends Applet {
	public void init()
	{
		Label one=new Label("one");
		Label two=new Label("two");
		Label three=new Label("Three");
		
		add(one);
		add(two);
		add(three);
	}
}

