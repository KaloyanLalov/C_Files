package Gameproject;
import java.util.Random;
import java.util.Scanner;
public class BearHealth {
	
	
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		Random r = new Random();
		// int
		int manaminimum = 0;
		int bearhealth = 200;
		int magehealth = 253;
		int magemana = 400;
		
		System.out.println("What do you choose - Fight or Flee?");
		for (int a = 0 ; 1 > 0; a++) {
		String answer = input.next();
			//If you choose FIGHT
		
			if(answer.toUpperCase().contains ("FIGHT")) {
				System.out.println("You have chosen to fight with the bear. ");
				System.out.println("Your damaging spells and attacks:");
				System.out.println("");
				System.out.println("Scorch spell - 17-31 damage, 50 mana cost.");
				System.out.println("Staff attack - 6-20 damage, no mana cost.");
				System.out.println("");
				
					 
					//everything needed for fight choice
				for (int x = 0 ; 1 > 0; x++) {
				int Bdmg = r.nextInt(25)+9;
				int Bcritdmg = Bdmg * 2;
				int staffdmg = r.nextInt(6)+14;
				int Scorchdmg = r.nextInt(17)+14;
				int Mchancetohit = r.nextInt(100)+1;
				int Bchancetohit = r.nextInt(100)+1;
				int gold = r.nextInt(50)+10;
				// in case mage dies
				if (magehealth <=0) {
					System.out.println("You have died.");
				break;
				}
				if (bearhealth <=0) {
					System.out.println("You have killed the bear.");
					break;
				}
				
			
				//Mage and bear stats
				
				System.out.println("Mage Health: " +magehealth+" / Mage Mana: "+magemana);
				
				System.out.println("Bear health: " +bearhealth);
					//combat.
				
			String hit = input.next();
					
					
			//scorch ability
			
					if (hit.toUpperCase().contains("SCORCH") && Mchancetohit >= 40 && magemana >=50) {
						System.out.println("You have hit the bear for "+ Scorchdmg+" damage.");
						bearhealth -= Scorchdmg;
						magemana -= 50;
					
					}else if (hit.toUpperCase().contains("SCORCH") && Mchancetohit < 40) {
					System.out.println("You missed your spell.");
					magemana -= 50;
					}else if (hit.toUpperCase().contains("SCORCH")&& magemana < 50) {
						System.out.println("You don't have enough mana for Scorch.");
						System.out.println("Use *Staff* to attack. ");
					}
					else if (hit.toUpperCase().contains("STAFF") && Mchancetohit >= 30 ) {
						System.out.println("You have hit the bear for "+ staffdmg+" damage.");
						bearhealth -= staffdmg;
						magemana -= 0;
					}else if (hit.toUpperCase().contains("STAFF") && Mchancetohit < 30 ) {
						System.out.println("You have missed your attack.");
						
					} if(Bchancetohit >= 50) {
							System.out.println("The bear has hit you for "+ Bdmg+ " damage" );
							magehealth -= Bdmg;
						}else if (Bchancetohit < 50) {
							System.out.println("The bear has missed");
						}
				}
				
			}
		}
	}
}
