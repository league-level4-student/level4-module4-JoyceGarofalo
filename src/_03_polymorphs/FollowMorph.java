package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class FollowMorph extends Polymorph{

	FollowMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.green);
		g.fillRect(getX(), getY(), 50, 50);
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	public void update(int x, int y) {
		setX(x);
		setY(y);
	}

}
