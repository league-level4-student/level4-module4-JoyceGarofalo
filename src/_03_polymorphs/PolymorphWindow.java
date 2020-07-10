package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseListener, MouseMotionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    
    BluePolymorph bluePoly = new BluePolymorph(100, 250);
    RedMorph redPoly = new RedMorph(100, 400);
    MovingMorph movingPoly = new MovingMorph(200, 250);
    CircleMorph circlePoly = new CircleMorph(200, 200);
    FollowMorph followPoly = new FollowMorph(200, 400);
    ImageMorph imagePoly = new ImageMorph(300, 250);
    MessageMorph messagePoly = new MessageMorph(300, 400);
    
    ArrayList<Polymorph> polyArray = new ArrayList<>();
    
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 window.addMouseListener(this);
   	 window.addMouseMotionListener(this);
   	 
   	 polyArray.add(bluePoly);
   	 polyArray.add(redPoly);
   	 polyArray.add(movingPoly);
   	 polyArray.add(circlePoly);
   	 polyArray.add(followPoly);
   	 polyArray.add(imagePoly);
   	 polyArray.add(messagePoly);
   	 
   	 for (Polymorph polymorph : polyArray) {
		polymorph.update();
	 }
   	 
   	 /*bluePoly = new BluePolymorph(50, 50);
   	 redPoly = new RedMorph(50, 50);
   	 movingPoly = new MovingMorph(50, 50);*/
   	 
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	 
   	
   	 for (Polymorph polymorph : polyArray) {
		polymorph.draw(g);
	 }
   	
   	 //draw polymorph
   	/* bluePoly.draw(g);
   	 redPoly.draw(g);
   	 movingPoly.draw(g);*/
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	 /*bluePoly.update();
   	 redPoly.update();
   	 movingPoly.update();*/
   	 
    }

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		followPoly.update(e.getX(), e.getY());
		//System.out.println(e.getX() + " ," + e.getY());
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getX() > messagePoly.getX() && e.getX() < messagePoly.getX()+messagePoly.getWidth()) {
			if(e.getY() > messagePoly.getY() && e.getY() < messagePoly.getY()+messagePoly.getHeight()) {
				messagePoly.update();
			}
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
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
}
