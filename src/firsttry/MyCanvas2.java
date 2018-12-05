/*package firsttry;

import java.awt.Canvas;

import java.awt.Color;

import java.awt.Graphics;

import java.awt.Rectangle;

import java.awt.event.KeyEvent;

import java.awt.event.KeyListener;

import java.io.FileInputStream;

import java.io.IOException;

import java.io.InputStream;

import java.util.LinkedList;

import java.util.Random;

import sun.audio.*;



public class MyCanvas2 extends Canvas implements KeyListener {

	

	Goodguy mario = new Goodguy(10,10,50,50,"files/right.png");

	LinkedList badguys = new LinkedList();

	LinkedList bullets = new LinkedList();

	

	public MyCanvas2() {

		this.setSize(900,400); // set same size as MyScreen

		this.addKeyListener(this); // add the listener to your canvas

		playIt("files/sonic.wav");

		

		Random rand = new Random();

		for(int i = 0; i<10; i++) {

			Badguy bg = new Badguy(rand.nextInt(this.getWidth()),rand.nextInt(this.getHeight()) ,50,50,"files/badright.png");

			badguys.add(bg);

		}

		

		this.setBackground(Color.BLACK);

	}

	

	@Override

	public void paint(Graphics g) {

		g.drawImage(mario.getImg(), mario.getxCoord(), mario.getyCoord(), mario.getWidth(), mario.getHeight(), this); // draw good guy

		

		for(int i = 0; i < badguys.size(); i++) {// draw bad guys

			Badguy bg = (Badguy) badguys.get(i);

			g.drawImage(bg.getImg(), bg.getxCoord(), bg.getyCoord(), bg.getWidth(), bg.getHeight(), this); 

			Rectangle r = new Rectangle(bg.getxCoord(),bg.getyCoord(),bg.getWidth(),bg.getHeight());

			

			for(int j = 0; j < bullets.size(); j++) {

				Projectile k = (Projectile) bullets.get(j);

				if (k.getxCoord() > this.getWidth()) { bullets.remove(k); }

				k.setxCoord(k.getxCoord() + 1);

				g.drawImage(k.getImg(), k.getxCoord(), k.getyCoord(), k.getWidth(), k.getHeight(), this); 

				

				Rectangle kr = new Rectangle(k.getxCoord(),k.getyCoord(),k.getWidth(),k.getHeight());

				if (kr.intersects(r)) {

					badguys.remove(i);

					bullets.remove(j);

				}

				repaint();

			}

		}

	}



	@Override

	public void keyPressed(KeyEvent e) {

		

		if (e.getKeyCode() == 32) {

			Projectile bullet = new Projectile(mario.getxCoord(),mario.getyCoord(),30,30,"files/bullet.png");

			bullets.add(bullet);

		}

		

		mario.moveIt(e.getKeyCode(),this.getWidth(),this.getHeight());

		for(int i = 0; i < badguys.size(); i++) { 

			Badguy bg = (Badguy) badguys.get(i); 

			Rectangle ggr = new Rectangle(mario.getxCoord(),mario.getyCoord(),mario.getWidth(),mario.getHeight());

			Rectangle r = new Rectangle(bg.getxCoord(),bg.getyCoord(),bg.getWidth(),bg.getHeight());

			if (ggr.intersects(r)) { 

				badguys.remove(i);

			}

		}

		repaint();

	}



	@Override

	public void keyTyped(KeyEvent e) {

		//System.out.println(e);

	}

	

	@Override

	public void keyReleased(KeyEvent e) {

		//System.out.println(e);
		if (e.getKeyCode() == 39) { 
			mario.setImg("files/soldiersprites/soldierrunright2.png");
		}
		if (e.getKeyCode() == 37) {
			mario.setImg("files/soldiersprites/soldierrunleft2.png");
		}
		if (e.getKeyCode() == 69) {
			mario.setImg("files/soldiersprites/soldierjump.png");
		}
		if (e.getKeyCode() == 38) {
			mario.setImg("files/soldiersprites/soldierwalkupleft2.png");
		}
		if (e.getKeyCode() == 40) {
			mario.setImg("files/soldiersprites/soldierwalkdownright2.png");
		}
		repaint();
	}

	

	public void playIt(String filename) {

		

		try {

			InputStream in = new FileInputStream(filename);

			AudioStream as = new AudioStream(in);

			AudioPlayer.player.start(as);

		} catch (IOException e) {

			System.out.println(e);

		}

		

	}



}*/