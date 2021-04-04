package database;
import java.util.Scanner;
import java.util.Random;
public class products {
	public static int itemn0, itemn1, itemn2, itemn3, itemn4, itemn5, itemn6, itemn7, itemn8, itemn9, itemn10,
	itemn11, itemn12, itemn13, itemn14, itemn15, itemn16, itemn17, itemn18, itemn19, itemn20; 
	public static boolean codeCheck;
	public static boolean admin;
	public static int originaliphone = 0;
	public static int iphone3g = 0;
	public static int iphone3gs = 0;
	public static int iphone4 = 0;
	public static int iphone4s = 0;
	public static int iphone5 = 0;
	public static int iphone5s = 0;
	public static int iphone5c = 0;
	public static int iphone6 = 0;
	public static int iphone6plus = 0;
	public static int iphone6s = 0;
	public static int iphone6splus = 0;
	public static int iphoneSE = 0;
	public static int iphone7 = 0;
	public static int iphone7plus = 0;
	public static int iphone8 = 0;
	public static int iphone8plus = 0;
	public static int iphonex = 0;
	public static int iphonexr = 0;
	public static int iphonexs = 0;
	public static int iphonexsmax = 0;
	public static String defaultmessage  = "What are your options: "
			+ "\n You can input any Iphone model or the number on the list to view it's properties."
			+ "\n 'budget' Used to check your balance and your affordable phones "
			+ "\n 'inventory' will show you all the items you have bought."
			+ "\n 'christmas' 50£ discount to all products. Merry Christmas! "
			+ "\n 'admin' Once used, You can use the comands 'set price' and 'set stock' "
			+ "\n 'exit program' Used to exit the program."
			+ "\n 'options' to access the options."
			+ "\n You can only access those options in the menu, so before typing in any option, please type in 'menu' before doing so.";
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		Random r = new Random();
		codeCheck = false;
		admin = false;
	//model,company,processor, storage,year,price,quantity sold (ITEMS)
		int discount = 50;
		 itemn0 = r.nextInt(10)+1;
		 itemn1 = r.nextInt(10)+1;
		 itemn2 = r.nextInt(10)+1;
		 itemn3 = r.nextInt(10)+1;
		 itemn4 = r.nextInt(10)+1;
		 itemn5 = r.nextInt(10)+1;
		 itemn6 = r.nextInt(10)+1;
		 itemn7 = r.nextInt(10)+1;
		 itemn8 = r.nextInt(10)+1;
		 itemn9 = r.nextInt(10)+1;
		 itemn10 = r.nextInt(10)+1;
		 itemn11 = r.nextInt(10)+1;
		 itemn12 = r.nextInt(10)+1;
		 itemn13 = r.nextInt(10)+1;
		 itemn14 = r.nextInt(10)+1;
		 itemn15 = r.nextInt(10)+1;
		 itemn16 = r.nextInt(10)+1;
		 itemn17 = r.nextInt(10)+1;
		 itemn18 = r.nextInt(10)+1;
		 itemn19 = r.nextInt(10)+1;
		 itemn20 = r.nextInt(10)+1;
	data item0 = new data ("0. Original Iphone", "Apple","S5L8900","4GB/8GB/16GB","29.06.2007",499,"£","3.7 million",0);	
	data item1 = new data ("1. Iphone 3G","Apple","S5L8900","8GB/16GB","09.06.2008",599,"£","17.3 million",0);
	data item2 = new data ("2. Iphone 3GS","Apple","S5L8920","8GB/16GB/32GB","19.08.2009",599,"£","50 million",0);			
	data item3 = new data ("3. Iphone 4","Apple","S5L8930 'A4' ","8GB/16GB/32GB","24.10.2010",599,"£","108 million", 0);
	data item4 = new data ("4. Iphone 4S","Apple","S5L8940 'A5' ","16GB/32GB/64GB","11.1O.2O11",649,"£","319 million", 0);
	data item5 = new data ("5. Iphone 5","Apple","S5L8950 'A6' ","16GB/32GB/64GB","21.09.2012",649,"£","319 million",0);
	data item6 = new data ("6. Iphone 5S","Apple","S5L8960 'A7' ","16GB/32GB/64GB","20.09.2013",649,"£","500 million(Together with Iphone 5c",0);
	data item7 = new data ("7. Iphone 5c","Apple","S5L8950 'A6' ","16GB/32GB/64GB","20.09.2013",649,"£","500 million(together with Iphone 5s",0);
	data item8 = new data ("8. Iphone 6","Apple","T7000 'A8' ","16GB/64GB/128GB","09.09.2014",649,"£","773.8 million(Together with Iphone 6 plus",0);
	data item9 = new data ("9. Iphone 6 plus","Apple","T7000 'A8' ","16GB/64GB/128GB","09.09.2014",749,"£","773.8 million(Together with Iphone 6",0);
	data item10 = new data ("10. Iphone 6s","Apple","S8000 and S8003 'A9' ","16GB/64GB/128GB","09.09.2015",649,"£","1 Billion(Together with Iphone 6s plus and Iphone SE",0);
	data item11 = new data ("11. Iphone 6s plus","Apple","S8000 and S8003 'A9' ","16GB/64GB/128GB","09.09.2015",749,"£","1 billion(Together with Iphone 6 and Iphone SE",0);
	data item12 = new data ("12. Iphone SE","Apple","S8000 and S8003 'A9'","16GB/32GB/64GB/128GB","31.03.2016",649,"£","1 billion(Together with Iphone 6 and Iphone 6s",0);
	data item13 = new data ("13. Iphone 7","Apple","T8010 'A10' ","32GB/128GB/256GB","16.09.2016",649,"£","1.16 billion with Iphone 7 plus",0);
	data item14 = new data ("14. Iphone 7 plus","Apple","T8010 'A10' ","32GB/128GB/256GB","16.09.2016",769,"£","1.16 billion with Iphone 7",0);
	data item15 = new data ("15. Iphone 8","Apple","T8015 'A11' ","64GB/256GB","22.09.2017",699,"£","Unknown number of prototypes sold",0);
	data item16 = new data ("16. Iphone 8 plus","Apple","T8015 'A11' ","64GB/256GB","22.09.2017",799,"£","Unknown number of prototypes sold",0);
	data item17 = new data ("17. Iphone X","Apple","T8015 'A11' ","64GB/256GB","03.11.2017",999,"£","Unknown number of prototypes sold",0);
	data item18 = new data ("18. Iphone XR","Apple","A12 Bionic Chipset","64GB/128GB/256GB","26.10.2018",749,"£","Unknown number of prototypes sold",0);
	data item19 = new data ("19. Iphone XS","Apple","A12 Bionic processor","64GB/128GB/256GB","21.09.2018",999,"£","Unknown number of prototypes sold",0);
	data item20 = new data ("20. Iphone XS Max","Apple","A12 Bionic processor","64GB/128GB/256GB","21.09.2018",1099,"£","Unknown number of prototypes sold",0);	
	item0.setStock(itemn0);
	item1.setStock(itemn1);
	item2.setStock(itemn2);
	item3.setStock(itemn3);
	item4.setStock(itemn4);
	item5.setStock(itemn5);
	item6.setStock(itemn6);
	item7.setStock(itemn7);
	item8.setStock(itemn8);
	item9.setStock(itemn9);
	item10.setStock(itemn10);
	item11.setStock(itemn11);
	item12.setStock(itemn12);
	item13.setStock(itemn13);
	item14.setStock(itemn14);
	item15.setStock(itemn15);
	item16.setStock(itemn16);
	item17.setStock(itemn17);
	item18.setStock(itemn18);
	item19.setStock(itemn19);
	item20.setStock(itemn20);
	int balance = 0;
	System.out.println("Welcome to the Apple store!");
	System.out.println("Whats your Balance?\n Note: You need more that 500£ to buy at least one Iphone.");
	// placeholder for integer validation
	int budget = input.nextInt(); 
	balance += budget;
	System.out.println("!=!=!=!=! MENU !=!=!=!=!");
	//Printer.
	item0.print();
	item1.print();
	item2.print();
	item3.print();
	item4.print();
	item5.print();
	item6.print();
	item7.print();
	item8.print();
	item9.print();
	item10.print();
	item11.print();
	item12.print();
	item13.print();
	item14.print();
	item15.print();
	item16.print();
	item17.print();
	item18.print();
	item19.print();
	item20.print();
	System.out.println(defaultmessage);
	
	for (int i = 1 ;i>0;i++) {
		
		String answer = input.nextLine();
		if(answer.toUpperCase().contentEquals("BUDGET")) {
			System.out.println("Your current budget is :" +"£"+ balance);
			
			for(int c = 1; c > 0; i++) {
			
				

			if(balance >= item0.getPrice()) {
				item0.print();
				}
			if(balance >= item1.getPrice()) {
				item1.print();
				}	
			if(balance >= item2.getPrice()) {
				item2.print();
				}
			if(balance>= item3.getPrice()) {
				item3.print();
				}
			if(balance>= item4.getPrice()) {
				item4.print();
				}
			if(balance >= item5.getPrice()) {
				item5.print();
				}
			if(balance >= item6.getPrice()) {
				item6.print();
				}
			if(balance >= item7.getPrice()) {
				item7.print();
				}
			if(balance >= item8.getPrice()) {
				item8.print();
				}
			if(balance >= item9.getPrice()) {
				item9.print();
				}
			if(balance>= item10.getPrice()) {
				item10.print();
				}
			if(balance >= item11.getPrice()) {
				item11.print();
				}
			if(balance >= item12.getPrice()) {
				item12.print();
				}
			if(balance >= item13.getPrice()) {
				item13.print();
				}
			if(balance >= item14.getPrice()) {
				item14.print();
				}
			if(balance >= item15.getPrice()) {
				item15.print();
				}
			if(balance >= item16.getPrice()) {
				item16.print();
				}
			if(balance >= item17.getPrice()) {
				item17.print();
				}
			if(balance >= item18.getPrice()) {
				item18.print();
				}
			if(balance>= item19.getPrice()) {
				item19.print();
				}
			if(balance >= item20.getPrice()) {
				item20.print();
				}
			
		
			
		break;
		
		
		}
		}
		else if(answer.toUpperCase().contentEquals("OPTIONS")) {
			
				
				System.out.println(defaultmessage);
				continue;
			}
		
		
		
		
		if(answer.toUpperCase().contentEquals("CHRISTMAS")) {
			if(codeCheck == false) {
				
			item0.setPrice(item0.getPrice()-discount);
			if (item0.getPrice() < 0) {
				item0.setPrice(0);
			}	
			item1.setPrice(item1.getPrice()-discount);
			if (item1.getPrice() < 0) {
				item1.setPrice(0);
				}
			item2.setPrice(item2.getPrice()-discount);
			if (item2.getPrice() < 0) {
				item2.setPrice(0);
			}
				item3.setPrice(item3.getPrice()-discount);
				if (item3.getPrice() < 0) {
				item3.setPrice(0);
				}
			item4.setPrice(item4.getPrice()-discount);
			if (item4.getPrice() < 0) {
				item4.setPrice(0);
			}
			item5.setPrice(item5.getPrice()-discount);
			if (item5.getPrice() < 0) {
				item5.setPrice(0);
			}
			item6.setPrice(item6.getPrice()-discount);
			if (item6.getPrice() < 0) {
				item6.setPrice(0);
			}
			item7.setPrice(item7.getPrice()-discount);
			if (item7.getPrice() < 0) {
				item7.setPrice(0);
			}
			item8.setPrice(item8.getPrice()-discount);
			if (item8.getPrice() < 0) {
				item8.setPrice(0);
			}
			item9.setPrice(item9.getPrice()-discount);
			if (item9.getPrice() < 0) {
				item9.setPrice(0);
			}
			item10.setPrice(item10.getPrice()-discount);
			if (item10.getPrice() < 0) {
				item10.setPrice(0);
			}
			item11.setPrice(item11.getPrice()-discount);
			if (item11.getPrice() < 0) {
				item11.setPrice(0);
			}
			item12.setPrice(item12.getPrice()-discount);
			if (item12.getPrice() < 0) {
				item12.setPrice(0);
			}
			item13.setPrice(item13.getPrice()-discount);
			if (item13.getPrice() < 0) {
				item13.setPrice(0);
			}
			item14.setPrice(item14.getPrice()-discount);
			if (item14.getPrice() < 0) {
				item14.setPrice(0);
			}
			item15.setPrice(item15.getPrice()-discount);
			if (item15.getPrice() < 0) {
				item15.setPrice(0);
			}
			item16.setPrice(item16.getPrice()-discount);
			if (item16.getPrice() < 0) {
				item16.setPrice(0);
			}
			item17.setPrice(item17.getPrice()-discount);
			if (item17.getPrice() < 0) {
				item17.setPrice(0);
			}	
			item18.setPrice(item18.getPrice()-discount);
			if (item18.getPrice() < 0) {
				item18.setPrice(0);
			}
			item19.setPrice(item19.getPrice()-discount);
			if (item19.getPrice() < 0) {
				item19.setPrice(0);
			}
			item20.setPrice(item20.getPrice()-discount);
			if (item20.getPrice() < 0) {
				item20.setPrice(0);
			}
			
			
			
				System.out.println("You have discounted the price by 50$!");
				codeCheck = true;
			}
		
			else if(codeCheck == true) {
				System.out.println("Code has already been used!");
			}	
				
			
		}
		
			
			else if(answer.toUpperCase().contentEquals("ADMIN")) {
				admin = true;
					System.out.println("Admin commands: \n Set Stock (Changing the items in stock) \n Set Price (Changing the price of items)");
					System.out.println("Usage: First you type in 'set stock' or 'set price' and then you choose the number you'd like ");
					
						
			}
						else if(answer.toUpperCase().contentEquals("MENU")) {
							System.out.println("!=!=!=!=! MENU !=!=!=!=!");
							item0.print();
							item1.print();
							item2.print();
							item3.print();
							item4.print();
							item5.print();
							item6.print();
							item7.print();
							item8.print();
							item9.print();
							item10.print();
							item11.print();
							item12.print();
							item13.print();
							item14.print();
							item15.print();
							item16.print();
							item17.print();	
							item18.print();
							item19.print();
							item20.print();
							System.out.println(defaultmessage);
							continue;
						}
			
					if(answer.toUpperCase().contentEquals("ORIGINAL IPHONE")||answer.toUpperCase().contentEquals("0")) {
					item0.print2();
					System.out.println("Would you like to buy an Original Iphone? just type in 'buy' and you will receive one. ");
			

			for(int j=1; 1>0;j++) {
				if (balance <= 0) {
					balance = 0;
				}
				String answer2 = input.nextLine();
			if(answer2.toUpperCase().contentEquals("BUY") && item0.getStock() >= 1 && balance>= item0.getPrice()) {
					System.out.println("You have successfully bought the Original Iphone ");
					item0.setStock(item0.getStock()-1);
					balance-= item0.getPrice();
					
					

					originaliphone++;	
					System.out.println("In order to see your inventory, go to 'menu' and then type in 'inventory' ");
				}else if(answer2.toUpperCase().contentEquals("BUY") && item0.getStock() <= 0) {
					System.out.println("Out of stock. "+"\n Type 'menu' to exit the program");
				}else if (answer2.toUpperCase().contentEquals("BUY") && balance < item0.getPrice()) {
					System.out.println("You don't have enough money.");					
					System.out.println("In order to see your inventory, type 'MENU' first, and then 'inventory'.");
				
				}else if(answer2.toUpperCase().contentEquals("SET STOCK")) {
					if (admin == true) {
						System.out.println("How much would you like to be in stock?");
					int stock = input.nextInt();
					
					item0.setStock(stock);
					System.out.println("You have successfully changed the number in stock to "+ stock +" prototypes");
					}if(admin == false) {
						System.out.println("You can't use those commands unless you are an admin.");
					}
				}else if(answer2.toUpperCase().contentEquals("SET PRICE")) {
					if (admin == true) {
						System.out.println("What price would you like to set? ");
					int price = input.nextInt();
					item0.setPrice(price);
					System.out.println("You have successfully changed the price to " +price +"£");
					}if(admin == false) {
						System.out.println("You can't use those commands unless you are an admin.");
					
				}
					
				
				}
				
				else if(answer2.toUpperCase().contentEquals("MENU")) {
					System.out.println("!=!=!=!=! MENU !=!=!=!=!");
					item0.print();
					item1.print();
					item2.print();
					item3.print();
					item4.print();
					item5.print();
					item6.print();
					item7.print();
					item8.print();
					item9.print();
					item10.print();
					item11.print();
					item12.print();
					item13.print();
					item14.print();
					item15.print();
					item16.print();
					item17.print();
					item18.print();
					item19.print();
					item20.print();
					System.out.println(defaultmessage);
					break;
				}
					}
				
			}else if (answer.toUpperCase().contentEquals("IPHONE 3G")||answer.toUpperCase().contentEquals("1")) {
				item1.print2();
				
				System.out.println("Would you like to buy a Iphone 3G? just type in 'buy' and you will receive one. ");
				for(int j=1; 1>0;j++) {
					if (balance <= 0) {
						balance = 0;}
					String answer2 = input.nextLine();
					if(answer2.toUpperCase().contentEquals("BUY") && item1.getStock() >= 1 && balance >= item1.getPrice()) {
							System.out.println("You have successfully bought the Iphone 3G ");
							item0.setStock(item1.getStock()-1);
							balance -= item1.getPrice();
							iphone3g++;	
							System.out.println("In order to see your inventory, go to 'menu' and then type in 'inventory' ");
						}else if(answer2.toUpperCase().contentEquals("BUY") && item1.getStock() <= 0) {
							System.out.println("Out of stock. "+"\n Type 'menu' to exit the program");
						}else if (answer2.toUpperCase().contentEquals("BUY") &&balance < item1.getPrice()) {
							System.out.println("You don't have enough money.");					
							System.out.println("In order to see your inventory, type 'menu' first, and then 'inventory'.");
						}else if(answer2.toUpperCase().contentEquals("SET STOCK")) {
							if (admin == true) {
								System.out.println("How much would you like to be in stock?");
							int stock = input.nextInt();
							item1.setStock(stock);
							System.out.println("You have successfully changed the number in stock to "+ stock +"prototypes");
							}if(admin == false) {
								System.out.println("You can't use those commands unless you are an admin.");
							}
						}else if(answer2.toUpperCase().contentEquals("SET PRICE")) {
							if (admin == true) {
								System.out.println("What price would you like to set? ");
							int price = input.nextInt();
							item1.setPrice(price);
							System.out.println("You have successfully changed the price to " +price +"£");
							}if(admin == false) {
								System.out.println("You can't use those commands unless you are an admin.");
							
						}
							
								
						
						}if(answer2.toUpperCase().contentEquals("MENU")) {
							System.out.println("!=!=!=!=! MENU !=!=!=!=!");
							item0.print();
							item1.print();
							item2.print();
							item3.print();
							item4.print();
							item5.print();
							item6.print();
							item7.print();
							item8.print();
							item9.print();
							item10.print();
							item11.print();
							item12.print();
							item13.print();
							item14.print();
							item15.print();
							item16.print();
							item17.print();
							item18.print();
							item19.print();
							item20.print();
							System.out.println(defaultmessage);
							break;
						}
				
				}
		}else if (answer.toUpperCase().contentEquals("IPHONE 3GS")||answer.toUpperCase().contentEquals("2")) {
			item2.print2();
			System.out.println("Would you like to buy a Iphone 3GS? just type in 'buy' and you will receive one. ");
			for(int j=1; 1>0;j++) {
				if (balance <= 0) {
					balance = 0;}
				String answer2 = input.nextLine();
				if(answer2.toUpperCase().contentEquals("BUY") && item2.getStock() >= 1 && balance >= item2.getPrice()) {
					System.out.println("You have successfully bought the Iphone 3GS ");
					item2.setStock(item2.getStock()-1);
					balance -= item2.getPrice();
					iphone3gs++;
					System.out.println("In order to see your inventory, go to 'menu' and then type in 'inventory' ");
				}else if(answer2.toUpperCase().contentEquals("BUY") && item2.getStock() <= 0) {
					System.out.println("Out of stock. "+"\n Type 'menu' to exit the program");
				}else if (answer2.toUpperCase().contentEquals("BUY") &&balance< item2.getPrice()) {
					System.out.println("You don't have enough money.");					
					System.out.println("In order to see your inventory, type 'menu' first, and then 'inventory'.");
				}else if(answer2.toUpperCase().contentEquals("SET STOCK")) {
					if (admin == true) {
						System.out.println("How much would you like to be in stock?");
					int stock = input.nextInt();
					item2.setStock(stock);
					System.out.println("You have successfully changed the number in stock to "+ stock +"prototypes");
					}if(admin == false) {
						System.out.println("You can't use those commands unless you are an admin.");
					}
				}else if(answer2.toUpperCase().contentEquals("SET PRICE")) {
					if (admin == true) {
						System.out.println("What price would you like to set? ");
					int price = input.nextInt();
					item2.setPrice(price);
					System.out.println("You have successfully changed the price to " +price +"£");
					}if(admin == false) {
						System.out.println("You can't use those commands unless you are an admin.");
					
				}
					
				
				}
					if(answer2.toUpperCase().contentEquals("MENU")) {
						System.out.println("!=!=!=!=! MENU !=!=!=!=!");
					item0.print();
					item1.print();
					item2.print();
					item3.print();
					item4.print();
					item5.print();
					item6.print();
					item7.print();
					item8.print();
					item9.print();
					item10.print();
					item11.print();
					item12.print();
					item13.print();
					item14.print();
					item15.print();
					item16.print();
					item17.print();
					item18.print();
					item19.print();
					item20.print();
					System.out.println(defaultmessage);
					break;
				}
				}
			
		}else if (answer.toUpperCase().contentEquals("IPHONE 4")||answer.toUpperCase().contentEquals("3")) {
			item3.print2();
			System.out.println("Would you like to buy a Iphone 4? just type in 'buy' and you will receive one. ");
			for(int j=1; 1>0;j++) {
				if (balance <= 0) {
					balance = 0;}
				String answer2 = input.nextLine();
				if(answer2.toUpperCase().contentEquals("BUY") && item3.getStock() >= 1 && balance >= item3.getPrice()) {
					System.out.println("You have successfully bought the Iphone 4 ");
					item3.setStock(item3.getStock()-1);
					balance-= item3.getPrice();
					iphone4++;
					System.out.println("In order to see your inventory, type 'menu' first, and then 'inventory'.");
					
				}else if(answer2.toUpperCase().contentEquals("BUY") && item3.getStock() <= 0) {
					System.out.println("Out of stock. "+"\n Type 'menu' to exit the program");
				}else if (answer2.toUpperCase().contentEquals("BUY") &&balance< item3.getPrice()) {
					System.out.println("You don't have enough money.");					
					System.out.println("In order to see your inventory, type 'menu' first, and then 'inventory'.");
				}else if(answer2.toUpperCase().contentEquals("SET STOCK")) {
					if (admin == true) {
						System.out.println("How much would you like to be in stock?");
					int stock = input.nextInt();
					item3.setStock(stock);
					System.out.println("You have successfully changed the number in stock to "+ stock +"prototypes");
					}if(admin == false) {
						System.out.println("You can't use those commands unless you are an admin.");
					}
				}else if(answer2.toUpperCase().contentEquals("SET PRICE")) {
					if (admin == true) {
						System.out.println("What price would you like to set? ");
					int price = input.nextInt();
					item3.setPrice(price);
					System.out.println("You have successfully changed the price to " +price +"£");
					}if(admin == false) {
						System.out.println("You can't use those commands unless you are an admin.");
					
				}
					
				}
					if(answer2.toUpperCase().contentEquals("MENU")) {
						System.out.println("!=!=!=!=! MENU !=!=!=!=!");
					item0.print();
					item1.print();
					item2.print();
					item3.print();
					item4.print();
					item5.print();
					item6.print();
					item7.print();
					item8.print();
					item9.print();
					item10.print();
					item11.print();
					item12.print();
					item13.print();
					item14.print();
					item15.print();
					item16.print();
					item17.print();
					item18.print();
					item19.print();
					item20.print();
					System.out.println(defaultmessage);
					break;
				}
				
			}
		}else if (answer.toUpperCase().contentEquals("IPHONE 4S")||answer.toUpperCase().contentEquals("4")) {
			item4.print2();
			System.out.println("Would you like to buy an Iphone 4S? just type in 'buy' and you will receive one. ");
			for(int j=1; 1>0;j++) {
				if (balance <= 0) {
					balance = 0;}
				String answer2 = input.nextLine();
				if(answer2.toUpperCase().contentEquals("BUY") && item4.getStock() >= 1 && balance >= item4.getPrice()) {
					System.out.println("You have successfully bought the  Iphone 4S");
					item4.setStock(item4.getStock()-1);
					balance-= item4.getPrice();
					iphone4s++;
					System.out.println("In order to see your inventory, go to 'menu' and then type in 'inventory' ");
				}else if(answer2.toUpperCase().contentEquals("BUY") && item4.getStock() <= 0) {
				System.out.println("Out of stock. "+"\n Type 'menu' to exit the program");
				}else if (answer2.toUpperCase().contentEquals("BUY") &&balance< item4.getPrice()) {
					System.out.println("You don't have enough money.");					
					System.out.println("In order to see your inventory, type 'menu' first, and then 'inventory'.");
				}else if(answer2.toUpperCase().contentEquals("SET STOCK")) {
					if (admin == true) {
						System.out.println("How much would you like to be in stock?");
					int stock = input.nextInt();
					item4.setStock(stock);
					System.out.println("You have successfully changed the number in stock to "+ stock +"prototypes");
					}if(admin == false) {
						System.out.println("You can't use those commands unless you are an admin.");
					}
				}else if(answer2.toUpperCase().contentEquals("SET PRICE")) {
					if (admin == true) {
						System.out.println("What price would you like to set? ");
					int price = input.nextInt();
					item4.setPrice(price);
					System.out.println("You have successfully changed the price to " +price +"£");
					}if(admin == false) {
						System.out.println("You can't use those commands unless you are an admin.");
					
				}
					
				}
				if(answer2.toUpperCase().contentEquals("MENU")) {
					System.out.println("!=!=!=!=! MENU !=!=!=!=!");
					item0.print();
					item1.print();
					item2.print();
					item3.print();
					item4.print();
					item5.print();
					item6.print();
					item7.print();
					item8.print();
					item9.print();
					item10.print();
					item11.print();
					item12.print();
					item13.print();
					item14.print();
					item15.print();
					item16.print();
					item17.print();
					item18.print();
					item19.print();
					item20.print();
					System.out.println(defaultmessage);
					break;
				}
				
			}
		}else if (answer.toUpperCase().contentEquals("IPHONE 5")||answer.toUpperCase().contentEquals("5")) {
			item5.print2();
			System.out.println("Would you like to buy an Iphone 5? just type in 'buy' and you will receive one. ");
			for(int j=1; 1>0;j++) {
				if (balance <= 0) {
					balance = 0;}
				String answer2 = input.nextLine();
				if(answer2.toUpperCase().contentEquals("BUY") && item5.getStock() >= 1 && balance >= item5.getPrice()) {
					System.out.println("You have successfully bought the Iphone 5 ");
					item5.setStock(item5.getStock()-1);
					balance-= item5.getPrice();
					iphone5++;
					System.out.println("In order to see your inventory, go to 'menu' and then type in 'inventory' ");
				}else if(answer2.toUpperCase().contentEquals("BUY") && item5.getStock() <= 0) {
					System.out.println("Out of stock. "+"\n Type 'menu' to exit the program");
				}else if (answer2.toUpperCase().contentEquals("BUY") &&balance< item5.getPrice()) {
					System.out.println("You don't have enough money.");					
					System.out.println("In order to see your inventory, type 'menu' first, and then 'inventory'.");
				}else if(answer2.toUpperCase().contentEquals("SET STOCK")) {
					if (admin == true) {
						System.out.println("How much would you like to be in stock?");
					int stock = input.nextInt();
					item5.setStock(stock);
					System.out.println("You have successfully changed the number in stock to "+ stock +"prototypes");
					}if(admin == false) {
						System.out.println("You can't use those commands unless you are an admin.");
					}
				}else if(answer2.toUpperCase().contentEquals("SET PRICE")) {
					if (admin == true) {
						System.out.println("What price would you like to set? ");
					int price = input.nextInt();
					item5.setPrice(price);
					System.out.println("You have successfully changed the price to " +price +"£");
					}if(admin == false) {
						System.out.println("You can't use those commands unless you are an admin.");
					
				}
					
				}
					if(answer2.toUpperCase().contentEquals("MENU")) {
						System.out.println("!=!=!=!=! MENU !=!=!=!=!");
					item0.print();
					item1.print();
					item2.print();
					item3.print();
					item4.print();
					item5.print();
					item6.print();
					item7.print();
					item8.print();
					item9.print();
					item10.print();
					item11.print();
					item12.print();
					item13.print();
					item14.print();
					item15.print();
					item16.print();
					item17.print();
					item18.print();
					item19.print();
					item20.print();
					System.out.println(defaultmessage);
					break;
				}
				
			}
		}else if (answer.toUpperCase().contentEquals("IPHONE 5S")||answer.toUpperCase().contentEquals("6")) {
			item6.print2();
			System.out.println("Would you like to buy an Iphone 5S? just type in 'buy' and you will receive one. ");
			for(int j=1; 1>0;j++) {
				if (balance <= 0) {
					balance = 0;}
				String answer2 = input.nextLine();
				if(answer2.toUpperCase().contentEquals("BUY") && item6.getStock() >= 1 && balance >= item6.getPrice()) {
					System.out.println("You have successfully bought the  Iphone 5S");
					item6.setStock(item6.getStock()-1);
					balance -= item6.getPrice();
					iphone5s++;
					System.out.println("In order to see your inventory, go to 'menu' and then type in 'inventory' ");
				}else if(answer2.toUpperCase().contentEquals("BUY") && item6.getStock() <= 0) {
					System.out.println("Out of stock. "+"\n Type 'menu' to exit the program");
				}else if (answer2.toUpperCase().contentEquals("BUY") &&balance< item6.getPrice()) {
					System.out.println("You don't have enough money.");					
					System.out.println("In order to see your inventory, type 'menu' first, and then 'inventory'.");
				}else if(answer2.toUpperCase().contentEquals("SET STOCK")) {
					if (admin == true) {
						System.out.println("How much would you like to be in stock?");
					int stock = input.nextInt();
					item6.setStock(stock);
					System.out.println("You have successfully changed the number in stock to "+ stock +"prototypes");
					}if(admin == false) {
						System.out.println("You can't use those commands unless you are an admin.");
					}
				}else if(answer2.toUpperCase().contentEquals("SET PRICE")) {
					if (admin == true) {
						System.out.println("What price would you like to set? ");
					int price = input.nextInt();
					item6.setPrice(price);
					System.out.println("You have successfully changed the price to " +price +"£");
					}if(admin == false) {
						System.out.println("You can't use those commands unless you are an admin.");
					
				}
					
				}
					if(answer2.toUpperCase().contentEquals("MENU")) {
						System.out.println("!=!=!=!=! MENU !=!=!=!=!");
					item0.print();
					item1.print();
					item2.print();
					item3.print();
					item4.print();
					item5.print();
					item6.print();
					item7.print();
					item8.print();
					item9.print();
					item10.print();
					item11.print();
					item12.print();
					item13.print();
					item14.print();
					item15.print();
					item16.print();
					item17.print();
					item18.print();
					item19.print();
					item20.print();
					System.out.println(defaultmessage);
					break;
				}
				
			}
		}else if (answer.toUpperCase().contentEquals("IPHONE 5C")||answer.toUpperCase().contentEquals("7")) {
			item7.print2();
			System.out.println("Would you like to buy an Iphone 5C? just type in 'buy' and you will receive one. ");
			for(int j=1; 1>0;j++) {
				if (balance <= 0) {
					balance = 0;}
				String answer2 = input.nextLine();
				if(answer2.toUpperCase().contentEquals("BUY") && item7.getStock() >= 1 && balance >= item7.getPrice()) {
					System.out.println("You have successfully bought the  Iphone 5C");
					item7.setStock(item7.getStock()-1);
					balance-= item7.getPrice();
					iphone5c++;
					System.out.println("In order to see your inventory, go to 'menu' and then type in 'inventory' ");
				}else if(answer2.toUpperCase().contentEquals("BUY") && item7.getStock() <= 0) {
					System.out.println("Out of stock. "+"\n Type 'MENU' to exit the program");
				}else if (answer2.toUpperCase().contentEquals("BUY") &&balance< item7.getPrice()) {
					System.out.println("You don't have enough money.");					
					System.out.println("In order to see your inventory, type 'MENU' first, and then 'inventory'.");
				}else if(answer2.toUpperCase().contentEquals("SET STOCK")) {
					if (admin == true) {
						System.out.println("How much would you like to be in stock?");
					int stock = input.nextInt();
					item7.setStock(stock);
					System.out.println("You have successfully changed the number in stock to "+ stock +"prototypes");
					}if(admin == false) {
						System.out.println("You can't use those commands unless you are an admin.");
					}
				}else if(answer2.toUpperCase().contentEquals("SET PRICE")) {
					if (admin == true) {
						System.out.println("What price would you like to set? ");
					int price = input.nextInt();
					item7.setPrice(price);
					System.out.println("You have successfully changed the price to " +price +"£");
					}if(admin == false) {
						System.out.println("You can't use those commands unless you are an admin.");
					
				}
					
				}
					if(answer2.toUpperCase().contentEquals("MENU")) {
						System.out.println("!=!=!=!=! MENU !=!=!=!=!");
					item0.print();
					item1.print();
					item2.print();
					item3.print();
					item4.print();
					item5.print();
					item6.print();
					item7.print();
					item8.print();
					item9.print();
					item10.print();
					item11.print();
					item12.print();
					item13.print();
					item14.print();
					item15.print();
					item16.print();
					item17.print();
					item18.print();
					item19.print();
					item20.print();
					System.out.println(defaultmessage);
					break;
				}
				
			}
		}else if (answer.toUpperCase().contentEquals("IPHONE 6")||answer.toUpperCase().contentEquals("8")) {
			item8.print2();
			System.out.println("Would you like to buy an Iphone 6? just type in 'buy' and you will receive one. ");
			for(int j=1; 1>0;j++) {
				if (balance <= 0) {
					balance = 0;}
				String answer2 = input.nextLine();
				if(answer2.toUpperCase().contentEquals("BUY") && item8.getStock() >= 1 && balance >= item8.getPrice()) {
					System.out.println("You have successfully bought the  Iphone 6");
					item8.setStock(item8.getStock()-1);
					balance-= item8.getPrice();
					iphone6++;
					System.out.println("In order to see your inventory, go to 'menu' and then type in 'inventory' ");
				}else if(answer2.toUpperCase().contentEquals("BUY") && item8.getStock() <= 0) {
					System.out.println("Out of stock. "+"\n Type 'MENU' to exit the program");
				}else if (answer2.toUpperCase().contentEquals("BUY") &&balance< item8.getPrice()) {
					System.out.println("You don't have enough money.");					
					System.out.println("In order to see your inventory, type 'MENU' first, and then 'inventory'.");
				}else if(answer2.toUpperCase().contentEquals("SET STOCK")) {
					if (admin == true) {
						System.out.println("How much would you like to be in stock?");
					int stock = input.nextInt();
					item8.setStock(stock);
					System.out.println("You have successfully changed the number in stock to "+ stock +"prototypes");
					}if(admin == false) {
						System.out.println("You can't use those commands unless you are an admin.");
					}
				}else if(answer2.toUpperCase().contentEquals("SET PRICE")) {
					if (admin == true) {
						System.out.println("What price would you like to set? ");
					int price = input.nextInt();
					item8.setPrice(price);
					System.out.println("You have successfully changed the price to " +price +"£");
					}if(admin == false) {
						System.out.println("You can't use those commands unless you are an admin.");
					
				}
					
				}
				if(answer2.toUpperCase().contentEquals("MENU")) {
					System.out.println("!=!=!=!=! MENU !=!=!=!=!");
					item0.print();
					item1.print();
					item2.print();
					item3.print();
					item4.print();
					item5.print();
					item6.print();
					item7.print();
					item8.print();
					item9.print();
					item10.print();
					item11.print();
					item12.print();
					item13.print();
					item14.print();
					item15.print();
					item16.print();
					item17.print();
					item18.print();
					item19.print();
					item20.print();
					System.out.println(defaultmessage);
					break;
				}
			
			}
		}else if (answer.toUpperCase().contentEquals("IPHONE 6 PLUS")||answer.toUpperCase().contentEquals("9")) {
			item9.print2();
			System.out.println("Would you like to buy an Iphone 6 plus? just type in 'buy' and you will receive one. ");
			for(int j=1; 1>0;j++) {
				if (balance <= 0) {
				balance = 0;}
				String answer2 = input.nextLine();
				if(answer2.toUpperCase().contentEquals("BUY") && item9.getStock() >= 1 && balance >= item9.getPrice()) {
					System.out.println("You have successfully bought the  Iphone Iphone 6 plus");
					item9.setStock(item9.getStock()-1);
					balance-= item9.getPrice();
					iphone6plus++;
					System.out.println("In order to see your inventory, go to 'menu' and then type in 'inventory' ");
				}else if(answer2.toUpperCase().contentEquals("BUY") && item9.getStock() <= 0) {
					System.out.println("Out of stock. "+"\n Type 'MENU' to exit the program");
				}else if (answer2.toUpperCase().contentEquals("BUY") &&balance< item9.getPrice()) {
					System.out.println("You don't have enough money.");					
				}else if(answer2.toUpperCase().contentEquals("SET STOCK")) {
					if (admin == true) {
						System.out.println("How much would you like to be in stock?");
					int stock = input.nextInt();
					item9.setStock(stock);
					System.out.println("You have successfully changed the number in stock to "+ stock +"prototypes");
					}if(admin == false) {
						System.out.println("You can't use those commands unless you are an admin.");
					}
				}else if(answer2.toUpperCase().contentEquals("SET PRICE")) {
					if (admin == true) {
						System.out.println("What price would you like to set? ");
					int price = input.nextInt();
					item9.setPrice(price);
					System.out.println("You have successfully changed the price to " +price +"£");
					}if(admin == false) {
						System.out.println("You can't use those commands unless you are an admin.");
					
				}
					
				}
					if(answer2.toUpperCase().contentEquals("MENU")) {
						System.out.println("!=!=!=!=! MENU !=!=!=!=!");
					item0.print();
					item1.print();
					item2.print();
					item3.print();
					item4.print();
					item5.print();
					item6.print();
					item7.print();
					item8.print();
					item9.print();
					item10.print();
					item11.print();
					item12.print();
					item13.print();
					item14.print();
					item15.print();
					item16.print();
					item17.print();
					item18.print();
					item19.print();
					item20.print();
					System.out.println(defaultmessage);
					break;
				}
				
			}
		}else if (answer.toUpperCase().contentEquals("IPHONE 6S")||answer.toUpperCase().contentEquals("10")) {
			item10.print2();
			System.out.println("Would you like to buy an Iphone 6S? just type in 'buy' and you will receive one. ");
			for(int j=1; 1>0;j++) {
				if (balance <= 0) {
					balance = 0;}
				String answer2 = input.nextLine();
				if(answer2.toUpperCase().contentEquals("BUY") && item10.getStock() >= 1 && balance >= item10.getPrice()) {
					System.out.println("You have successfully bought the  Iphone 6S");
					item10.setStock(item10.getStock()-1);
					balance-= item10.getPrice();
					iphone6s++;
					System.out.println("In order to see your inventory, go to 'menu' and then type in 'inventory' ");
				}else if(answer2.toUpperCase().contentEquals("BUY") && item10.getStock() <= 0) {
					System.out.println("Out of stock. "+"\n Type 'MENU' to exit the program");
				}else if (answer2.toUpperCase().contentEquals("BUY") &&balance< item10.getPrice()) {
					System.out.println("You don't have enough money.");					
					System.out.println("In order to see your inventory, type 'MENU' first, and then 'inventory'.");
				}else if(answer2.toUpperCase().contentEquals("SET STOCK")) {
					if (admin == true) {
						System.out.println("How much would you like to be in stock?");
					int stock = input.nextInt();
					item10.setStock(stock);
					System.out.println("You have successfully changed the number in stock to "+ stock +"prototypes");
					}if(admin == false) {
						System.out.println("You can't use those commands unless you are an admin.");
					}
				}else if(answer2.toUpperCase().contentEquals("SET PRICE")) {
					if (admin == true) {
						System.out.println("What price would you like to set? ");
					int price = input.nextInt();
					item10.setPrice(price);
					System.out.println("You have successfully changed the price to " +price +"£");
					}if(admin == false) {
						System.out.println("You can't use those commands unless you are an admin.");
					
				}
					
				}
					if(answer2.toUpperCase().contentEquals("MENU")) {
						System.out.println("!=!=!=!=! MENU !=!=!=!=!");
					item0.print();
					item1.print();
					item2.print();
					item3.print();
					item4.print();
					item5.print();
					item6.print();
					item7.print();
					item8.print();
					item9.print();
					item10.print();
					item11.print();
					item12.print();
					item13.print();
					item14.print();
					item15.print();
					item16.print();
					item17.print();
					item18.print();
					item19.print();
					item20.print();
					System.out.println(defaultmessage);
					break;
				}
				
			}
		}else if (answer.toUpperCase().contentEquals("IPHONE 6S PLUS")||answer.toUpperCase().contentEquals("11")) {
			item11.print2();
			System.out.println("Would you like to buy an Iphone 6S plus? just type in 'buy' and you will receive one. ");
			for(int j=1; 1>0;j++) {
				if (balance <= 0) {
					balance = 0;}
				String answer2 = input.nextLine();
				if(answer2.toUpperCase().contentEquals("BUY") && item11.getStock() >= 1 && balance >= item11.getPrice()) {
					System.out.println("You have successfully bought the  Iphone 6S plus");
					item11.setStock(item11.getStock()-1);
					balance-= item11.getPrice();
					System.out.println("In order to see your inventory, go to 'menu' and then type in 'inventory' ");
					iphone6splus++;
					System.out.println("Type 'inventory' to see what you have already bought.");
				}else if(answer2.toUpperCase().contentEquals("BUY") && item11.getStock() <= 0) {
					System.out.println("Out of stock. "+"\n Type 'MENU' to exit the program");
				}else if (answer2.toUpperCase().contentEquals("BUY") &&balance< item11.getPrice()) {
					System.out.println("You don't have enough money.");					
					System.out.println("In order to see your inventory, type 'MENU' first, and then 'inventory'.");
				}else if(answer2.toUpperCase().contentEquals("SET STOCK")) {
					if (admin == true) {
						System.out.println("How much would you like to be in stock?");
					int stock = input.nextInt();
					item11.setStock(stock);
					System.out.println("You have successfully changed the number in stock to "+ stock +"prototypes");
					}if(admin == false) {
						System.out.println("You can't use those commands unless you are an admin.");
					}
				}else if(answer2.toUpperCase().contentEquals("SET PRICE")) {
					if (admin == true) {
						System.out.println("What price would you like to set? ");
					int price = input.nextInt();
					item11.setPrice(price);
					System.out.println("You have successfully changed the price to " +price +"£");
					}if(admin == false) {
						System.out.println("You can't use those commands unless you are an admin.");
					
				}
					
				}
					if(answer2.toUpperCase().contentEquals("MENU")) {
						System.out.println("!=!=!=!=! MENU !=!=!=!=!");
					item0.print();
					item1.print();
					item2.print();
					item3.print();
					item4.print();
					item5.print();
					item6.print();
					item7.print();
					item8.print();
					item9.print();
					item10.print();
					item11.print();
					item12.print();
					item13.print();
					item14.print();
					item15.print();
					item16.print();
					item17.print();
					item18.print();
					item19.print();
					item20.print();
					System.out.println(defaultmessage);
					break;
				}
				
				
			}
		}else if (answer.toUpperCase().contentEquals("IPHONE SE")||answer.toUpperCase().contentEquals("12")) {
			item12.print2();
			System.out.println("Would you like to buy an Iphone SE? just type in 'buy' and you will receive one. ");
			for(int j=1; 1>0;j++) {
				if (balance <= 0) {
					balance = 0;}
				String answer2 = input.nextLine();
				if(answer2.toUpperCase().contentEquals("BUY") && item12.getStock() >= 1 && balance >= item12.getPrice()) {
					System.out.println("You have successfully bought the  Iphone SE");
					item12.setStock(item12.getStock()-1);
					balance-= item12.getPrice();
					iphoneSE++;
					System.out.println("In order to see your inventory, go to 'menu' and then type in 'inventory' ");
				}else if(answer2.toUpperCase().contentEquals("BUY") && item12.getStock() <= 0) {
					System.out.println("Out of stock. "+"\n Type 'MENU' to exit the program");
				}else if (answer2.toUpperCase().contentEquals("BUY") &&balance< item12.getPrice()) {
					System.out.println("You don't have enough money.");					
					System.out.println("In order to see your inventory, type 'MENU' first, and then 'inventory'.");
				}else if(answer2.toUpperCase().contentEquals("SET STOCK")) {
					if (admin == true) {
						System.out.println("How much would you like to be in stock?");
					int stock = input.nextInt();
					item12.setStock(stock);
					System.out.println("You have successfully changed the number in stock to "+ stock +"prototypes");
					}if(admin == false) {
						System.out.println("You can't use those commands unless you are an admin.");
					}
				}else if(answer2.toUpperCase().contentEquals("SET PRICE")) {
					if (admin == true) {
						System.out.println("What price would you like to set? ");
					int price = input.nextInt();
					item12.setPrice(price);
					System.out.println("You have successfully changed the price to " +price +"£");
					}if(admin == false) {
						System.out.println("You can't use those commands unless you are an admin.");
					
				}
					
				}
					if(answer2.toUpperCase().contentEquals("MENU")) {
						System.out.println("!=!=!=!=! MENU !=!=!=!=!");
					item0.print();
					item1.print();
					item2.print();
					item3.print();
					item4.print();
					item5.print();
					item6.print();
					item7.print();
					item8.print();
					item9.print();
					item10.print();
					item11.print();
					item12.print();
					item13.print();
					item14.print();
					item15.print();
					item16.print();
					item17.print();
					item18.print();
					item19.print();
					item20.print();
					System.out.println(defaultmessage);
					break;
				}
				
			}
		}else if (answer.toUpperCase().contentEquals("IPHONE 7")||answer.toUpperCase().contentEquals("13")) {
			item13.print2();
			System.out.println("Would you like to buy an Iphone 7? just type in 'buy' and you will receive one. ");
			for(int j=1; 1>0;j++) {
				if (balance <= 0) {
					balance = 0;
					}
				String answer2 = input.nextLine();
				if(answer2.toUpperCase().contentEquals("BUY") && item13.getStock() >= 1 && balance >= item13.getPrice()) {
					System.out.println("You have successfully bought the  Iphone 7");
					item13.setStock(item13.getStock()-1);
					balance -= item13.getPrice();
					iphone7++;
					System.out.println("In order to see your inventory, go to 'menu' and then type in 'inventory' ");
				}else if(answer2.toUpperCase().contentEquals("BUY") && item13.getStock() <= 0) {
					System.out.println("Out of stock. "+"\n Type 'MENU' to exit the program");
				}else if (answer2.toUpperCase().contentEquals("BUY") &&balance < item13.getPrice()) {
					System.out.println("You don't have enough money.");					
					System.out.println("In order to see your inventory, type 'MENU' first, and then 'inventory'.");
				}else if(answer2.toUpperCase().contentEquals("SET STOCK")) {
					if (admin == true) {
						System.out.println("How much would you like to be in stock?");
					int stock = input.nextInt();
					item13.setStock(stock);
					System.out.println("You have successfully changed the number in stock to "+ stock +"prototypes");
					}if(admin == false) {
						System.out.println("You can't use those commands unless you are an admin.");
					}
				}else if(answer2.toUpperCase().contentEquals("SET PRICE")) {
					if (admin == true) {
						System.out.println("What price would you like to set? ");
					int price = input.nextInt();
					item13.setPrice(price);
					System.out.println("You have successfully changed the price to " +price +"£");
					}if(admin == false) {
						System.out.println("You can't use those commands unless you are an admin.");
					
				}
					
				}
					if(answer2.toUpperCase().contentEquals("MENU")) {
						System.out.println("!=!=!=!=! MENU !=!=!=!=!");
					item0.print();
					item1.print();
					item2.print();
					item3.print();
					item4.print();
					item5.print();
					item6.print();
					item7.print();
					item8.print();
					item9.print();
					item10.print();
					item11.print();
					item12.print();
					item13.print();
					item14.print();
					item15.print();
					item16.print();
					item17.print();
					item18.print();
					item19.print();
					item20.print();			
					System.out.println(defaultmessage);
					break;
				}		
			}
		}else if (answer.toUpperCase().contentEquals("IPHONE 7 PLUS")||answer.toUpperCase().contentEquals("14")) {
			item14.print2();
			System.out.println("Would you like to buy an Iphone 7 plus? just type in 'buy' and you will receive one. ");
			for(int j=1; 1>0;j++) {
				if (balance <= 0) {
					balance = 0;}
				String answer2 = input.nextLine();
				if(answer2.toUpperCase().contentEquals("BUY") && item14.getStock() >= 1 && balance >= item14.getPrice()) {
					System.out.println("You have successfully bought the  Iphone 7 plus");
					item14.setStock(item14.getStock()-1);
					balance -= item14.getPrice();
					iphone7plus++;
					System.out.println("In order to see your inventory, go to 'menu' and then type in 'inventory' ");
				}else if(answer2.toUpperCase().contentEquals("BUY") && item14.getStock() <= 0) {
					System.out.println("Out of stock. "+"\n Type 'MENU' to exit the program");
				}else if (answer2.toUpperCase().contentEquals("BUY") &&balance< item14.getPrice()) {
					System.out.println("You don't have enough money.");					
					System.out.println("In order to see your inventory, type 'MENU' first, and then 'inventory'.");
				}else if(answer2.toUpperCase().contentEquals("SET STOCK")) {
					if (admin == true) {
						System.out.println("How much would you like to be in stock?");
					int stock = input.nextInt();
					item14.setStock(stock);
					System.out.println("You have successfully changed the number in stock to "+ stock +"prototypes");
					}if(admin == false) {
						System.out.println("You can't use those commands unless you are an admin.");
					}
				}else if(answer2.toUpperCase().contentEquals("SET PRICE")) {
					if (admin == true) {
						System.out.println("What price would you like to set? ");
					int price = input.nextInt();
					item14.setPrice(price);
					System.out.println("You have successfully changed the price to " +price +"£");
					}if(admin == false) {
						System.out.println("You can't use those commands unless you are an admin.");
					
				}
					
				}
					if(answer2.toUpperCase().contentEquals("MENU")) {
						System.out.println("!=!=!=!=! MENU !=!=!=!=!");
					item0.print();
					item1.print();
					item2.print();
					item3.print();
					item4.print();
					item5.print();
					item6.print();
					item7.print();
					item8.print();
					item9.print();
					item10.print();
					item11.print();
					item12.print();
					item13.print();
					item14.print();
					item15.print();
					item16.print();
					item17.print();
					item18.print();
					item19.print();
					item20.print();		
					System.out.println(defaultmessage);
					break;
				}
			}
		}else if (answer.toUpperCase().contentEquals("IPHONE 8")||answer.toUpperCase().contentEquals("15")) {
		item15.print2();
		System.out.println("Would you like to buy an Iphone 8? just type in 'buy' and you will receive one. ");
		for(int j=1; 1>0;j++) {
			if (balance <= 0) {
				balance = 0;}
			String answer2 = input.nextLine();
			if(answer2.toUpperCase().contentEquals("BUY") && item15.getStock() >= 1 && balance >= item15.getPrice()) {
				System.out.println("You have successfully bought the  Iphone 8");
				item15.setStock(item15.getStock()-1);
				balance -= item15.getPrice();
				iphone8++;
				System.out.println("In order to see your inventory, go to 'menu' and then type in 'inventory' ");
			}else if(answer2.toUpperCase().contentEquals("BUY") && item15.getStock() <= 0) {
				System.out.println("Out of stock. "+"\n Type 'MENU' to exit the program");
			}else if (answer2.toUpperCase().contentEquals("BUY") &&balance < item15.getPrice()) {
				System.out.println("You don't have enough money.");					
				System.out.println("In order to see your inventory, type 'MENU' first, and then 'inventory'.");
			}else if(answer2.toUpperCase().contentEquals("SET STOCK")) {
				if (admin == true) {
					System.out.println("How much would you like to be in stock?");
				int stock = input.nextInt();
				item15.setStock(stock);
				System.out.println("You have successfully changed the number in stock to "+ stock +"prototypes");
				}if(admin == false) {
					System.out.println("You can't use those commands unless you are an admin.");
				}
			}else if(answer2.toUpperCase().contentEquals("SET PRICE")) {
				if (admin == true) {
					System.out.println("What price would you like to set? ");
				int price = input.nextInt();
				item15.setPrice(price);
				System.out.println("You have successfully changed the price to " +price +"£");
				}if(admin == false) {
					System.out.println("You can't use those commands unless you are an admin.");
				
			}
				
			}
				if(answer2.toUpperCase().contentEquals("MENU")) {
					System.out.println("!=!=!=!=! MENU !=!=!=!=!");
				item0.print();
				item1.print();
				item2.print();
				item3.print();
				item4.print();
				item5.print();
				item6.print();
				item7.print();
				item8.print();
				item9.print();
				item10.print();
				item11.print();
				item12.print();
				item13.print();
				item14.print();
				item15.print();
				item16.print();
				item17.print();
				item18.print();
				item19.print();
				item20.print();
				System.out.println(defaultmessage);
				break;
			}
			
		}
		}else if (answer.toUpperCase().contentEquals("IPHONE 8 PLUS")||answer.toUpperCase().contentEquals("16")) {
		item16.print2();
		System.out.println("Would you like to buy an Iphone 8 plus? just type in 'buy' and you will receive one. ");
		for(int j=1; 1>0;j++) {
			if (balance <= 0) {
				balance = 0;}
			String answer2 = input.nextLine();
			if(answer2.toUpperCase().contentEquals("BUY") && item16.getStock() >= 1 && balance >= item16.getPrice()) {
				System.out.println("You have successfully bought the  Iphone 8 plus");
				item16.setStock(item16.getStock()-1);
				balance-= item16.getPrice();
				iphone8plus++;
				System.out.println("In order to see your inventory, go to 'menu' and then type in 'inventory' ");
			}else if(answer2.toUpperCase().contentEquals("BUY") && item16.getStock() <= 0) {
				System.out.println("Out of stock. "+"\n Type 'MENU' to exit the program");
			}else if (answer2.toUpperCase().contentEquals("BUY") &&balance< item16.getPrice()) {
				System.out.println("You don't have enough money.");					
				System.out.println("In order to see your inventory, type 'MENU' first, and then 'inventory'.");
			}else if(answer2.toUpperCase().contentEquals("SET STOCK")) {
				if (admin == true) {
					System.out.println("How much would you like to be in stock?");
				int stock = input.nextInt();
				item16.setStock(stock);
				System.out.println("You have successfully changed the number in stock to "+ stock +"prototypes");
				}if(admin == false) {
					System.out.println("You can't use those commands unless you are an admin.");
				}
			}else if(answer2.toUpperCase().contentEquals("SET PRICE")) {
				if (admin == true) {
					System.out.println("What price would you like to set? ");
				int price = input.nextInt();
				item16.setPrice(price);
				System.out.println("You have successfully changed the price to " +price +"£");
				}if(admin == false) {
					System.out.println("You can't use those commands unless you are an admin.");
				
			}
				
			}
				if(answer2.toUpperCase().contentEquals("MENU")) {
					System.out.println("!=!=!=!=! MENU !=!=!=!=!");
				item0.print();
				item1.print();
				item2.print();
				item3.print();
				item4.print();
				item5.print();
				item6.print();
				item7.print();
				item8.print();
				item9.print();
				item10.print();
				item11.print();
				item12.print();
				item13.print();
				item14.print();
				item15.print();
				item16.print();
				item17.print();
				item18.print();
				item19.print();
				item20.print();
				System.out.println(defaultmessage);
				break;
			}
		}
		}else if (answer.toUpperCase().contentEquals("IPHONE X")||answer.toUpperCase().contentEquals("17")) {
		item17.print2();
		System.out.println("Would you like to buy an Iphone X? just type in 'buy' and you will receive one. ");
		for(int j=1; 1>0;j++) {
			if (balance <= 0) {
				balance = 0;}
			String answer2 = input.nextLine();
			if(answer2.toUpperCase().contentEquals("BUY") && item17.getStock() >= 1 && balance >= item17.getPrice()) {
				System.out.println("You have successfully bought the  Iphone X");
				item17.setStock(item17.getStock()-1);
				balance -= item17.getPrice();
				iphonex++;
				System.out.println("In order to see your inventory, go to 'menu' and then type in 'inventory' ");
			}else if(answer2.toUpperCase().contentEquals("BUY") && item17.getStock() <= 0) {
				System.out.println("Out of stock. "+"\n Type 'MENU' to exit the program");
			}else if (answer2.toUpperCase().contentEquals("BUY") &&balance< item17.getPrice()) {
				System.out.println("You don't have enough money.");					
				System.out.println("In order to see your inventory, type 'MENU' first, and then 'inventory'.");
			}else if(answer2.toUpperCase().contentEquals("SET STOCK")) {
				if (admin == true) {
					System.out.println("How much would you like to be in stock?");
				int stock = input.nextInt();
				item17.setStock(stock);
				System.out.println("You have successfully changed the number in stock to "+ stock +"prototypes");
				}if(admin == false) {
					System.out.println("You can't use those commands unless you are an admin.");
				}
			}else if(answer2.toUpperCase().contentEquals("SET PRICE")) {
				if (admin == true) {
					System.out.println("What price would you like to set? ");
				int price = input.nextInt();
				item17.setPrice(price);
				System.out.println("You have successfully changed the price to " +price +"£");
				}if(admin == false) {
					System.out.println("You can't use those commands unless you are an admin.");
				
			}
				
			}
				if(answer2.toUpperCase().contentEquals("MENU")) {
					System.out.println("!=!=!=!=! MENU !=!=!=!=!");
				item0.print();
				item1.print();
				item2.print();
				item3.print();
				item4.print();
				item5.print();
				item6.print();
				item7.print();
				item8.print();
				item9.print();
				item10.print();
				item11.print();
				item12.print();
				item13.print();
				item14.print();
				item15.print();
				item16.print();
				item17.print();
				item18.print();
				item19.print();
				item20.print();
				System.out.println(defaultmessage);
				break;
			}
			
		}
		}else if (answer.toUpperCase().contentEquals("IPHONE XR")||answer.toUpperCase().contentEquals("18")) {
		item18.print2();
		System.out.println("Would you like to buy an Iphone XR? just type in 'buy' and you will receive one. ");
		for(int j=1; 1>0;j++) {
			if (balance <= 0) {
				balance = 0;}
			String answer2 = input.nextLine();
			if(answer2.toUpperCase().contentEquals("BUY") && item18.getStock() >= 1 && balance >= item18.getPrice()) {
				System.out.println("You have successfully bought the  Iphone XR");
				item18.setStock(item18.getStock()-1);
				balance -= item18.getPrice();
				iphonexr++;
				System.out.println("In order to see your inventory, go to 'menu' and then type in 'inventory' ");
			}else if(answer2.toUpperCase().contentEquals("BUY") && item18.getStock() <= 0) {
				System.out.println("Out of stock. "+"\n Type 'MENU' to exit the program");
			}else if (answer2.toUpperCase().contentEquals("BUY") &&balance< item18.getPrice()) {
				System.out.println("You don't have enough money.");					
				System.out.println("In order to see your inventory, type 'MENU' first, and then 'inventory'.");
			}else if(answer2.toUpperCase().contentEquals("SET STOCK")) {
				if (admin == true) {
					System.out.println("How much would you like to be in stock?");
				int stock = input.nextInt();
				item18.setStock(stock);
				System.out.println("You have successfully changed the number in stock to "+ stock +"prototypes");
				}if(admin == false) {
					System.out.println("You can't use those commands unless you are an admin.");
				}
			}else if(answer2.toUpperCase().contentEquals("SET PRICE")) {
				if (admin == true) {
					System.out.println("What price would you like to set? ");
				int price = input.nextInt();
				item18.setPrice(price);
				System.out.println("You have successfully changed the price to " +price +"£");
				}if(admin == false) {
					System.out.println("You can't use those commands unless you are an admin.");
				
			}
				
			}
				if(answer2.toUpperCase().contentEquals("MENU")) {
					System.out.println("!=!=!=!=! MENU !=!=!=!=!");
				item0.print();
				item1.print();
				item2.print();
				item3.print();
				item4.print();
				item5.print();
				item6.print();
				item7.print();
				item8.print();
				item9.print();
				item10.print();
				item11.print();
				item12.print();
				item13.print();
				item14.print();
				item15.print();
				item16.print();
				item17.print();
				item18.print();
				item19.print();
				item20.print();
				System.out.println(defaultmessage);
				break;
			}
			
		}
		}else if (answer.toUpperCase().contentEquals("IPHONE XS")||answer.toUpperCase().contentEquals("19")) {
		item19.print2();
		System.out.println("Would you like to buy an Iphone XS? just type in 'buy' and you will receive one. ");
		for(int j=1; 1>0;j++) {
			if (balance <= 0) {
				balance = 0;}
			String answer2 = input.nextLine();
			if(answer2.toUpperCase().contentEquals("BUY") && item19.getStock() >= 1 && balance >= item19.getPrice()) {
				System.out.println("You have successfully bought the  Iphone XS");
				item19.setStock(item19.getStock()-1);
				balance -= item19.getPrice();
				iphonexs++;
				System.out.println("In order to see your inventory, go to 'menu' and then type in 'inventory' ");
			}else if(answer2.toUpperCase().contentEquals("BUY") && item19.getStock() <= 0) {
				System.out.println("Out of stock. "+"\n Type 'MENU' to exit the program");
			}else if (answer2.toUpperCase().contentEquals("BUY") &&balance < item19.getPrice()) {
				System.out.println("You don't have enough money.");					
				System.out.println("In order to see your inventory, type 'MENU' first, and then 'inventory'.");
			}else if(answer2.toUpperCase().contentEquals("SET STOCK")) {
				if (admin == true) {
					System.out.println("How much would you like to be in stock?");
				int stock = input.nextInt();
				item19.setStock(stock);
				System.out.println("You have successfully changed the number in stock to "+ stock +"prototypes");
				}if(admin == false) {
					System.out.println("You can't use those commands unless you are an admin.");
				}
			}else if(answer2.toUpperCase().contentEquals("SET PRICE")) {
				if (admin == true) {
					System.out.println("What price would you like to set? ");
				int price = input.nextInt();
				item19.setPrice(price);
				System.out.println("You have successfully changed the price to " +price +"£");
				}if(admin == false) {
					System.out.println("You can't use those commands unless you are an admin.");
				
			}
				
			}
				if(answer2.toUpperCase().contentEquals("MENU")) {
					System.out.println("!=!=!=!=! MENU !=!=!=!=!");
				item0.print();
				item1.print();
				item2.print();
				item3.print();
				item4.print();
				item5.print();
				item6.print();
				item7.print();
				item8.print();
				item9.print();
				item10.print();
				item11.print();
				item12.print();
				item13.print();
				item14.print();
				item15.print();
				item16.print();
				item17.print();
				item18.print();
				item19.print();
				item20.print();
				System.out.println(defaultmessage);
				break;
			}
			
		}
		}else if (answer.toUpperCase().contentEquals("IPHONE XS MAX")||answer.toUpperCase().contentEquals("20")) {
		item20.print2();
		System.out.println("Would you like to buy an Iphone XS max? just type in 'buy' and you will receive one. ");
		for(int j=1; 1>0;j++) {
			if (balance <= 0) {
				balance = 0;}
			String answer2 = input.nextLine();
			if(answer2.toUpperCase().contentEquals("BUY") && item20.getStock() >= 1 && balance >= item20.getPrice()) {
				System.out.println("You have successfully bought the  Iphone XS max");
				item20.setStock(item20.getStock()-1);
				balance -= item20.getPrice();
				iphonexsmax++;
				System.out.println("In order to see your inventory, go to 'menu' and then type in 'inventory' ");
			}else if(answer2.toUpperCase().contentEquals("BUY") && item20.getStock() <= 0) {
				System.out.println("Out of stock. "+"\n Type 'MENU' to exit the program");
			}else if (answer2.toUpperCase().contentEquals("BUY") &&balance < item20.getPrice()) {
				System.out.println("You don't have enough money.");					
				System.out.println("In order to see your inventory, type 'MENU' first, and then 'inventory'.");
			}else if(answer2.toUpperCase().contentEquals("SET STOCK")) {
				if (admin == true) {
					System.out.println("How much would you like to be in stock?");
				int stock = input.nextInt();
				item20.setStock(stock);
				System.out.println("You have successfully changed the number in stock to "+ stock +"prototypes");
				}if(admin == false) {
					System.out.println("You can't use those commands unless you are an admin.");
				}
			}else if(answer2.toUpperCase().contentEquals("SET PRICE")) {
				if (admin == true) {
					System.out.println("What price would you like to set? ");
				int price = input.nextInt();
				item20.setPrice(price);
				System.out.println("You have successfully changed the price to " +price +"£");
				}if(admin == false) {
					System.out.println("You can't use those commands unless you are an admin.");
				
			}
				
			}
				if(answer2.toUpperCase().contentEquals("MENU")) {
					System.out.println("!=!=!=!=! MENU !=!=!=!=!");
				item0.print();
				item1.print();
				item2.print();
				item3.print();
				item4.print();
				item5.print();
				item6.print();
				item7.print();
				item8.print();
				item9.print();
				item10.print();
				item11.print();
				item12.print();
				item13.print();
				item14.print();
				item15.print();
				item16.print();
				item17.print();
				item18.print();
				item19.print();
				item20.print();
				System.out.println(defaultmessage);
				break;
			}
			
		}
		} 
		
		

		// Inventory function. 
		else if(answer.toUpperCase().contentEquals("INVENTORY")) {
			System.out.println("!-!-!-!-!-!-!-!-!-!-");
			System.out.println("Your inventory list");
			System.out.println("!-!-!-!-!-!-!-!-!-!-\n");
			for(int j=1; j>0;j++) {
				
				// if you have already bought an iphone, add it to the integers.
					
		if (originaliphone > 0) {
			System.out.println("You have "+originaliphone+" prototypes of the Original Iphone");
		}
		if (iphone3g > 0) {
		System.out.println("You have "+iphone3g+" prototypes of the  Iphone 3G");
		}
		if (iphone3gs > 0)	{
			System.out.println("You have "+iphone3gs+" prototypes of the Iphone 3GS");
		}
		if (iphone4 > 0)	{
			System.out.println("You have "+iphone4+" prototypes of the Iphone 4");
		}
		if (iphone4s > 0) {
			System.out.println("You have "+iphone4s+" prototypes of the Iphone 4s");
		}
		if (iphone5 > 0) {
			System.out.println("You have "+iphone5+" prototypes of the Iphone 5");
		}
		if (iphone5s > 0) {
			System.out.println("You have "+iphone5s+" prototypes of the Iphone 5S");
		}
		if (iphone5c > 0) {
			System.out.println("You have "+iphone5c+" prototypes of the Iphone 5C");
		}
		if (iphone6 > 0) {
			System.out.println("You have "+iphone6+" prototypes of the Iphone 6");
		}
		if (iphone6plus > 0) {
			System.out.println("You have "+iphone6plus+" prototypes of the Iphone 6 plus ");
		}
		if (iphone6s > 0) {
			System.out.println("You have "+iphone6s+" prototypes of the Iphone 6S");
		}
		if (iphone6splus > 0) {
			System.out.println("You have "+iphone6splus+" prototypes of the Iphone 6S plus");
		}
		if (iphoneSE > 0)	{
			System.out.println("You have "+iphoneSE+" prototypes of the Iphone SE");
		}
		if (iphone7 > 0)	{
			System.out.println("You have "+iphone7+" prototypes of the Iphone 7");
		}
		if (iphone7plus > 0)	{
			System.out.println("You have "+iphone7plus+" prototypes of the Iphone 7 plus");
		}
		if (iphone8 > 0)	{
			System.out.println("You have "+iphone8+" prototypes of the Iphone 8");
		}
		if (iphone8plus > 0)	{
			System.out.println("You have "+iphone8plus+" prototypes of the Iphone 8 plus");
		}
		if (iphonex > 0)	{
			System.out.println("You have "+iphonex+" prototypes of the Iphone X");
		}
		if (iphonexr > 0)	{
			System.out.println("You have "+iphonexr+" prototypes of the Iphone XR");
		}
		if (iphonexs > 0)	{
			System.out.println("You have "+iphonexs+" prototypes of the Iphone XS");
		}
		if (iphonexsmax > 0)	{
			System.out.println("You have "+iphonexsmax+" prototypes of the Iphone XS max");
		}
		String answer2 = input.nextLine();
		if(answer2.toUpperCase().contentEquals("MENU")) {
			System.out.println("!=!=!=!=! MENU !=!=!=!=!");
			item0.print();
			item1.print();
			item2.print();
			item3.print();
			item4.print();
			item5.print();
			item6.print();
			item7.print();
			item8.print();
			item9.print();
			item10.print();
			item11.print();
			item12.print();
			item13.print();
			item14.print();
			item15.print();
			item16.print();
			item17.print();
			item18.print();
			item19.print();
			item20.print();
			System.out.println(defaultmessage);
			break;
			}
		}
	}
			if (answer.toUpperCase().contentEquals("EXIT PROGRAM")) {
					break;
			}
		}
	
	}
}