package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageMorph2 extends Polymorph{
	BufferedImage img;

	ImageMorph2(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
		try {
			img = ImageIO.read(this.getClass().getResourceAsStream("cat.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.yellow);
		g.fillRect(x, y, 50, 50);
		g.drawImage(img, x, y, 100, 100, null);
	}

}
