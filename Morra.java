public class Morra {
  public static void board() {
    System.out.println("\n---------------------------\n");
    char[][] firstMove = new char[8][8];
    for (int i = 0; i < 8; i++) {
      firstMove[0][0] = '\u2656';
      firstMove[0][1] = '\u2658';
      firstMove[0][2] = '\u2657';
      firstMove[0][3] = '\u2655';
      firstMove[0][4] = '\u2654';
      firstMove[0][5] = '\u2657';
      firstMove[0][6] = '\u2658';
      firstMove[0][7] = '\u2656';
      firstMove[1][i] = '\u2659';
      firstMove[2][i] = ' ';
      firstMove[3][i] = ' ';
      firstMove[4][i] = ' ';
      firstMove[4][4] = '\u265F';
      firstMove[5][i] = ' ';
      firstMove[6][i] = '\u265F';
      firstMove[6][4] = ' ';
      firstMove[7][0] = '\u265C';
      firstMove[7][1] = '\u265E';
      firstMove[7][2] = '\u265D';
      firstMove[7][3] = '\u265B';
      firstMove[7][4] = '\u265A';
      firstMove[7][5] = '\u265D';
      firstMove[7][6] = '\u265E';
      firstMove[7][7] = '\u265C';
    }

    for (char[] array: firstMove) {
      for (char value: array) {
        System.out.print("  "+value);
      }
      System.out.println();
    }  
      System.out.println("\n---------------------------             1. White plays pawn to e4\n");
  char[][] secondMove = new char[8][8];
    for (int i = 0; i < 8; i++) {
      secondMove[0][0] = '\u2656';
      secondMove[0][1] = '\u2658';
      secondMove[0][2] = '\u2657';
      secondMove[0][3] = '\u2655';
      secondMove[0][4] = '\u2654';
      secondMove[0][5] = '\u2657';
      secondMove[0][6] = '\u2658';
      secondMove[0][7] = '\u2656';
      secondMove[1][i] = '\u2659';
      secondMove[1][2] = ' ';
      secondMove[2][i] = ' ';
      secondMove[3][i] = ' ';
      secondMove[3][2] = '\u2659';
      secondMove[4][i] = ' ';
      secondMove[4][4] = '\u265F';
      secondMove[5][i] = ' ';
      secondMove[6][i] = '\u265F';
      secondMove[6][4] = ' ';
      secondMove[7][0] = '\u265C';
      secondMove[7][1] = '\u265E';
      secondMove[7][2] = '\u265D';
      secondMove[7][3] = '\u265B';
      secondMove[7][4] = '\u265A';
      secondMove[7][5] = '\u265D';
      secondMove[7][6] = '\u265E';
      secondMove[7][7] = '\u265C';
    }
    for (char[] array: secondMove) {
      for (char value: array) {
        System.out.print("  "+value);
      }
      System.out.println();
    }  
      System.out.println("\n---------------------------             2. Black plays pawn to c5 — Sicilian Defense\n");
  
  char[][] thirdMove = new char[8][8];
    for (int i = 0; i < 8; i++) {
      thirdMove[0][0] = '\u2656';
      thirdMove[0][1] = '\u2658';
      thirdMove[0][2] = '\u2657';
      thirdMove[0][3] = '\u2655';
      thirdMove[0][4] = '\u2654';
      thirdMove[0][5] = '\u2657';
      thirdMove[0][6] = '\u2658';
      thirdMove[0][7] = '\u2656';
      thirdMove[1][i] = '\u2659';
      thirdMove[1][2] = ' ';
      thirdMove[2][i] = ' ';
      thirdMove[3][i] = ' ';
      thirdMove[3][2] = '\u2659';
      thirdMove[4][i] = ' ';
      thirdMove[4][4] = '\u265F';
      thirdMove[4][3] = '\u265F';
      thirdMove[5][i] = ' ';
      thirdMove[6][i] = '\u265F';
      thirdMove[6][3] = ' ';
      thirdMove[6][4] = ' ';
      thirdMove[7][0] = '\u265C';
      thirdMove[7][1] = '\u265E';
      thirdMove[7][2] = '\u265D';
      thirdMove[7][3] = '\u265B';
      thirdMove[7][4] = '\u265A';
      thirdMove[7][5] = '\u265D';
      thirdMove[7][6] = '\u265E';
      thirdMove[7][7] = '\u265C';
    }
    for (char[] array: thirdMove) {
      for (char value: array) {
        System.out.print("  "+value);
      }
      System.out.println();
    }  
      System.out.println("\n---------------------------             3. White plays pawn to d4\n");
  
  char[][] fourthMove = new char[8][8];
    for (int i = 0; i < 8; i++) {
      fourthMove[0][0] = '\u2656';
      fourthMove[0][1] = '\u2658';
      fourthMove[0][2] = '\u2657';
      fourthMove[0][3] = '\u2655';
      fourthMove[0][4] = '\u2654';
      fourthMove[0][5] = '\u2657';
      fourthMove[0][6] = '\u2658';
      fourthMove[0][7] = '\u2656';
      fourthMove[1][i] = '\u2659';
      fourthMove[1][2] = ' ';
      fourthMove[2][i] = ' ';
      fourthMove[3][i] = ' ';
      fourthMove[4][i] = ' ';
      fourthMove[4][4] = '\u265F';
      fourthMove[4][3] = '\u2659';
      fourthMove[5][i] = ' ';
      fourthMove[6][i] = '\u265F';
      fourthMove[6][3] = ' ';
      fourthMove[6][4] = ' ';
      fourthMove[7][0] = '\u265C';
      fourthMove[7][1] = '\u265E';
      fourthMove[7][2] = '\u265D';
      fourthMove[7][3] = '\u265B';
      fourthMove[7][4] = '\u265A';
      fourthMove[7][5] = '\u265D';
      fourthMove[7][6] = '\u265E';
      fourthMove[7][7] = '\u265C';
    }
    for (char[] array: fourthMove) {
      for (char value: array) {
        System.out.print("  "+value);
      }
      System.out.println();
    }  
      System.out.println("\n---------------------------             4. Black accepts the gambit by taking the pawn on d4\n");
    
    char[][] fifthMove = new char[8][8];
    for (int i = 0; i < 8; i++) {
      fifthMove[0][0] = '\u2656';
      fifthMove[0][1] = '\u2658';
      fifthMove[0][2] = '\u2657';
      fifthMove[0][3] = '\u2655';
      fifthMove[0][4] = '\u2654';
      fifthMove[0][5] = '\u2657';
      fifthMove[0][6] = '\u2658';
      fifthMove[0][7] = '\u2656';
      fifthMove[1][i] = '\u2659';
      fifthMove[1][2] = ' ';
      fifthMove[2][i] = ' ';
      fifthMove[3][i] = ' ';
      fifthMove[4][i] = ' ';
      fifthMove[4][4] = '\u265F';
      fifthMove[4][3] = '\u2659';
      fifthMove[5][i] = ' ';
      fifthMove[5][2] = '\u265F';
      fifthMove[6][i] = '\u265F';
      fifthMove[6][2] = ' ';
      fifthMove[6][3] = ' ';
      fifthMove[6][4] = ' ';
      fifthMove[7][0] = '\u265C';
      fifthMove[7][1] = '\u265E';
      fifthMove[7][2] = '\u265D';
      fifthMove[7][3] = '\u265B';
      fifthMove[7][4] = '\u265A';
      fifthMove[7][5] = '\u265D';
      fifthMove[7][6] = '\u265E';
      fifthMove[7][7] = '\u265C';
    }
    for (char[] array: fifthMove) {
      for (char value: array) {
        System.out.print("  "+value);
      }
      System.out.println();
    }  
      System.out.println("\n---------------------------             5. White plays pawn c3\n");
     
    char[][] sixthMove = new char[8][8];
    for (int i = 0; i < 8; i++) {
      sixthMove[0][0] = '\u2656';
      sixthMove[0][1] = '\u2658';
      sixthMove[0][2] = '\u2657';
      sixthMove[0][3] = '\u2655';
      sixthMove[0][4] = '\u2654';
      sixthMove[0][5] = '\u2657';
      sixthMove[0][6] = '\u2658';
      sixthMove[0][7] = '\u2656';
      sixthMove[1][i] = '\u2659';
      sixthMove[1][2] = ' ';
      sixthMove[2][i] = ' ';
      sixthMove[3][i] = ' ';
      sixthMove[4][i] = ' ';
      sixthMove[4][4] = '\u265F';
      sixthMove[4][3] = ' '; //change to knight
      sixthMove[5][i] = ' ';
      sixthMove[5][2] = '\u2659';
      sixthMove[6][i] = '\u265F';
      sixthMove[6][2] = ' ';
      sixthMove[6][3] = ' ';
      sixthMove[6][4] = ' ';
      sixthMove[7][0] = '\u265C';
      sixthMove[7][1] = '\u265E';
      sixthMove[7][2] = '\u265D';
      sixthMove[7][3] = '\u265B';
      sixthMove[7][4] = '\u265A';
      sixthMove[7][5] = '\u265D';
      sixthMove[7][6] = '\u265E';
      sixthMove[7][7] = '\u265C';
    }
    for (char[] array: sixthMove) {
      for (char value: array) {
        System.out.print("  "+value);
      }
      System.out.println();
    }  
      System.out.println("\n---------------------------             6. Black takes pawn\n");
     
    char[][] seventhMove = new char[8][8];
    for (int i = 0; i < 8; i++) {
      seventhMove[0][0] = '\u2656';
      seventhMove[0][1] = '\u2658';
      seventhMove[0][2] = '\u2657';
      seventhMove[0][3] = '\u2655';
      seventhMove[0][4] = '\u2654';
      seventhMove[0][5] = '\u2657';
      seventhMove[0][6] = '\u2658';
      seventhMove[0][7] = '\u2656';
      seventhMove[1][i] = '\u2659';
      seventhMove[1][2] = ' ';
      seventhMove[2][i] = ' ';
      seventhMove[3][i] = ' ';
      seventhMove[4][i] = ' ';
      seventhMove[4][4] = '\u265F';
      seventhMove[4][3] = ' ';
      seventhMove[5][i] = ' ';
      seventhMove[5][2] = '\u265E';
      seventhMove[6][i] = '\u265F';
      seventhMove[6][2] = ' ';
      seventhMove[6][3] = ' ';
      seventhMove[6][4] = ' ';
      seventhMove[7][0] = '\u265C';
      seventhMove[7][1] = ' ';
      seventhMove[7][2] = '\u265D';
      seventhMove[7][3] = '\u265B';
      seventhMove[7][4] = '\u265A';
      seventhMove[7][5] = '\u265D';
      seventhMove[7][6] = '\u265E';
      seventhMove[7][7] = '\u265C';
    }
    for (char[] array: seventhMove) {
      for (char value: array) {
        System.out.print("  "+value);
      }
      System.out.println();
    }  
      System.out.println("\n---------------------------             7. White takes pawn with knight\n");
      
      System.out.println("The Smith Morra Gambit (Morra for short) attempts to gain momentum by overwhelming the opponent. \nBy offering a pawn on d4 AND c3, black plays the same piece (pawn) three consecutive times. \nThis is generally poor play as it allows white to develop a knight on c3 and opens the diagonal for bishop to c4. \nPiece notation: 1.e4 c5 2.d4 cxd4 3.c3 dxc3 4.Nxc3");
  }
}

