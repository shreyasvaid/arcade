package gametest;
import java.util.*;

public class arcade {
	static int score = 0;
	
	
	public static void main(String[] args) {
		entermessage();
		
		
	}
	public static void entermessage() {
		System.out.println("Welcome to the game! Lets get you started so that we can start having some fun.");
		System.out.println("You have a score. As of right now your score is: " + score);
		if(score > 2) {
			System.out.println("Congrats. Welcome to rank 2!");
		} else if(score > 3) {
			System.out.println("Congrats! Welcome to rank 3!");
		}
		System.out.println("You can increase this score by performing tasks! If you do a task correctly your score goes up!");
		System.out.println("If you get to a high enough score, then you get a new rank and your score resets.");
		System.out.println("With ranks you can get access to different tasks and games which are more efficient in bringing your score up. Have fun! ");
		System.out.println("Alright! Lets get you started with the games");
		System.out.println("If you would like to play a number guessing game, type in 'game' in your window. If you would like to play another type in 'game2' ");
	
		Scanner scan = new Scanner(System.in);
		String x = scan.nextLine();
			if(x.equals("game")) {
				System.out.println(score);
				game1();
			}else if(x.equals("game2")) {
				System.out.println(score);
				game2();
			}
	}
	public static void game1() {
		System.out.println("Alright! This is the number guessing game!");		
		System.out.println("We are going to pick a number between 0 and 10");		
		System.out.println("If you guess correctly, your score goes up!");
		int x = (int) (Math.random() * 10 );
		Scanner s = new Scanner(System.in);
		int y = s.nextInt();
		if(y == x) {
			System.out.println("Congrats you got it right!");
			score ++;
			System.out.println("Your new score is " + score);
			System.out.println("do you want to play again? if yes, then type yes. if you would like to go to the menu, type menu. If you would like to exit, type exit");
			Scanner sup = new Scanner(System.in);
			String t = sup.nextLine();
			if(t.equals("yes") || t.equals("YES") || t.equals("yEs") || t.equals("Yes") || t.equals("yeS") || t.equals("YEs")) {
				game1();
			}else if(t.equals("menu")) {
				entermessage();
			} else if(t.equals("exit")) {
				System.out.println("Thanks for playing! Your final score is: " + score);
			}
		}else {
			System.out.println("Sorry you got it wrong!");
			System.out.println("do you want to play again? if yes, then type yes. if you would like to go to the menu, type menu. If you would like to exit, type exit.");

			Scanner sca = new Scanner(System.in);
			String u = sca.nextLine();
						if(u.equals("yes")) {
				System.out.println(score);
				game1();
			} else if(u.equals("menu")) {
				entermessage();
			} else if(u.equals("exit")) {
				System.out.println("Thanks for playing! Your final score is: " + score);
			}
		}
		
	}
	public static void game2() {
		System.out.println("This is the buzzfeed quiz game");
		System.out.println("We are going to try and see what Harry Potter house you fall in!");
		System.out.println("Alright, first question: Do you like horror movies? (yes/no)");
		Scanner st = new Scanner(System.in);
		String u = st.nextLine();
		if(u.equals("yes")) {
			System.out.println("Do you like sleeping in? (yes/no) ");
			u = st.nextLine();
			if(u.equals("yes")) {
				System.out.println("You are a Slytherin!");
			} else if(u.equals("no")) {
				System.out.println("You are a Gryffindor!");
			}
		} else if(u.equals("no")) {
			System.out.println("Do you like comedy movies (yes/no)");
			u = st.nextLine();
			if(u.equals("yes")) {
				System.out.println("You are a Hufflepuff.");
				
			} else if(u.equals("no")) {
				System.out.println("You are a Ravenclaw!");
			}
			
		}
	}
	
	
	
	
}
