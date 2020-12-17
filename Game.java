import java.util.Scanner;

public class Game {
  public String name;
  public String opening;
  public String moreOpenings;
  public String nextMove;
  //gameBoard object and scanner for user input
  Board gameBoard = new Board();
  Scanner consoleInput = new Scanner(System.in);

  //Asks user to choose name, followed by a greeting
  public void name() {
    System.out.println("\nPlease enter your name: ");
    name = consoleInput.nextLine();
    System.out.println("Hello " + name + "!\n");
  }

  //Asks user to choose opening
  public void opening() {
    System.out.println(
        "We have 3 openings prepared: \n1. Danish Gambit \n2. Morra Gambit \n3. Evan's Gambit \n\nWhich opening would you like to see?");
    //Forever loop to ensure the user chooses one of the openings
    while (true) {
      opening = consoleInput.nextLine();
      if (opening.equalsIgnoreCase("Danish Gambit")) {
        System.out.println("\nGreat choice! Here's the Danish Gambit:");
        danish();
        break;
      } else if (opening.equalsIgnoreCase("Morra Gambit")) {
        System.out.println("\nExcellent choice! Here's the Morra Gambit: ");
        morra();
        break;
      } else if (opening.equalsIgnoreCase("Evan's Gambit")) {
        System.out.println("\nPerfect! Here's the Evan's Gambit: ");
        evans();
        break;
      } else {
        System.out.println("Please enter an opening.\n'Danish Gambit', 'Morra Gambit', or 'Evan's Gambit' ");
      }
    }
  }

  //After an opening is displayed, user is asked if they want to see more
  public void moreOpenings() {
    System.out.println("\nWould you like to see another opening? Reply 'Yes' or 'No' ");
    //Forever loop used to ensure that the response is either yes or no
    while (true) {
      moreOpenings = consoleInput.nextLine();
      if (moreOpenings.equalsIgnoreCase("Yes")) {
        System.out.println("\nAwesome!");
        opening();
        break;
      } else if (moreOpenings.equalsIgnoreCase("No")) {
        System.out.println("\nThanks for playing! We hope you learned a new gambit!");
        //Ends program if "no" is entered
        System.exit(0);
      } else {
        System.out.println("Please enter 'Yes' for more openings OR 'No' to end the lesson.");
      }
    }
  }

  //Danish oppening method displays the danish gambit
  public void danish() {
    //Each move requires the array to be modified to the correct move then printBoard method
    gameBoard.board[4][4] = '\u265F';
    gameBoard.board[6][4] = ' ';
    gameBoard.printBoard();
    System.out.println("\n---------------------------             1. White plays pawn to e4\n");
    //Asks user to type next for the next move
    nextMove(); 

    gameBoard.board[3][4] = '\u2659';
    gameBoard.board[1][4] = ' ';
    gameBoard.printBoard();
    System.out.println("\n---------------------------             2. Black plays pawn to e5\n");
    nextMove();
    
    gameBoard.board[4][3] = '\u265F';
    gameBoard.board[6][3] = ' ';
    gameBoard.printBoard();
    System.out.println("\n---------------------------             3. White plays pawn to d4\n");
    nextMove();

    gameBoard.board[4][3] = '\u2659';
    gameBoard.board[3][4] = ' ';
    gameBoard.printBoard();
    System.out.println("\n---------------------------             4. Black takes pawn\n");
    nextMove();

    gameBoard.board[5][2] =  '\u265F';
    gameBoard.board[6][2] = ' ';
    gameBoard.printBoard();
    System.out.println("\n---------------------------             5. White plays pawn c3\n");
    
    //Short description of the danish opening with piece notation
    System.out.println("The objective of the Danish Gambit is to rapidly develop white's bishops. \nThe position looks favorable for black because they are up material. \nHowever, white has a clear lead in development. \nThe most notable line once accepted is Bishop to c4 followed by Bishop to b2. \nPiece notation: 1.e4 e5 2.d4 exd4 3.c3");
    
    //moreOpenings called to ask user if they want to continue the game
    moreOpenings();
  }

  public void morra() {
    gameBoard.board[4][4] = '\u265F';
    gameBoard.board[6][4] = ' ';
    gameBoard.printBoard();
    System.out.println("\n---------------------------             1. White plays pawn to e4\n");
    nextMove();

    gameBoard.board[3][2] = '\u2659';
    gameBoard.board[1][2] = ' ';
    gameBoard.printBoard();
    System.out.println("\n---------------------------             2. Black plays pawn to c5 — Sicilian Defense\n");
    nextMove();

    gameBoard.board[4][3] = '\u265F';
    gameBoard.board[6][3] = ' ';
    gameBoard.printBoard();
    System.out.println("\n---------------------------             3. White plays pawn to d4\n");
    nextMove();

    gameBoard.board[4][3] = '\u2659';
    gameBoard.board[3][2] = ' ';
    gameBoard.printBoard();
    System.out.println("\n---------------------------             4. Black accepts the gambit by taking the pawn on d4\n");
    nextMove();

    gameBoard.board[5][2] =  '\u265F';
    gameBoard.board[6][2] = ' ';
    gameBoard.printBoard();
    System.out.println("\n---------------------------             5. White plays pawn to c3\n");
    nextMove();

    gameBoard.board[5][2] =  '\u2659';
    gameBoard.board[4][3] = ' ';
    gameBoard.printBoard();
    System.out.println("\n---------------------------             6. Black takes pawn\n");
    nextMove();

    gameBoard.board[5][2] = '\u265E';
    gameBoard.board[7][1] = ' ';
    gameBoard.printBoard();
    System.out.println("\n---------------------------             7. White takes pawn with knight\n");
    nextMove();
    
    System.out.println("The Smith Morra Gambit (Morra for short) attempts to gain momentum by overwhelming the opponent. \nBy offering a pawn on d4 AND c3, black plays the same piece (pawn) three consecutive times. \nThis is generally poor play as it allows white to develop a knight on c3 and opens the diagonal for bishop to c4. \nPiece notation: 1.e4 c5 2.d4 cxd4 3.c3 dxc3 4.Nxc3");

    moreOpenings();
  }

  public void evans() {
    gameBoard.board[4][4] = '\u265F';
    gameBoard.board[6][4] = ' ';
    gameBoard.printBoard();
    System.out.println("\n---------------------------             1. White plays pawn to e4\n");
    nextMove();

    gameBoard.board[3][4] = '\u2659';
    gameBoard.board[1][4] = ' ';
    gameBoard.printBoard();
    System.out.println("\n---------------------------             2. Black plays pawn to e5\n");
    nextMove();

    gameBoard.board[5][5] = '\u265E';
    gameBoard.board[7][6] = ' ';
    gameBoard.printBoard();
    System.out.println("\n---------------------------             3. White plays knight to f3\n");
    nextMove();

    gameBoard.board[2][2] = '\u2658';
    gameBoard.board[0][1] = ' ';
    gameBoard.printBoard();
    System.out.println("\n---------------------------             4. Black plays knight to c6, defending the e5 pawn\n");
    nextMove();

    gameBoard.board[4][2] = '\u265D';
    gameBoard.board[7][5] = ' ';
    gameBoard.printBoard();
    System.out.println("\n---------------------------             5. White plays bishop to c4 - Italian Game\n");
    nextMove();

    gameBoard.board[3][2] = '\u2657';
    gameBoard.board[0][5] = ' ';
    gameBoard.printBoard();
    System.out.println("\n---------------------------             6. Black plays bishop to c5\n");
    nextMove();

    gameBoard.board[4][1] = '\u265F';
    gameBoard.board[6][1] = ' ';
    gameBoard.printBoard();
    System.out.println("\n---------------------------             7. White plays pawn b4, offering a gambit\n");
      
    System.out.println("The Evan's Gambit is a very aggressive variation of the Italian game. \nWith both sides maintaining control of the center squares, b4 threatens the black bishop. \nIf accepted, white must take advantage of the misplaced bishop by preventing black to castle, developing the queen, etc. \nOverall, the Evan's Gambit is a great choice for beginners to develop a striking attack. \nPiece notation: 1.e4 e5 2.Nf3 Nc6 3.Bc4 Bc5 4.b4");
    
    moreOpenings();
  }

  //Asks user to type "next" to see the next move
  public void nextMove() {
    System.out.println("Press enter to see the next move");
    //Forever loop ensures that the user types "next" to see the next move
    consoleInput.nextLine();
  }
}
