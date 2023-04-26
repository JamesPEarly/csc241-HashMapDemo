package csc241;


import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instantiate a hashmap
        HashMap<String, CompactDisc> db = new HashMap();

        // Create a scanner
        Scanner kb = new Scanner(System.in);

        // Get info
        for (int i = 0; i < 3; i++){
            System.out.println("Enter the UPC:");
            String upc = kb.nextLine();
            System.out.println("Enter the price:");
            double price = Double.parseDouble(kb.nextLine());
            System.out.println("Enter the artist:");
            String artist = kb.nextLine();
            System.out.println("Enter the title:");
            String title = kb.nextLine();
            // Create a compact disc
            CompactDisc cd = new CompactDisc(upc,price, artist, title);
            // Put in hashmap
            db.put(cd.getUpc(), cd);
        }


        // Show the keys
        System.out.println("---=== UPC in the the database ===---");
        for (String upc : db.keySet()){
            System.out.println(upc);
        }

        // Lookup
        System.out.println("--=== Lookup ===---");
        String myUpc = "";
        do {
            // Prompt the user
            System.out.println("Enter the UPC (or exit):");
            myUpc = kb.nextLine();
            CompactDisc myCd = db.get(myUpc);
            if (myCd == null) {
                // cd not found
                System.out.println("CD not found");
            } else {
                System.out.println("Title: " + myCd.getTitle() + "; " + myCd.getPrice());
            }
        } while (!myUpc.equals("exit"));

        System.out.println("Thank you for using the CD database!");
    }
}
