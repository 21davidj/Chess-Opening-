import java.util.Scanner;

public class Opening {
  public static void opening() {
    Scanner userInput = new Scanner(System.in);
    System.out.println("We have 3 openings prepared: \n1. Danish Gambit \n2. Morra Gambit \n3. Evan's Gambit \n\nWhich opening would you like to see?");
    while (true) {
      if (userInput.nextLine().equals("Danish Gambit")) {
          System.out.println("\nGreat choice! Here's the Danish Gambit:");
          Danish.board();
        } 
      else {
        System.out.println("Please enter an opening.\n'Danish Gambit', 'Morra Gambit', or 'Evan's Gambit' ");
        userInput.next();
      }
    }
  }
}