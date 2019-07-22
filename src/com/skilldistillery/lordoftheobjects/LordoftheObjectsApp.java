package com.skilldistillery.lordoftheobjects;

import java.util.Scanner;

public class LordOfTheObjectsApp {
	public static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			splashScreen();
			enterInfo();
			Intro();
			choice();
			if (Hero.getremainingHealth() >= 1) {
				outroSuccess();
			} else if(Hero.getremainingHealth()<=0){
				outroFailure();
			}
		}
	}

	public static void splashScreen() {
		System.out.println("* Beer ---------------------------------- Liquor  *");
		System.out.println("* ----------------------------------------------- *");
		System.out.println("* ---------------- PUB HERO --------------------- *");
		System.out.println("* ------- A tale of Sad Circumstance ------------ *");
		System.out.println("* ----------------------------------------------- *");
		System.out.println("* --------- Press Enter to Continue ------------- *");
		System.out.println("* ---------  Close Console to Exit ------ Regret  *");
		System.out.println("* --------------------------------------- Shame   *");
		System.out.println("* Wine ---------------------------------- No Tab  *\n\n");
		try {
			System.in.read();
		} catch (Exception e) {
		}
	}

	private static void enterInfo() {
		Hero player = new Hero();
		Hero.setremainingHealth(30);
		Liquor.setremainingHealth(15);
		Beer.setremainingHealth(5);
		Wine.setremainingHealth(10);
		String playerName= null;
//		String playerSex = null;
		System.out.println("What's your name, champ?");
		playerName = scan.nextLine();
		player.setName(playerName);
//		System.out.println("Female or Male? Y'know, for cover charge.");
//		playerSex = scan.nextLine();
//		player.setSex(playerSex);  //Needs debugging
	}

	public static void Intro() {
		System.out.println("\nBartender: Welcome, " + Hero.getName()
				+ ", to the Lost Drunkards Tavern! Glad to see you gracing our fine establishment once again. "
				+ "\n\nSo what will it be for you today? We are having a 3 bottle special tonight: "
				+ "\nif you can finish 3 bottles: one each of beer, wine, and liquor your tab is on the house.\n\n");
	}

	public static void choice() {

		String[] options = { "1. Have a bottle of Beer.", "2. Have a bottle of Wine.", "3. Have a bottle of liquor." };

		while (options[0] !=  null || options[1] !=  null || options[2] !=  null ) {
			System.out.println("1. Have a bottle of Beer." + "\n" + "2. Have a bottle of Wine." + "\n"
					+ "3. Have a bottle of liquor.");
			;

			int choice = scan.nextInt();

			if (choice == 1) {
				if (options[0] != null) {
					beer();
					options[0] = null;
				} else if (options[0] == null) {
					System.out.println("You've already had a bottle, why dont you try something else.\n");
					continue;
				}
			}

			else if (choice == 2) {
				if (options[1] != null) {
					wine();
					options[1] = null;
				} else if (options[1] == null) {
					System.out.println("You've already had a bottle, why dont you try something else.\n");
					continue;
				}
			}

			else if (choice == 3) {
				if (options[2] != null) {
					liquor();
					options[2] = null;
				} else if (options[2] == null) {
					System.out.println("You've already had a bottle, why dont you try something else.\n");
					continue;
				}
			} else
				continue;
		}
	}

	public static void beer() {
//		Beer beer = new Beer();
		while (true) {
			methodOfIngest();
			Beer.setremainingHealth(Beer.getremainingHealth() - Alcohol.getAlcoholDamage());
			System.out.println("Bottle Level: " + Beer.getremainingHealth() + "/5");
			System.out.println(
					"You drink some beer. It's bitter but you persevere. You try to think happy thoughts of times before your wife left you "
							+ "\nand took the kids and you lost your house in a fire which unfortunately you could not claim on your insurance due "
							+ "\nto an unfortunate lapse in your payments caused by a changed debit card number that had taken place when you had your wallet "
							+ "\nstolen the prior week when you were mugged and had your fathers heirloom watch taken which he had kept in un\"holy\" places "
							+ "\nfor the course of several years during his stint in Vietnam in which he lost his mind driving a wedge between him and your mother "
							+ "\nwhich led to an early grave for them both.. but at least you have your health.\n");
			if (Beer.getremainingHealth() <= 0 || Hero.getremainingHealth() <= 0) {
				break;
			}
			methodOfIngest();
			Beer.setremainingHealth(Beer.getremainingHealth() - Alcohol.getAlcoholDamage());
			System.out.println("Bottle Level: " + Beer.getremainingHealth() + "/5");
			System.out.println(
					"The strong scent of hops make you gag but you take another chug. You barely catch your regurgitating contents as they demand "
							+ "\nrelease from the confines of your belly.\n");
			if (Beer.getremainingHealth() <= 0 || Hero.getremainingHealth() <= 0) {
				break;
			}
			methodOfIngest();
			Beer.setremainingHealth(Beer.getremainingHealth() - Alcohol.getAlcoholDamage());
			System.out.println("Bottle Level: " + Beer.getremainingHealth() + "/5");
			System.out.println(
					"You don't know how much more of this you can handle but you push on. Gulp gulp. A hero such as you is not defeated so easily!");
			if (Beer.getremainingHealth() <= 0 || Hero.getremainingHealth() <= 0) {
				break;
			}
		}
	}

	public static void wine() {
//		Wine wine = new Wine();
		while (true) {
			methodOfIngest();
			Wine.setremainingHealth(Wine.getremainingHealth() - Alcohol.getAlcoholDamage());
			System.out.println("Bottle Level: " + Wine.getremainingHealth() + "/10");
			System.out.println(
					"The wine is a cheap off brand and you know you will regret it in the morning but you drink it down anyways. Good life choices "
							+ "\nhave never been your forte.\n");
			if (Wine.getremainingHealth() <= 0 || Hero.getremainingHealth() <= 0) {
				break;
			}
			methodOfIngest();
			Wine.setremainingHealth(Wine.getremainingHealth() - Alcohol.getAlcoholDamage());
			System.out.println("Bottle Level: " + Wine.getremainingHealth() + "/10");
			System.out.println(
					"The color of the wine reminds you of rancid watermelon and it smells like gym socks, you suck it down regardless. "
							+ "\nYou have flashbacks of the many socks that were shoved in your mouth by Tommy Shoback in the 8th grade during P.E.. You "
							+ "\nremember the unfortunate case of Athletes Foot that spread to your mouth because of this and your first girlfriend "
							+ "\nSarah Wilson whom you had had a crush on since the 3rd grade, who left you due to the fungal infection... for "
							+ "\nTommy Shoback..Your current Manager.\n");
			if (Wine.getremainingHealth() <= 0 || Hero.getremainingHealth() <= 0) {
				break;
			}
			methodOfIngest();
			Wine.setremainingHealth(Wine.getremainingHealth() - Alcohol.getAlcoholDamage());
			System.out.println("Bottle Level: " + Wine.getremainingHealth() + "/10");
			System.out.println(
					"Your stomach is turning from the bitter swill but you drink on, continuing to fight your metaphorical windmill with all your "
							+ "\nmight for that glorious prize at the end of the dark tunnel..no bar tab.\n ");
			if (Wine.getremainingHealth() <= 0 || Hero.getremainingHealth() <= 0) {
				break;
			}
		}
	}

	public static void liquor() {
//		Liquor liquour = new Liquor();
		while (true) {
			methodOfIngest();
			Liquor.setremainingHealth(Liquor.getremainingHealth() - Alcohol.getAlcoholDamage());
			System.out.println("Bottle Level: " + Liquor.getremainingHealth() + "/15");
			System.out.println(
					"Liquor, sweet nectar of the Gods. The Chosen One. The only escape from the humility and mundanity of your pathetic existence. "
							+ "\nYou take your first sip gingerly, a weary yet welcoming embrace to a dear old friend.\n");
			if (Liquor.getremainingHealth() <= 0 || Hero.getremainingHealth() <= 0) {
				break;
			}
			methodOfIngest();
			Liquor.setremainingHealth(Liquor.getremainingHealth() - Alcohol.getAlcoholDamage());
			System.out.println("Bottle Level: " + Liquor.getremainingHealth() + "/15");
			System.out.println(
					"As you drink the bottle you begin to forget all the many mistakes that have led you to this horrid little pub. Your thoughts are "
							+ "\nfading out as your view swims in front of your face.\n");
			if (Liquor.getremainingHealth() <= 0 || Hero.getremainingHealth() <= 0) {
				break;
			}
			methodOfIngest();
			Liquor.setremainingHealth(Liquor.getremainingHealth() - Alcohol.getAlcoholDamage());
			System.out.println("Bottle Level: " + Liquor.getremainingHealth() + "/15");
			System.out.println(
					"You are nearing completion, you are going to get through this, you are going to show Sarah Wilson why she should have chose you "
							+ "\nand not Tommy Shoback, with his Lamborghini Countach and summer home in the Hamptons. But You have something more than Tommy Shoback "
							+ "\nwill ever have, you have a back story! Tommy Shoback only has 2 references in a silly program written by an amateur Java programmers!\n");
			if (Liquor.getremainingHealth() <= 0 || Hero.getremainingHealth() <= 0) {
				break;
			}
		}
	}

	public static void outroFailure() {

		System.out.println(
				"Oh no. You blacked out and soiled yourself! Mrs. Chan at the launder is not gonna be happy about these stains :( .\n");
		pressEnterToPlay();
	}

	public static void outroSuccess() {
		System.out.println(
				"You did it!!! Congratulations, not only are you going home tonight with the same exact amount you had in your wallet coming in here but "
						+ "\nyou are leaving with the pride of knowing that for the first time in as long as you can remember you didn't give up!! You met the challenge in "
						+ "\nfront of you head on and saved the proverbial princess from the metaphorical dragon!! Your treasure is better than riches however, it is even "
						+ "\nbetter than life lessons! It is freaking Tommy Shoback's Countach parked across the street at the Marriott! Now you go slash those tires and get "
						+ "\nsome freakin revenge!\n");
		pressEnterToPlay();
	}

	public static void methodOfIngest() {
		System.out.println("Select Sip(1), Swig(2), or Chug(3)");
		int pickYourPoison = scan.nextInt();
		switch (pickYourPoison) {
		case 1:
			int sipDam;
			int alcDam;
			sipDam = (int) (Math.random() * 1 + 1);
			alcDam = (int) (Math.random() * 1 + 1);
			Alcohol.setAlcoholDamage(alcDam);
			Hero.setremainingHealth(Hero.getremainingHealth() - sipDam);
			System.out.println(Hero.getName() + " health: " + Hero.getremainingHealth());
			break;
		case 2:
			int swigDam;
			int alcDam1;
			swigDam = (int) (Math.random() * 2 + 1);
			alcDam1 = (int) (Math.random() * 3 + 1);
			Hero.setremainingHealth(Hero.getremainingHealth() - swigDam);
			Alcohol.setAlcoholDamage(alcDam1);
			System.out.println(Hero.getName() + " health: " + Hero.getremainingHealth());
			break;
		case 3:
			int chugDam;
			int alcDam2;
			chugDam = (int) (Math.random() * 4 + 1);
			alcDam2 = (int) (Math.random() * 5 + 1);
			Alcohol.setAlcoholDamage(alcDam2);
			Hero.setremainingHealth(Hero.getremainingHealth() - chugDam);
			System.out.println(Hero.getName() + " health: " + Hero.getremainingHealth());
			break;
		default:
			System.out.println("Select Sip(1), Swig(2), or Chug(3)");
		}

	}

	public static void pressEnterToPlay() {
		System.out.println("Press Enter to play again.\n");
		try {
			System.in.read();
		} catch (Exception e) {
		}
	}
}