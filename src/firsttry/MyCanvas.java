package firsttry;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
//import java.util.Timer;
//import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.Timer;

import java.awt.Graphics;
import java.awt.Rectangle;
import sun.audio.*;

public class MyCanvas extends Canvas implements MouseListener, KeyListener{
		  
	
	
	Goodguy mario = new Goodguy(1000, 400, 50, 80, "files/soldiersprites/soldierstand.png");
			//Goodguy maria = new Goodguy(100, 10, 80, 90, "files/left.png");
			//Badguy wario = new Badguy(20, 100, 40, 50, "files/badright.png");
			//Badguy badleft = new Badguy(100, 100, 40, 50, "files/badleft.png");
	LinkedList badguys = new LinkedList();
	LinkedList bullets = new LinkedList();
	LinkedList guns = new LinkedList();
	boolean marioCanShoot = false;
	boolean facingRight = true;
	boolean isVisible = true;
	boolean gunHeld = false;
	boolean gunSee = true;
	boolean gameStarted = false;
	boolean marioHit = false;
	boolean keyHeld = false;
	boolean gameWon = false;
	
	Gun gun = new Gun(100, 100, 60, 17, "files/soldiersprites/gun.png");
	//Projectile bullet = new Projectile(200, 200, 10, 10, "files/bullet.png");
	Random rand = new Random();
	//int hp = rand.nextInt(100);
	int hp = 60;
	public int facing = 0;
	int time = 0;
	int points = 0;
	DrawImage title = new DrawImage(0, 0, 1400, 800, "files/title.png");
	DrawImage gameover = new DrawImage(0, 0, 1400, 800, "files/gameover.png");
	DrawImage gun1 = new DrawImage(rand.nextInt(1400), rand.nextInt(800), 50, 20, "files/soldiersprites/gun.png");
	DrawImage key = new DrawImage (rand.nextInt(400), rand.nextInt(200), 30, 10, "files/key.png");
	DrawImage lock = new DrawImage (1350, 650, 45, 45, "files/lock.png");
	DrawImage youwin = new DrawImage(0, 0, 1400, 800, "files/youwin.png"); 
	
	
	public MyCanvas() {
		
		
		
		
				/*public void tick() {
		      		if (Clicked) {
		         		int targetX2 = mse.x;
		         		int targetY2 = mse.y;
		         		double xDistance = mse.x - x;
		         		double yDistance = mse.y - y;

		         		int targetX = (mse.x - width / 2);
		         		int targetY = (mse.y - height / 2);
		      		}
		      		int pathX = (int) (game.planet.x + game.planet.width / 2 - width / 2 - x);
		      		int pathY = (int) (game.planet.y + game.planet.height / 2 - height / 2 - y);

		      		double distance = Math.sqrt(pathX * pathX + pathY * pathY);
		      		double directionX = pathX / distance;
		      		double directionY = pathY / distance;

		      		double movementX = directionX * 3;
		      		double movementY = directionY * 3;
		      		x += (int) movementX;
		      		y += (int) movementY;

		   		} 

		   		// MouseListener (something that extends MouseListener)
		   		public void mousePressed(MouseEvent e) {
		      		if (e.getButton() == 1) {
		         		Clicked = true;
		      		}
		   			}

		   			public void mouseReleased(MouseEvent e) {
		      		if (e.getButton() == 1) {
		         		Clicked = false;
		      	}
		   		}

		   		// MouseMotionListener (something that extends MouseMotionListener)
		   		public void mouseDragged(MouseEvent e) {
		      		mse = new Point(e.getX(), e.getY());
		   		}

		   		public void mouseMoved(MouseEvent e) {
		      		mse = new Point(e.getX(), e.getY());
		   		}
		
		 		*/
		
		
		
		
		
		
		
		
		
		
//		JMenuBar menuBar;
//		JMenu menu;
//		JMenuItem menuItem; 
//			
//		menuBar = new JMenuBar();
//		
//		menu = new JMenu("File");
//		menu.setMnemonic(KeyEvent.VK_F);
//		menu.getAccessibleContext().setAccessibleDescription(
//		        "File menu");
//		menuBar.add(menu);
//		
//		menuItem = new JMenuItem("Start", new ImageIcon("files/badright.png"));
//		menuItem.setMnemonic(KeyEvent.VK_N);
//		menu.add(menuItem);
//
//		menu.addSeparator();
//		
//		menuItem = new JMenuItem("Pause", new ImageIcon("files/badright.png"));
//		menuItem.setMnemonic(KeyEvent.VK_P);
//		menu.add(menuItem);
//		
//		menuItem = new JMenuItem("Exit", new ImageIcon("files/badright.png"));
//		menuItem.setMnemonic(KeyEvent.VK_E);
//		menu.add(menuItem);
//		
//		//frame.setJMenuBar(JMenuBar);
		
		
		//setTitle("Gun Game");
		this.setSize(1400,800);
		int badrand = rand.nextInt(50);
		
		this.addKeyListener(this);
		playIt("files/mission.wav");
		this.setBackground(Color.DARK_GRAY);
		runGame();
		Random rand = new Random();
		int winwidth = this.getWidth();
		int winheight = this.getHeight();
		for(int i = 0; i<6; i++) {
			Badguy bg = new Badguy(rand.nextInt(winwidth) + 1400, rand.nextInt(winheight) + 800, 65, 85, "files/badleft.png");
			Rectangle r = new Rectangle(100,100,30,30);
			if (r.contains(mario.getxCoord(),mario.getyCoord())) {
				System.out.println("badguy on top of mario");
			}
			badguys.add(bg);
		}
		
		
					/*Random rand1 = new Random();
					int winwidth1 = this.getWidth();
					int winheight1 = this.getHeight();
					if (int l == 1) {
					Gun g = new Gun(rand.nextInt(winwidth), rand.nextInt(winheight), 50, 50, "files/soldiersprites/gun.png");
					Rectangle r = new Rectangle(100,100,30,30);
					if (r.contains(mario.getxCoord(),mario.getyCoord())) {
				System.out.println("soldier grabs gun");
						}
					bullets.add(g);
					}
					 		*/
		
	}
	
	
//	TimerTask repeatedTask = new TimerTask() {
//
//        public void run() {
//
//            for(int i = 0; i < badguys.size(); i++) {// draw bad guys
//
//                Badguy bg = (Badguy) badguys.get(i);
//
//                bg.setxCoord(bg.getxCoord() + 10);
//                
//                timer.scheduleAtFixedRate(repeatedTask, delay, period);
//
//            }
//
//            repaint();
//
//        }
//
//    };
//
//    Timer timer = new Timer("Timer");
//
//     
//
//    long delay  = 10L;
//
//    long period = 10L;

    /*public void paint1(Graphics g) {
    if (gunSee = true) {
    	g.drawImage(gun.getImg(), gun.getxCoord(), gun.getyCoord(), gun.getWidth(), gun.getHeight(), this);
    } else if (gunSee = false) {
    	
    }
    }*/
    
//    public void spawnEnemies() {
//    	final Timer spawn = new Timer(4000 - (200*level), new ActionListener() {
//    		
//    		@Override
//    		public void actionPerformed(ActionEvent e) {
//    			if (numbadguys < 4 + (level * 4) && level >= 2) {
//    				Badguy bg = new Badguy(level, false);
//    				badguys.add(bg);
//    				bg.hp = bg.hp + (level * 5);
//    				
//    				numbadguys++;
//    				if (numbadguys >= 4 &&)
//    					stopSpawning = true;
//    			}
//    		}
//    		
//    	}
//    }
	
	
    
	public void playIt(String filename) {
		
		try {
			InputStream in = new FileInputStream(filename);
			AudioStream as = new AudioStream(in);
			AudioPlayer.player.start(as);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	public void runGame() {
		final Timer run = new Timer(50, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				repaint();
			}
		});
		run.start();
	}
	
	
	
	public void paint(Graphics g) {
		System.out.println(gameStarted);
		if (gameStarted && !marioHit && !gameWon) {
		
		g.drawImage(mario.getImg(), mario.getxCoord(), mario.getyCoord(), mario.getWidth(), mario.getHeight(), this);
		if (!keyHeld) {
		g.drawImage(key.getImg(), key.getxCoord(), key.getyCoord(), key.getWidth(), key.getHeight(), this);
		}
		g.drawImage(lock.getImg(), lock.getxCoord(), lock.getyCoord(), lock.getWidth(), lock.getHeight(), this);
		if (!gunHeld) {
		g.drawImage(gun1.getImg(), gun1.getxCoord(), gun1.getyCoord(), gun1.getWidth(), gun1.getHeight(), this);
		}
		}
		
//		if (gameStarted = false) {
//		g.drawImage(title.getImg(), title.getxCoord(), title.getyCoord(), title.getWidth(), title.getHeight(), this);
//		}
		//g.drawString()
		
		//time++;		
		//g.fill3DRect(0, 0, 600, 400, false);
				//g.drawImage(maria.getImg(), maria.getxCoord(), maria.getyCoord(), maria.getWidth(), maria.getHeight(), this);
				//g.drawImage(wario.getImg(), wario.getxCoord(), wario.getyCoord(), wario.getWidth(), wario.getHeight(), this);
				//g.drawImage(badleft.getImg(), badleft.getxCoord(), badleft.getyCoord(), badleft.getWidth(), badleft.getHeight(), this);
		
		
		if (gameStarted && !marioHit) {
		for(int i = 0; i < badguys.size(); i++) {
			Badguy bg = (Badguy) badguys.get(i);
			g.drawImage(bg.getImg(), bg.getxCoord(), bg.getyCoord(), bg.getWidth(), bg.getHeight(), this);
			Rectangle r = new Rectangle(bg.getxCoord(), bg.getyCoord(), bg.getWidth(), bg.getHeight());
			bg.moveIt(mario.getxCoord(), mario.getyCoord());
			//if (time%8==0) {
			//	bg.setxCoord(bg.getxCoord() - 1);
			//}
			
			for(int j = 0; j < bullets.size(); j++) {
				Projectile k = (Projectile) bullets.get(j);
				
				if (k.getxCoord() > this.getWidth()) { bullets.remove(k); }
				if (time%8==0 && this.facing == 0) {
				k.setxCoord(k.getxCoord() + 1);
				} else if (time%8==0 && this.facing == 1) {
					k.setxCoord(k.getxCoord() - 1);
				}
				g.drawImage(k.getImg(), k.getxCoord(), k.getyCoord(), k.getWidth(), k.getHeight(), this);
				
				
				Rectangle kr = new Rectangle(k.getxCoord(), k.getyCoord(), k.getWidth(), k.getHeight());
				if (kr.intersects(r)) {
					//badguys.remove(i);
					bullets.remove(j);
					bg.hp = bg.hp - 20;
				} else 	if (bg.hp <= 0) {
					badguys.remove(i);
					playIt("files/oof.wav");
					 points = points + 1;
				}
			
				repaint();
			}
		}
	}
		if (!gameStarted) {
			g.drawImage(title.getImg(), title.getxCoord(), title.getyCoord(), title.getWidth(), title.getHeight(), this);
		}
		if (marioHit) {
			g.drawImage(gameover.getImg(), gameover.getxCoord(), gameover.getyCoord(), gameover.getWidth(), gameover.getHeight(), this);
			playIt("files/bruh.wav");
		}
		if (gameWon) {
			g.drawImage(youwin.getImg(), youwin.getxCoord(), youwin.getyCoord(), youwin.getWidth(), youwin.getHeight(), this);
			playIt("files/yay.wav"); 
		}
	}

	
	public void keyTyped(KeyEvent e) {
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		
		
		//for(int j = 0; j < bullets.size();) {
		//	Projectile k = (Projectile) bullets.get(j);
		if(!marioHit) {
		if (e.getKeyCode() == 83 && marioCanShoot && this.facing == 0 && gunHeld) {
			Projectile bullet = new Projectile(mario.getxCoord(), mario.getyCoord() , 15, 10, "files/bullet.png", 0);
			bullets.add(bullet);
			//bullet.setxCoord(bullet.getxCoord() + 1);
		} else if (e.getKeyCode() == 83 && marioCanShoot && this.facing == 1 && gunHeld) {
			Projectile bullet = new Projectile(mario.getxCoord(), mario.getyCoord() , 15, 10, "files/bullet.png", 1);
			bullets.add(bullet);
			//bullet.setxCoord(bullet.getxCoord() - 1);
		}
		
		if (e.getKeyCode() == 32) {
			gameStarted = true;
		}
		
		//}
		System.out.println(e);
		mario.moveIt(e.getKeyCode(), this.getWidth(), this.getHeight());
		//wario.moveIt(e.getKeyCode());
		
		Rectangle ggr = new Rectangle(mario.getxCoord(), mario.getyCoord(), mario.getWidth(), mario.getHeight());
		Rectangle a = new Rectangle(gun1.getxCoord(), gun1.getyCoord(), gun1.getWidth(), gun1.getHeight());
		Rectangle ky = new Rectangle(key.getxCoord(), key.getyCoord(), key.getWidth(), key.getHeight());
		Rectangle lk = new Rectangle(lock.getxCoord(), lock.getyCoord(), lock.getWidth(), lock.getHeight());
		
		if (ggr.intersects(ky)) {
			keyHeld = true;
		}
	
		if (ggr.intersects(lk) && keyHeld) {
			gameWon = true;
		}
		
		for(int a1 = 1; a1 < guns.size();) {
			Gun gn = (Gun) guns.get(a1);
			Rectangle gunr = new Rectangle(gun.getxCoord(), gun.getyCoord(), gun.getWidth(), gun.getHeight());
			if (gunr.contains(mario.getxCoord(), mario.getyCoord())) {
				guns.remove(a);
			}
			if (ggr.intersects(gunr)) {	
				gun.isVisible = false;
				gunHeld = true;
			} else {
				gunHeld = false;
			}
		}
		
		if (ggr.intersects(a)) {
			gunHeld = true;
		}
		for(int i = 0; i < badguys.size(); i++) {
			Badguy bg = (Badguy) badguys.get(i);
			Rectangle r = new Rectangle(bg.getxCoord(), bg.getyCoord(), bg.getWidth(), bg.getHeight());
			
			
			//if (r.contains(mario.getxCoord(), mario.getyCoord())) {
				//System.out.println("badguy hit by mario");
			if (ggr.intersects(r)) {
				marioHit = true;
			  //badguys.remove(i);
			  //mario.isVisible = false;
			  //mario.remove(ggr);
			}
		}
		repaint();
		}
	}

	

	private void remove(Rectangle a) {
		// TODO Auto-generated method stub
		
	}


	/*for(int a = 0; a < guns.size(); a++) {
		Gun gnn = (Gun) guns.get(a);
		Rectangle gn = new Rectangle(gn.getxCoord(), gn.getyCoord(), gn.getWidth(), gn.getHeight());
		
		
		//if (r.contains(mario.getxCoord(), mario.getyCoord())) {
			//System.out.println("badguy hit by mario");
		if (ggr.intersects(gn)) {	
		  guns.remove(a);
		  //mario.isVisible = false;
		  //mario.remove(ggr);
		}
	}
	repaint();
}
	*/
	
	
	

	

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	if (!marioHit) {
		if (e.getKeyCode() == 39) { 
			if (!gunHeld) {
			mario.setImg("files/soldiersprites/soldierrunright2.png");
			} else if (gunHeld) {
				mario.setImg("files/soldiersprites/soldierrunrightgun2.png");
			}
			marioCanShoot = false;
			facingRight = true;
			

		}
		if (e.getKeyCode() == 37) {
			if (!gunHeld) {
			mario.setImg("files/soldiersprites/soldierrunleft2.png");
			} else if (gunHeld) {
				mario.setImg("files/soldiersprites/soldierrunleftgun2.png");
			}
			marioCanShoot = false;
			facingRight = false;
		
		}
		if (e.getKeyCode() == 69) {
			mario.setImg("files/soldiersprites/soldierjump.png");
			marioCanShoot = false;
		
		}
		if (e.getKeyCode() == 38) {
			if (!gunHeld) {
			mario.setImg("files/soldiersprites/soldierwalkupleft2.png");
			} else if (gunHeld) {
				mario.setImg("files/soldiersprites/soldierwalkupleftgun2.png");
			}
			marioCanShoot = false;
			facingRight = false;
		
		}
		if (e.getKeyCode() == 40) {
			if (!gunHeld) {
			mario.setImg("files/soldiersprites/soldierwalkdownright2.png");
			} else if (gunHeld) {
				mario.setImg("files/soldiersprites/soldierwalkdownrightgun2.png");
			}
			marioCanShoot = false;
			facingRight = true;
		
		}
		if (e.getKeyCode() == 67) {
			if (gunHeld) {
			mario.setImg("files/soldiersprites/soldiercrouchrightgun2.png");
			}
			marioCanShoot = true;
			facingRight = true;
			this.facing = 0;
		}
		if (e.getKeyCode() == 86) {
			if (gunHeld) {
			mario.setImg("files/soldiersprites/soldiercrouchleftgun2.png");
			}
			marioCanShoot = true;
			facingRight = false;
			this.facing = 1;
		}
	}
		repaint();
	}




	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
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

	

	//public MyCanvas(xCoord,yCoord, width, height, int facing = 0;)
	

	

}
