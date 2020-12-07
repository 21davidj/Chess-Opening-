import java.util.Scanner;

public class Opening {
  public static void opening() {
    Scanner userInput = new Scanner(System.in);
    System.out.println("Which opening: ");
    while (true) {
      if (userInput.nextLine().equals("Danish Gambit")) {
          System.out.println("Danish Gambit");
          break;
        } 
      else if (userInput.equals("Morra Gambit")) {
          System.out.println("Morra Gambit");
        }
      else if (userInput.equals("Evan's Gambit")) {
        System.out.println("Evan's Gambit");
      }
      else {
        System.out.println("Please enter a gambit: ");
        userInput.next();
      }
    }
  }
}