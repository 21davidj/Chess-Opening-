import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //Game object initialized and player name asked
    Game game = new Game();
    game.name();
    
    //Greeting and opening method
    System.out.println("Today, you will be learning some basic chess openings for white\n");
    game.opening();
  }
}
