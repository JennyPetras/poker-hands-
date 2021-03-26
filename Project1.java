// Jennifer Petras
// CS 1180
// Project 1

import java.util.Scanner;

class Project1 {
  public static void main(String[] args) {
 
    // Prompt the user for input 
    System.out.print("Enter your hand: ");
    
    Scanner in = new Scanner(System.in);

    // Assign entire string/line of input to variable 
    String hand = in.nextLine();

    in.close();

    // Have Scanner use delimiter to separate items by looking for spaces
    Scanner sc = new Scanner(hand).useDelimiter(" ");
    // Assign each item to a rank or suit 
    String rank1 = sc.next();
    String suit1 = sc.next();
    String rank2 = sc.next();
    String suit2 = sc.next();
    String rank3 = sc.next();
    String suit3 = sc.next();
    String rank4 = sc.next();
    String suit4 = sc.next();
    String rank5 = sc.next();
    String suit5 = sc.next();
    sc.close();

    // If statement used to specify code that will execute if a condition is true 
    // In order to be true the poker hand must consist of an Ace, King, Queen, Jack, & 10 of the same suit 
    if ((suit1.equals(suit2)
        && suit2.equals(suit3)
        && suit3.equals(suit4)
        && suit4.equals(suit5))
        // Check for every combination of rank so any order of ranks would be valid 
        && (rank1.equals("Ace") || rank2.equals("Ace") || rank3.equals("Ace") || rank4.equals("Ace") || rank5.equals("Ace"))
        && (rank1.equals("King") || rank2.equals("King") || rank3.equals("King") || rank4.equals("King") || rank5.equals("King"))
        && (rank1.equals("Queen") || rank2.equals("Queen") || rank3.equals("Queen") || rank4.equals("Queen") || rank5.equals("Queen"))
        && (rank1.equals("Jack") || rank2.equals("Jack") || rank3.equals("Jack") || rank4.equals("Jack") || rank5.equals("Jack"))
        && (rank1.equals("10") || rank2.equals("10") || rank3.equals("10") || rank4.equals("10") || rank5.equals("10"))) {

        // If the condition is true then the code will excecute 
        // "Royal Flush" will print on the console
        // This means the type of poker hand is a Royal Flush
        System.out.println("Royal Flush");

        // Else if statement used to specify a new condition if the first condition is false 
        // Then specified code will execute if the new condition is true 
        // In order to be true the poker hand must consist of four cards with the same rank
        // All the combinations of ranks that could be entered had to be considered 
    } else if ((rank1.equals(rank2) && rank2.equals(rank3) && rank3.equals(rank4))
        || (rank1.equals(rank3) && rank3.equals(rank4) && rank4.equals(rank5))
        || (rank1.equals(rank2) && rank2.equals(rank4) && rank4.equals(rank5))
        || (rank1.equals(rank2) && rank2.equals(rank3) && rank3.equals(rank5))
        || (rank2.equals(rank3) && rank3.equals(rank4) && rank4.equals(rank5))) {

        // If the condition is true then the code will excecute 
        // "Four of a Kind" will print on the console
        // This means the type of poker hand is a Four of a Kind
        System.out.println("Four of a Kind");

        // Else if statement used to specify a new condition if the first & second conditions are false 
        // Then specified code will execute if the new condition is true 
        // In order to be true the poker hand must consist of five cards with the same suit 
    } else if (suit1.equals(suit2)
        && suit2.equals(suit3)
        && suit3.equals(suit4)
        && suit4.equals(suit5)) { 
        
        // If the condition is true then the code will excecute 
        // "Flush" will print on the console
        // This means the type of poker hand is a Flush
        System.out.println("Flush");

        // Else if statement used to specify a new condition if the first, second, & third conditions are false 
        // Then specified code will execute if the new condition is true 
        /* In order to be true the poker hand must consist of no two cards of the same rank and all the cards 
        cannot be the same suit */
        /* Nothing needs to be included in the statement saying all the cards cannot be the same suit 
        because this is already assumed since the above conditions are false */
    } else if (!rank1.equals(rank2)
        && !rank1.equals(rank3)
        && !rank1.equals(rank4)
        && !rank1.equals(rank5)
        && !rank2.equals(rank3)
        && !rank2.equals(rank4)
        && !rank2.equals(rank5)
        && !rank3.equals(rank4)
        && !rank3.equals(rank5)
        && !rank4.equals(rank5)) {
        
        // If the condition is true then the code will excecute 
        // "High Card" will print on the console
        // This means the type of poker hand is a High Card
        System.out.println("High Card");

        // Else statement used if all the conditions above are false  
    } else {

        // Program will output “I don’t recognize this hand" since no hnad types are recognized 
        System.out.println("I don`t recognize that hand");
    }
  }
}
