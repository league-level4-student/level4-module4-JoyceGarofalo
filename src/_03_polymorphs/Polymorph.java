package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    protected int x;
    protected int y;
    private int width = 50;
    private int height = 50;
    
    Polymorph(int x, int y){
   	 this.setX(x);
   	 this.setY(y);
    }
    
    public abstract void update();
    	
    
    public abstract void draw(Graphics g);
    
    
    public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
