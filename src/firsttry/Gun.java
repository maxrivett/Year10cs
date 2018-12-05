package firsttry;



import java.awt.Image;
import java.awt.Toolkit;



public class Gun {
	private int xCoord = 10;
	private int yCoord = 10;
	private int width = 30;
	private int height = 30;
	private Image img;
	public boolean isVisible;

	
	
	
	public Gun() { 
		setxCoord(10);
		setyCoord(10);
		setWidth(30);
		setHeight(30);
		setImg("files/soldiersprites/gun.png");
	}
	
	
	
	public Gun(int x, int y, int w, int h, String imgpath) {
		setxCoord(x);
		setyCoord(y);
		setWidth(w);
		setHeight(h);
		setImg(imgpath);
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



	public Object getBounds() {
		// TODO Auto-generated method stub
		return null;
	}



	public void remove() {
		// TODO Auto-generated method stub
		
	}




		
	}
	


