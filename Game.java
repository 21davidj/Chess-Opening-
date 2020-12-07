import java.util.Scanner;

public class Game {
  public String name;
  public String opening;
  public String moreOpenings;
  public Board board;
  Scanner consoleInput = new Scanner(System.in);
  
  public void name() {
    System.out.println("Please enter your name: ");
        name = consoleInput.nextLine();
       System.out.println("Hello " + name + "!\n");
  }

  public void opening() {
    System.out.println("We have 3 openings prepared: \n1. Danish Gambit \n2. Morra Gambit \n3. Evan's Gambit \n\nWhich opening would you like to see?");
    opening = consoleInput.nextLine();
    while (true) {
      if (opening.equals("Danish Gambit")) {
          System.out.println("\nGreat choice! Here's the Danish Gambit:");
          break;
        } 
      else if (opening.equals("Morra Gambit")) {
          System.out.println("\nExcellent choice! Here's the Morra Gambit: ");
          break;
      }
      else if (opening.equals("Evan's Gambit")) {
          System.out.println("\nPerfect! Here's the Evan's Gambit: ");
          break;
      }
      else {
        System.out.println("Please enter an opening.\n'Danish Gambit', 'Morra Gambit', or 'Evan's Gambit' ");
        consoleInput.nextLine();
      }
    }
  }
  
  public void moreOpenings() {
    System.out.println("\nWould you like to see another opening? Reply 'Yes' or 'No' ");
    moreOpenings = consoleInput.nextLine();
      if (moreOpenings.equals("Yes")) {
        System.out.println("\nAwesome!");
        opening();
      }
      else if (moreOpenings.equals("No")) {
        System.out.println("\nThanks for playing! We hope you learned a new gambit!");
      }
      else {
        System.out.println("Please enter 'Yes' for more openings OR 'No' to end the lesson.");
        consoleInput.nextLine();
      }
  }

  public void danish() {
      Board.Board();
    
    char[][] board = new char[8][8];
    for (int i = 0; i < 8; i++) {
      board[4][4] = '\u265F';
      board[5][i] = ' ';
      board[6][i] = '\u265F';
      board[6][4] = ' ';
    }
  }
}

  