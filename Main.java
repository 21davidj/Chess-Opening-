import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String name;
    Scanner consoleInput = new Scanner(System.in);
       System.out.println("Please enter your name: ");
        name = consoleInput.next();
       System.out.println("Hello " + name + "!");
        consoleInput.nextLine();
    
    System.out.println("Today, you will be learning some basic chess openings for White\n");
 
    Opening.opening();

  }
}

