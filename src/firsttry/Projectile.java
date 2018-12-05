package firsttry;

import java.awt.Image;
import java.awt.Toolkit;

public class Projectile {
public int facing = 0;



class Bullet {
    float velocityX, velocityY, positionX, positionY;
}

/**
    Sets Bullet [b] to fly towards [x, y] from it's current location at [speed].

*/
private void directBulletToPoint(Bullet b, float x, float y, float speed) {
    float dx = x - b.positionX;
    float dy = y - b.positionY;
    float len = (float) Math.sqrt(dx*dx+dy*dy);
    b.velocityX = dx / len * speed;
    b.velocityY = dy / len * speed;
}
	
	private int xCoord = 0;
	private int yCoord = 0;
	private int width = 10;
	private int height = 10;
	private Image img;
	private boolean facingRight;
	
	public Projectile() {
		setxCoord(10);
		setyCoord(10);
		setWidth(30);
		setHeight(30);
		setImg("files/badright.png");
		this.facingRight = facingRight;
	}
	
	/*public Projectile(int x, int y, int w, int h, String imgpath, boolean facingRight) {
		
		setxCoord(x);
		setyCoord(y);
		setWidth(w);
		setHeight(h);
		setImg(imgpath);
	}*/
	
	public Projectile(int x, int y, int w, int h, String imgpath, int facing) {
		setxCoord(x);
		setyCoord(y);
		setWidth(w);
		setHeight(h);
		setImg(imgpath);
		this.facing = facing;
	}
		
	public void moveBullet() {
		int speed = 300;
		int x = getxCoord();
		int y = getyCoord();
		
		if (facingRight) {
				x = x + speed;
			
				setxCoord(x);
				
			} else {
				
				x = x - speed;
				setxCoord(x);
		}
}
	
	public void moveIt(int direction) {
		int speed = 300;
		int x = getxCoord();
		int y = getyCoord();
		if (direction == 68) {
			x = x + speed;
			setxCoord(x);
			setImg("files/badright.png");
		}	if (direction == 87) {
			y = y - speed;
			setyCoord(y);
		} if (direction == 83) {
			if (y<0) { y = y + speed * 3;}
			y = y + speed;
			setyCoord(y);
		} else if (direction == 65) {
			x = x - speed;
			setxCoord(x);
			setImg("files/badleft.png");
		} 	if (direction == 87) {
			y = y - speed;
			setyCoord(y);
		} if (direction == 83) {
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
