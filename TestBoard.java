public class TestBoard {
    //Test method for each opening
    //Creates a board object 
    public static void boardTest() {
        System.out.println("This is a test of the basic board");
        Board b = new Board();
    }
    
    //Creates a game object and calls the danish method from Game.java
    public static void danishTest() {
        System.out.println("Danish Testing...");
        Game b = new Game();
        b.danish();
    }

    //Same idea, creates a game object and calls morra method from Game.java
    //Each method can be tested in Main.java with the line ""
    public static void morraTest() {
        System.out.println("Morra Testing...");
        Game b = new Game();
        b.morra();
    }
    
    public static void evansTest() {
        System.out.println("Evan's Testing...");
        Game b = new Game();
        b.evans();
    }
}