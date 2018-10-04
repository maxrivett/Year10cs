import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
public class Choose {
	public static void main(String [] args) {
		System.out.println("You see a scary house. You are with your friends. Do you investigate? Y or N");
		Scanner inputChoice = new Scanner(System.in);
		String choice = inputChoice.nextLine();
		String upchoice = choice.toUpperCase();
		if (upchoice.equals("Y")) {
			System.out.println("You are very brave. You sneak in the side door.");
		} else {
			System.out.println("You and your friends are chickens. Try again.");
			return;
		}
		
		System.out.println("The side door creaks! Zombies awake. A. Continue or B. Leave?");
		//Scanner inputChoice = new Scanner(System.in);
		choice = inputChoice.nextLine();
		upchoice = choice.toUpperCase();
		
		if (upchoice.equals("A")) {
			System.out.println("You find a baseball bat and destroy the first zombie you see. Run upstairs!");
		} else {
			System.out.println("You barely survive, but leave without your pride and self-respect. Try again.");
			return;
		}	
			System.out.println("You reach the second floor and see even more zombies! A. Run to the third floor or B. Stay on the second floor?");
		//Scanner inputChoice = new Scanner(System.in);
		choice = inputChoice.nextLine();
		upchoice = choice.toUpperCase();
		
		if (upchoice.equals("A")) {
			System.out.println("You successfully run up the stairs.");
		} else {
			System.out.println("The zombies come for you and you don't have enough baseball bats or hands to fend them off. You die! Try again.");
			return;
		}
			System.out.println("You get to the third floor and you don't see any zombies here but you notice you left your friends on the second floor. There is a ladder to the roof, a possible getaway! A. Climb the ladder or B. Help your friends?");
			//Scanner inputChoice = new Scanner(System.in);
			choice = inputChoice.nextLine();
			upchoice = choice.toUpperCase();
			
		if (upchoice.equals("A")) {
				System.out.println("The rungs of the ladder are slippery but you manage to reach the rooftop.");
			} else {
				System.out.println("You go back down and find your friends being torn apart but you die knowing you did the right thing. Try again.");
				return;
		}
		
		System.out.println("Once on the roof, you notice that you are surrounded in thick, ominous fog. A. Go back down to the third floor or B. Wait for the fog to clear?");
		//Scanner inputChoice = new Scanner(System.in);
		choice = inputChoice.nextLine();
		upchoice = choice.toUpperCase();
		
	if (upchoice.equals("B")) {
			System.out.println("The fog eventually clears and you can see the entire roof, you have to find a way out of this place.");
		} else {
			System.out.println("You go back down to zombies grabbing at you from all angles, you try to befriend them, but they are hungry. You die. Try again.");
			return;
		}
		
		System.out.println("You walk to the edge of the roof to gauge how high above ground you are. You see countless skeletons on the ground, you aren't the first to try this. A. Jump off the edge and try to land it or B. Look around you?");
		//Scanner inputChoice = new Scanner(System.in);
		choice = inputChoice.nextLine();
		upchoice = choice.toUpperCase();
		
	if (upchoice.equals("B")) {
			System.out.println("You look around you and and see a long rope coiled on the ground.");
		} else {
			System.out.println("As soon as you jump you realize this was the wrong decision, you plummet to your sad death. Try again.");
			return;
		}
		
		System.out.println("The rope looks long enough to use to get to the ground without serious damage, but you are tempted to use the rope as a lasso to kill the zombies and fulfill your lifelong dream of being like Indiana Jones. A. Use it to reach the ground floor or B. Be Indiana Jones?");
		//Scanner inputChoice = new Scanner(System.in);
		choice = inputChoice.nextLine();
		upchoice = choice.toUpperCase();
		
	if (upchoice.equals("A")) {
			System.out.println("You make it to the bottom but feel a pop in your right knee.");
		} else {
			System.out.println("You live out your dream but die 20 seconds later, try again.");
			return;
		}
		
		System.out.println("The fall hurt you and for whatever reason you see painkillers through the window of the house, and the coast looks clear. A. Go for the meds or B. Hobble away from this awful place?");
		//Scanner inputChoice = new Scanner(System.in);
		choice = inputChoice.nextLine();
		upchoice = choice.toUpperCase();
		
	if (upchoice.equals("B")) {
			System.out.println("You limp your way out of there, but with a lot of pain. You know will have to stop soon.");
		} else {
			System.out.println("You go inside but the zombies were waiting for you, you should've known that it wouldn't be this easy. You die. Try again.");
			return;
		}
		
		System.out.println("You remember which way you came, but it is now very dark. You have a choice to make. A. Hide in a bush and wait until morning or B. Try to make your way home?");
		//Scanner inputChoice = new Scanner(System.in);
		choice = inputChoice.nextLine();
		upchoice = choice.toUpperCase();
		
	if (upchoice.equals("B")) {
			System.out.println("You find your way home but leave with less friends than you came with. In a sense, you lost; but I'll tell you that you'ves won in surviving. Congratulations.");
			class ShowPicture {
				 void main(String args[]) {
					 //took out public static from line above because it was causing errors
			  JFrame frame = new JFrame();
			  ImageIcon icon = new ImageIcon("thumbsup.png");
			  JLabel label = new JLabel(icon);
			  frame.add(label);
			  frame.setDefaultCloseOperation
			         (JFrame.EXIT_ON_CLOSE);
			  frame.pack();
			  frame.setVisible(true);
			 }
			}
		} else {
			System.out.println("The zombies aren't quitters, they check outside. You die, try again. ");
			return;
		}
	}
}