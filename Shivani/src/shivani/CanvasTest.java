package shivani;

import java.awt.*;
import java.awt.event.*;

public class CanvasTest extends Frame implements MouseListener {

	public CanvasTest() {
		super("Canvas with dots");
		Canvas c=new Canvas();
		c.setBackground(Color.yellow);
		c.setSize(400,300);
		add(c);
		c.addMouseListener(this);
		pack();
		setVisible(true);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		Point p=e.getPoint();
		System.out.println("Mouse pressed at pixel position : "+p);
		Graphics g=((Canvas)e.getSource()).getGraphics();
		g.fillOval(p.x, p.y, 10, 10);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		new CanvasTest();
	}

}
