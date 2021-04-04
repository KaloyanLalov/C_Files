package Gameproject;
import java.util.Random;
import java.util.Scanner;
public class Boarfight {
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		Random r = new Random();
		// int
		int manaminimum = 0;
		int bearhealth = 200;
		int boarhealth = 265;
		int magehealth = 253;
		int magemana = 400;
	for (int z = 0 ; 1 > 0; z++) {
		String walk = input.next();
			//If you choose FIGHT
		
			if(walk.toUpperCase().contains ("WALK")) {
				System.out.println("On the path you get startled by a boar that charges your way. You take out your staff and hit the bear in the head and cause him 50 damage. ");
				System.out.println("Your damaging spells and attacks:");
				System.out.println("");
				System.out.println("Scorch spell - 17-31 damage, 50 mana cost.");
				System.out.println("Staff attack - 6-20 damage, no mana cost.");
				System.out.println("");
				
					 
					//everything needed for fight choice
				for (int x = 0 ; 1 > 0; x++) {
				int Boardmg = r.nextInt(25)+9;
				int Boarcritdmg = Boardmg * 2;
				int staffdmg = r.nextInt(6)+14;
				int Scorchdmg = r.nextInt(17)+14;
				int Mchancetohit = r.nextInt(100)+1;
				int Boarchancetohit = r.nextInt(100)+1;
				// in case mage dies
				if (magehealth <=0) {
					System.out.println("You have died.");
				break;
				}
				if (boarhealth <=0) {
					System.out.println("You have killed the bear.");
					break;
				}
				
			
				//Mage and bear stats
				
				System.out.println("Mage Health: " +magehealth+" / Mage Mana: "+magemana);
				
				System.out.println("Bear health:"+boarhealth+"/315");
					//combat.
				
			String hit2 = input.next();
					
					
			//scorch ability
			
					if (hit2.toUpperCase().contains("SCORCH") && Mchancetohit >= 25 && magemana >=50) {
						System.out.println("You have hit the bear for "+ Scorchdmg+" damage.");
						boarhealth -= Scorchdmg;
						magemana -= 50;
					
					}else if (hit2.toUpperCase().contains("SCORCH") && Mchancetohit < 25) {
					System.out.println("You missed your spell.");
					magemana -= 50;
					}else if (hit2.toUpperCase().contains("SCORCH")&& magemana < 50) {
						System.out.println("You don't have enough mana for Scorch.");
						System.out.println("Use *Staff* to attack. ");
					
					}else if (hit2.toUpperCase().contains("STAFF") && Mchancetohit >= 20 ) {
						System.out.println("You have hit the bear for "+ staffdmg+" damage.");
						boarhealth -= staffdmg;
						magemana -= 0;
					}else if (hit2.toUpperCase().contains("STAFF") && Mchancetohit < 20 ) {
						System.out.println("You have missed your attack.");	
					}if(Boarchancetohit >= 45) {
							System.out.println("The bear has hit you for "+ Boardmg+ " damage" );
							magehealth -= Boardmg;
						}else if (Boarchancetohit < 50) {
							System.out.println("The bear has missed");
				}
			}

			}
}
}
}