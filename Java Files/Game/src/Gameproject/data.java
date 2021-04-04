package Gameproject;
import java.util.Random;
import java.util.Scanner;
public class data {
	
	public static boolean robeOfTahuti = false;
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		Random r = new Random();
		// int
		int manaminimum = 0;
		int bearhealth = 200;
		int boarhealth = 315;
		int magehealth = 253;
		int magemana = 400;
		//Story.
		System.out.println("In the lovely Winterspring forest, a mighty mage journed through the Timbermaw Hold camp of fierce wild bears. As he passed through, one of the bears engaged in a fight.");
		//choice fight or flee
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
										
							
									
									String armor = input.next();
									System.out.println("Choose between 1,2..");
									if(armor.contentEquals("1")) {
										if(robeOfTahuti == false) {
										magehealth += rodhealth;
										magemana += rodmana;
										gold -= 35;
										}else if(robeOfTahuti == true) {
											System.out.println("You already have that item.");
										}
										}robeOfTahuti = true;
										String stats = input.next();
										if (stats.toUpperCase().contains("STATS")) {
											System.out.println("Your current stats are \n Health: "+magehealth+"\n Mana: "+magemana);
										}
										System.out.println("Your health has increased with "+rodhealth+" and your mana with "+ rodmana);
										System.out.println("Type *stats* if you want to view your current stats: ");
										}
										}
									
									
																			
									}
								}
							}
						
				
				}
			

	

