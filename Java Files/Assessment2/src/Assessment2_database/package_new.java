package Assessment2_database;
import java.util.Scanner;
import java.util.Random;
public class package_new {
 public static boolean codeCheck;
 public static boolean admin;
 public static String defaultmessage = "What are your options: " +
  "\n You can input any Iphone model or the number on the list to view it's properties." +
  "\n 'budget' Used to check your balance and your affordable phones " +
  "\n 'inventory' will show you all the items you have bought." +
  "\n 'christmas' 50£ discount to all products. Merry Christmas! " +
  "\n 'admin' Once used, You can use the comands 'set price' and 'set stock' " +
  "\n 'exit program' Used to exit the program." +
  "\n 'options' to access the options." +
  "\n You can only access those options in the menu, so before typing in any option, please type in 'menu' before doing so.";
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  Random r = new Random();
  codeCheck = false;
  admin = false;
  //model,company,processor, storage,year,price,quantity sold (ITEMS)
  int discount = 50;
  data[] dataArray = new data[21];
  dataArray[0] = new data("Original iPhone", "Apple", "S5L8900", "4GB/8GB/16GB", "29.06.2007", 499, "£", "3.7 million", r.nextInt(10) + 1,0);
  dataArray[1] = new data("iPhone 3G", "Apple", "S5L8900", "8GB/16GB", "09.06.2008", 599, "£", "17.3 million", r.nextInt(10) + 1, 0);
  dataArray[2] = new data("iPhone 3GS", "Apple", "S5L8920", "8GB/16GB/32GB", "19.08.2009", 599, "£", "50 million", r.nextInt(10) + 1, 0);
  dataArray[3] = new data("iPhone 4", "Apple", "S5L8930 'A4' ", "8GB/16GB/32GB", "24.10.2010", 599, "£", "108 million", r.nextInt(10) + 1, 0);
  dataArray[4] = new data("iPhone 4S", "Apple", "S5L8940 'A5' ", "16GB/32GB/64GB", "11.1O.2O11", 649, "£", "319 million", r.nextInt(10) + 1, 0);
  dataArray[5] = new data("iPhone 5", "Apple", "S5L8950 'A6' ", "16GB/32GB/64GB", "21.09.2012", 649, "£", "319 million", r.nextInt(10) + 1, 0);
  dataArray[6] = new data("iPhone 5S", "Apple", "S5L8960 'A7' ", "16GB/32GB/64GB", "20.09.2013", 649, "£", "500 million(Together with Iphone 5c", r.nextInt(10) + 1, 0);
  dataArray[7] = new data("iPhone 5c", "Apple", "S5L8950 'A6' ", "16GB/32GB/64GB", "20.09.2013", 649, "£", "500 million(together with Iphone 5s", r.nextInt(10) + 1, 0);
  dataArray[8] = new data("iPhone 6", "Apple", "T7000 'A8' ", "16GB/64GB/128GB", "09.09.2014", 649, "£", "773.8 million(Together with Iphone 6 plus", r.nextInt(10) + 1, 0);
  dataArray[9] = new data("iPhone 6 plus", "Apple", "T7000 'A8' ", "16GB/64GB/128GB", "09.09.2014", 749, "£", "773.8 million(Together with Iphone 6", r.nextInt(10) + 1, 0);
  dataArray[10] = new data("iPhone 6s", "Apple", "S8000 and S8003 'A9' ", "16GB/64GB/128GB", "09.09.2015", 649, "£", "1 Billion(Together with Iphone 6s plus and Iphone SE", r.nextInt(10) + 1, 0);
  dataArray[11] = new data("iPhone 6s plus", "Apple", "S8000 and S8003 'A9' ", "16GB/64GB/128GB", "09.09.2015", 749, "£", "1 billion(Together with Iphone 6 and Iphone SE", r.nextInt(10) + 1, 0);
  dataArray[12] = new data("iPhone SE", "Apple", "S8000 and S8003 'A9'", "16GB/32GB/64GB/128GB", "31.03.2016", 649, "£", "1 billion(Together with Iphone 6 and Iphone 6s", r.nextInt(10) + 1, 0);
  dataArray[13] = new data("iPhone 7", "Apple", "T8010 'A10' ", "32GB/128GB/256GB", "16.09.2016", 649, "£", "1.16 billion with Iphone 7 plus", r.nextInt(10) + 1, 0);
  dataArray[14] = new data("iPhone 7 plus", "Apple", "T8010 'A10' ", "32GB/128GB/256GB", "16.09.2016", 769, "£", "1.16 billion with Iphone 7", r.nextInt(10) + 1, 0);
  dataArray[15] = new data("iPhone 8", "Apple", "T8015 'A11' ", "64GB/256GB", "22.09.2017", 699, "£", "Unknown number of prototypes sold", r.nextInt(10) + 1, 0);
  dataArray[16] = new data("iPhone 8 plus", "Apple", "T8015 'A11' ", "64GB/256GB", "22.09.2017", 799, "£", "Unknown number of prototypes sold", r.nextInt(10) + 1, 0);
  dataArray[17] = new data("iPhone X", "Apple", "T8015 'A11' ", "64GB/256GB", "03.11.2017", 999, "£", "Unknown number of prototypes sold", r.nextInt(10) + 1, 0);
  dataArray[18] = new data("iPhone XR", "Apple", "A12 Bionic Chipset", "64GB/128GB/256GB", "26.10.2018", 749, "£", "Unknown number of prototypes sold", r.nextInt(10) + 1, 0);
  dataArray[19] = new data("iPhone XS", "Apple", "A12 Bionic processor", "64GB/128GB/256GB", "21.09.2018", 999, "£", "Unknown number of prototypes sold", r.nextInt(10) + 1, 0);
  dataArray[20] = new data("iPhone XS Max", "Apple", "A12 Bionic processor", "64GB/128GB/256GB", "21.09.2018", 1099, "£", "Unknown number of prototypes sold", r.nextInt(10) + 1, 0);

  int balance = 0;
  System.out.println("Welcome to the Apple store!");
  System.out.println("Whats your Balance?\n Note: You need more that 500£ to buy at least one Iphone.");
  // placeholder for integer validation
  int budget = input.nextInt();
  balance += budget;
  System.out.println("!=!=!=!=! MENU !=!=!=!=!\n");
  for (int b = 0; b < dataArray.length; b++) {
   System.out.println(b + ". " + dataArray[b].getModel());
  }
  System.out.println(defaultmessage);
  //Printer
  //Printer






  if (input.nextLine() != "") {
   for (int i = 1; i > 0; i++) {
    String answer = input.nextLine();
    if (answer.toUpperCase().contentEquals("BUDGET")) {
     System.out.println("Your current budget is :" + "£" + balance);
     for (int b = 0; b < dataArray.length; b++) {
      if (balance >= dataArray[b].getPrice()) {
       System.out.println(b + ". " + dataArray[b].getModel());
      }
     }
    } else if (answer.toUpperCase().contentEquals("OPTIONS")) {
     System.out.println(defaultmessage);

    } else if (answer.toUpperCase().contentEquals("CHRISTMAS")) {
     if (codeCheck == false) {
      for (int b = 0; b < dataArray.length; b++) {
       dataArray[b].setPrice(dataArray[b].getPrice() - discount);
       if (dataArray[b].getPrice() < 0) {
        dataArray[b].setPrice(0);
       }
      }
      System.out.println("You have discounted the price by 50$!");
      codeCheck = true;
     } else if (codeCheck == true) {
      System.out.println("Code has already been used!");
     }


    } else if (answer.toUpperCase().contentEquals("ADMIN")) {
     admin = true;
     System.out.println("Admin commands: \n Set Stock (Changing the items in stock) \n Set Price (Changing the price of items)");
     System.out.println("Usage: First you type in 'set stock' or 'set price' and then you choose the number you'd like ");
     System.out.println("In order to go back to the main menu, type in 'menu'");

    } else if (answer.toUpperCase().contentEquals("MENU")) {
     System.out.println("!=!=!=!=! MENU !=!=!=!=!");
     for (int b = 0; b < dataArray.length; b++) {
      System.out.println(b + ". " + dataArray[b].getModel());
     }
     System.out.println(defaultmessage);
    } else if (answer.toUpperCase().contentEquals("INVENTORY")) {
     System.out.println("!-!-!-!-!-!-!-!-!-!-");
     System.out.println("Your inventory list");
     System.out.println("!-!-!-!-!-!-!-!-!-!-\n");

     // if you have already bought an iphone, add it to the integers.
     for (int b = 0; b < dataArray.length; b++) {
      if (dataArray[b].getInv() > 0) {
       System.out.println("You have " + dataArray[b].getInv() + " prototypes of the " + dataArray[b].getModel());
       System.out.println("");
      }
     }
     System.out.println(defaultmessage);
     continue;
    } else {
     for (int d = 0; d < dataArray.length; d++) {
      if (answer.contentEquals(dataArray[d].getModel()) || answer.contentEquals(new Integer(d).toString())) {
       dataArray[d].print2();
       System.out.println("Would you like to buy an " + dataArray[d].getModel() + " just type in 'buy' and you will receive one. ");
       if (balance <= 0) {
        balance = 0;
       }
       for (int a = 1; a > 0; a++) {
        String answer2 = input.nextLine();
        if (answer2.toUpperCase().contentEquals("BUY") && dataArray[d].getStock() >= 1 && balance >= dataArray[d].getPrice()) {
         System.out.println("You have successfully bought the " + dataArray[d].getModel());
         dataArray[d].setStock(dataArray[d].getStock() - 1);
         balance -= dataArray[d].getPrice();
         dataArray[d].setInv(dataArray[d].getInv() + 1);
         System.out.println("In order to see your inventory, go to 'menu' and then type in 'inventory' ");
        } else if (answer2.toUpperCase().contentEquals("BUY") && dataArray[d].getStock() <= 0) {
         System.out.println("Out of stock. " + "\n Type 'menu' to exit the program");
        } else if (answer2.toUpperCase().contentEquals("BUY") && balance < dataArray[d].getPrice()) {
         System.out.println("You don't have enough money.");
         System.out.println("In order to see your inventory, type 'MENU' first, and then 'inventory'.");

        } else if (answer2.toUpperCase().contentEquals("SET STOCK")) {
         if (admin == true) {
          System.out.println("How much would you like to be in stock?");
          int stock = input.nextInt();

          dataArray[d].setStock(stock);
          System.out.println("You have successfully changed the number in stock to " + stock + " prototypes");
         }
         if (admin == false) {
          System.out.println("You can't use those commands unless you are an admin.");
         }
        } else if (answer2.toUpperCase().contentEquals("SET PRICE")) {
         if (admin == true) {
          System.out.println("What price would you like to set? ");
          int price = input.nextInt();
          dataArray[d].setPrice(price);
          System.out.println("You have successfully changed the price to " + price + "£");
         }
         if (admin == false) {
          System.out.println("You can't use those commands unless you are an admin.");
         }
        } else if (answer2.toUpperCase().contentEquals("MENU")) {
         System.out.println("!=!=!=!=! MENU !=!=!=!=!");
         System.out.println(d + ". " + dataArray[d].getModel());
         for (int e = 0; e < dataArray.length; e++) {
          System.out.println(e + ". " + dataArray[e].getModel());
         }
         System.out.println(defaultmessage);
         break;
        }
       }
      }
     }
    }
    if (answer.toUpperCase().contentEquals("EXIT PROGRAM")) {
     break;
    }
   }
  }
 }
}