public class TestBoard {
    public static void testBoard() {
        System.out.println("This is a test of the basic board");
        Board testBoard = new Board();

    }
    public static void danishTest() {
        System.out.println("Danish Testing...");
        Board testBoard = new Board();
        Danish.board();
    }

    public static void morraTest() {
        System.out.println("Morra Testing...");
        Board testBoard = new Board();
        Morra.board();
    }
    
    public static void evansTest() {
        System.out.println("Evan's Testing...");
        Board testBoard = new Board();
        Evans.board();
    }
}