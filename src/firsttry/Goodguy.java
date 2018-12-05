package firsttry;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;


public class Goodguy {

	private int xCoord = 0;
	private int yCoord = 0;
	private int width = 10;
	private int height = 10;
	Image img;
	public boolean isVisible;
	boolean gunHeld;
	public int facing = 0;
	
	public Goodguy() {
		setxCoord(10);
		setyCoord(10);
		setWidth(30);
		setHeight(30);
		setImg("files/right.png");
		
	}
	
	public Goodguy(int x, int y, int w, int h, String imgpath) {
		
		setxCoord(x);
		setyCoord(y);
		setWidth(w);
		setHeight(h);
		setImg(imgpath);
	}
	
public Goodguy(int x, int y, int w, int h, String imgpath, int facing) {
		
		setxCoord(x);
		setyCoord(y);
		setWidth(w);
		setHeight(h);
		setImg(imgpath);
		this.facing = facing;
	}
	
	public void moveIt(int direction, int w, int h) {
		int speed = 30;
		int x = getxCoord();
		int y = getyCoord();
		
		
		if (direction == 39) {
			x = x + speed;
			if (x > w) { x = x - speed * 3; }
			setxCoord(x);
			if (!gunHeld) {
			setImg("files/soldiersprites/soldierrunright1.png");
			} else if (gunHeld) {
				setImg("files/soldiersprites/soldierrunrightgun1.png");
			}
			
		} else if (direction == 37) { 
			if (x < 0) { x = x + speed * 3; }
			x = x - speed;
			setxCoord(x);
			if (!gunHeld) {
			setImg("files/soldiersprites/soldierrunleft1.png");
			} else if (gunHeld) {
				setImg("files/soldiersprites/soldierrunleftgun1.png");
			}
		} else if (direction == 38) {
			if (y < 0) { y = y + speed * 3; }
			y = y - speed;
			setyCoord(y);
			if (!gunHeld) {
			setImg("files/soldiersprites/soldierwalkupleft1.png");
			} else if (gunHeld) {
				setImg("files/soldiersprites/soldierwalkupleftgun1.png");
			}
		} else if (direction == 40) {
			if ( y > h - 10) { y = y - speed * 3; }
			y = y + speed;
			setyCoord(y);
			if (!gunHeld) {
			setImg("files/soldiersprites/soldierwalkdownright1.png");
			} else if (gunHeld) {
				setImg("files/soldiersprites/soldierwalkdownrightgun1.png");
			}
		}
	}
		
	
		/*
		 
		 Previous code (very cluttered and messy, no boundaries)
		 
		if (direction == 39) {
			x = x + speed;
			if (x > w) { x = x - speed * 3; }
			setxCoord(x);
			setImg("files/right.png");
		} if (direction == 40) {
			if ( y < 0) { y = y + speed * 3; }
			y = y + speed;
			setyCoord(y);
		} else if (direction == 37) {
			if (x < 0) { x = x + speed * 3; }
			x = x - speed;
			setxCoord(x);
			setImg("files/left.png");
		} 	if (direction == 38) {
			if ( y > h) { y = y - speed * 3; }
			y = y - speed;
			setyCoord(y);
		}
	}
		*/

	
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

	public Rectangle getBounds() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
