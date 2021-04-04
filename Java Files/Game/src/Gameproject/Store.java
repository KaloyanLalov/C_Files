package Gameproject;
import java.util.Scanner;
import java.util.Random;
public class Store {
	public static boolean robeOfTahuti = false;

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
			Random r = new Random();
		System.out.println("What do you choose - Fight or Flee?");
		int manaminimum = 0;
		int bearhealth = 200;
		int boarhealth = 315;
		int magehealth = 253;
		int magemana = 400;
		for (int a = 0 ; 1 > 0; a++) {
		
		String answer = input.next();
		if(answer.toUpperCase().contains ("FLEE")) {
			
			
			System.out.println("You have chosen to flee from the enemy. You followed the path and you meet a vendor along the way.");
			System.out.println("You greet the vendor and he offers you armor. Do you wish to buy or keep walking.");
				for (int k = 0; 1>0;k++) {
				int rodhealth = 43;
				int rodmana = 72;
				int Shoulderhealth = 32;
				int shouldermana = 54;
				int bootshealth = 34;
				int bootsmana = 21;
				int capehealth = 25;
				int capemana = 44;
				int gold = r.nextInt(10)+50;
				String answer1 = input.next();
					if(answer1.toUpperCase().contentEquals("BUY")) {
						System.out.println("You currently have "+ gold+" gold in total. Use them wisely.");
						System.out.println("----------------------------------------------------------------");
						System.out.println("1. Robe of Tahuti \n +43 health / +72 mana / -35 gold");
						System.out.println("----------------------------------------------------------------");
						
			
						System.out.println("Choose between 1,2..");
					String armor = input.next();
					if(armor.contentEquals("1")) {
						if(robeOfTahuti == false) {
						magehealth += rodhealth;
						magemana += rodmana;
						gold -= 35;
						}else if(robeOfTahuti == true) {
							System.out.println("You already have that item.");
						robeOfTahuti = true;
						}
						}
					else if (armor.contentEquals("2")) {
						
					}
						
					String stats = input.next();
					System.out.println("Type *stats* if you want to view your current stats: ");
					if (stats.toUpperCase().contains("STATS")) {
							System.out.println("Your current stats are \n Health: "+magehealth+"\n Mana: "+magemana);
						
						System.out.println("Your health has increased with "+rodhealth+" and your mana with "+ rodmana);
						
						}
					
				}
				}
	}
	}
}
}
