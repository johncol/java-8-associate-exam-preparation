package tests;

public class InfiniteLoop {

    public static void main(String[] args) {
        for (int x = 0; x < 1; ) {
            x = x++;
            System.out.println("Hello!");
        }
    }

}
