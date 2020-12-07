public class Board {
  public static void setupBoard() {
    char[][] arrayOfArrays = new char[8][8];
    for (int i = 0; i < 8; i++) {
      arrayOfArrays[0][0] = '\u2656';
      arrayOfArrays[0][1] = '\u2658';
      arrayOfArrays[0][2] = '\u2657';
      arrayOfArrays[0][3] = '\u2655';
      arrayOfArrays[0][4] = '\u2654';
      arrayOfArrays[0][5] = '\u2657';
      arrayOfArrays[0][6] = '\u2658';
      arrayOfArrays[0][7] = '\u2656';
      arrayOfArrays[1][i] = '\u2659';
      arrayOfArrays[2][i] = ' ';
      arrayOfArrays[3][i] = ' ';
      arrayOfArrays[4][i] = ' ';
      arrayOfArrays[5][i] = ' ';
      arrayOfArrays[6][i] = '\u265F';
      arrayOfArrays[7][0] = '\u265C';
      arrayOfArrays[7][1] = '\u265E';
      arrayOfArrays[7][2] = '\u265D';
      arrayOfArrays[7][3] = '\u265B';
      arrayOfArrays[7][4] = '\u265A';
      arrayOfArrays[7][5] = '\u265D';
      arrayOfArrays[7][6] = '\u265E';
      arrayOfArrays[7][7] = '\u265C';
    }

    for (char[] array: arrayOfArrays) {
      for (char value: array) {
        System.out.print("  "+value);
      }
      System.out.println();
    }  
  }
}
