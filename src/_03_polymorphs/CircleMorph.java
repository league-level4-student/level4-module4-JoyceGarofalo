package _03_polymorphs;

import java.awt.Graphics;

public class CircleMorph extends Polymorph{
	int angle;

	CircleMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		x += Math.cos(angle++);
		y += Math.sin(angle++);
		
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawOval(angle, angle, x, y);
		
	}

}
