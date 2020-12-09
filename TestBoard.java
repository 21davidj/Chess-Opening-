public class TestBoard {
    public static void boardTest() {
        System.out.println("This is a test of the basic board");
        Board b = new Board();

    }
    public static void danishTest() {
        System.out.println("Danish Testing...");
        Game b = new Game();
        b.danish();
    }

    public static void morraTest() {
        System.out.println("Morra Testing...");
        Game testBoard = new Game();
        Morra.board();
    }
    
    public static void evansTest() {
        System.out.println("Evan's Testing...");
        Board testBoard = new Board();
        Evans.board();
    }
}