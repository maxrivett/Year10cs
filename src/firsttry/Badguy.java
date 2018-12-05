package firsttry;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.LinkedList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Badguy {

	LinkedList badguys = new LinkedList();
	LinkedList bullets = new LinkedList();
	
	int speed;
	Random rand = new Random();
	public int hp = rand.nextInt(60);
	
//	if (kr.intersects(r)) {
//		badguys.remove(i);
//		bullets.remove(j);
//	}
	
	
	
	

	private int xCoord = 0;
	private int yCoord = 0;
	private int width = 10;
	private int height = 10;
	private Image img;
	private int facing;
//	int xlocation[] = {}
//	int ylocation[] = {}
			
	public Badguy() {
		setxCoord(10);
		setyCoord(10);
		setWidth(30);
		setHeight(30);
		setImg("files/badleft.png");
		
	}
	
	public Badguy(int x, int y, int w, int h, String imgpath) {
		
		setxCoord(x);
		setyCoord(y);
		setWidth(w);
		setHeight(h);
		setImg(imgpath);
		this.facing = facing;
	}
	
	public void moveIt(int marioX, int marioY) {
		int speed = 2;
		int x = getxCoord();
		int y = getyCoord();
		if(x > marioX) {
			x = x - speed;
			setxCoord(x);
		}
		if (x < marioX) {
			x = x + speed;
			setxCoord(x);
		}
		if (y > marioY) {
			y = y - speed;
			setyCoord(y);
		}
		if (y < marioY) {
			y = y + speed;
			setyCoord(y);
		}
	}
	
	
	
	
	
	
	public void setImg(String imgpath) {
		this.img = Toolkit.getDefaultToolkit().getImage(imgpath);
	}

	public int getxCoord() {
		return xCoord;
	}

	public void setxCoord(int xCoord) {
		this.xCoord = xCoord;
	}

	public int getyCoord() {
		return yCoord;
	}

	public void setyCoord(int yCoord) {
		this.yCoord = yCoord;
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

	public Image getImg() {
		return img;
	}

	public void setImg(Image img) {
		this.img = img;
	}
	
	
	
}


