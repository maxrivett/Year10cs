package firsttry;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.Random;

public class DrawImage {


	private int xCoord = 0;
	private int yCoord = 0;
	private int width = 10;
	private int height = 10;
	private Image img;

	

	public DrawImage(int x, int y, int w, int h, String imgpath) {
		// TODO Auto-generated constructor stub
		setxCoord(x);
		setyCoord(y);
		setWidth(w);
		setHeight(h);
		setImg(imgpath);
	}

	public DrawImage(Random rand, Random rand2, int i, int j) {
		// TODO Auto-generated constructor stub
	}

	public DrawImage(Random rand, Random rand2, int w, int h, String imgpath) {
		// TODO Auto-generated constructor stub
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


