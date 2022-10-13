package pong;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Padel extends Rectangle {
	
	int id;
	int yVelocity;
	int speed = 10;
	
	
	//Creating constructor for Padel
	Padel(int x, int y, int PADAL_WIDTH, int PADEL_HEIGHT, int id){
			super(x,y,PADAL_WIDTH,PADEL_HEIGHT);
			this.id = id;
			}
	
	public void keyPressed(KeyEvent e) {
		
		switch (id) {
		case 1:
			if(e.getKeyCode() == KeyEvent.VK_W) {
				setYDirection(-speed);
				move();
			}
			if(e.getKeyCode() == KeyEvent.VK_S) {
				setYDirection(speed);
				move();
			}
			break;
		case 2:
			if(e.getKeyCode() == KeyEvent.VK_UP) {
				setYDirection(-speed);
				move();
			}
			if(e.getKeyCode() == KeyEvent.VK_DOWN) {
				setYDirection(speed);
				move();
			}
			break;
		}
	}
	
	public void keyReleased(KeyEvent e) {
		switch (id) {
		case 1:
			if(e.getKeyCode() == KeyEvent.VK_W) {
				setYDirection(0);
				move();
			}
			if(e.getKeyCode() == KeyEvent.VK_S) {
				setYDirection(0);
				move();
			}
			break;
		case 2:
			if(e.getKeyCode() == KeyEvent.VK_UP) {
				setYDirection(0);
				move();
			}
			if(e.getKeyCode() == KeyEvent.VK_DOWN) {
				setYDirection(0);
				move();
			}
			break;
		}
	}
	
	public void setYDirection(int yDirection) {
		
		yVelocity = yDirection;
	}
	
	public void move() {
		
		y = y+yVelocity;
	}
	
	public void draw(Graphics g) {
		
		if(id == 1) 
			 g.setColor(Color.blue);
		else
			g.setColor(Color.red);
		g.fillRect(x,y,width,height);
	}

}
