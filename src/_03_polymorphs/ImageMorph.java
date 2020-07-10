package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageMorph extends Polymorph{
	BufferedImage img;

	ImageMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
		img = ImageIO.read(this.getClass().getResourceAsStream("cat.jpg")); 
	}

	@Override
	public void update() {
		
	}

	@Override
	public void draw(Graphics g) {
		
		g.setColor(Color.yellow);
		g.fillRect(getX(), getY(), 50, 50);
		//g.drawImage(img, x, y, 100, 100);
		g.drawImage(img, x, y, 100, 100, null);
	}

}
