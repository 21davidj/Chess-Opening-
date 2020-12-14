public class Board {
  //Creates an 8x8 board with char 
  char[][] board = new char[8][8];
  
  //Constructor that can be accessed for future moves in opening methods (danish, morra, and evans)
  public Board() {
    //For loop used to fill entire row with corresponding char
    for (int i = 0; i < 8; i++) {
      board[2][i] = ' ';      board[1][i] = '\u2659'; 
      board[3][i] = ' ';      board[4][i] = ' ';
      board[5][i] = ' ';      board[6][i] = '\u265F';
    }
      //Rest of board intialized piece by piece, square by square
      board[0][0] = '\u2656'; board[0][1] = '\u2658';
      board[0][2] = '\u2657'; board[0][3] = '\u2655';
      board[0][4] = '\u2654'; board[0][5] = '\u2657';
      board[0][6] = '\u2658'; board[0][7] = '\u2656';
      board[7][0] = '\u265C'; board[7][1] = '\u265E';
      board[7][2] = '\u265D'; board[7][3] = '\u265B';
      board[7][4] = '\u265A'; board[7][5] = '\u265D';
      board[7][6] = '\u265E'; board[7][7] = '\u265C';
//At the end, prints the board
printBoard();
System.out.println("\n---------------------------\n");
  }
  //printBoard method returns the board 
  public void printBoard() {
    for (char[] array: board) {
      for (char value: array) {
        System.out.print("  "+value);
      }
      System.out.println();
      }  
    }
  }
