package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

public class MessageMorph extends Polymorph{

	MessageMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "hello!");
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.black);
		g.fillRect(getX(), getY(), 50, 50);
		
	}


}
