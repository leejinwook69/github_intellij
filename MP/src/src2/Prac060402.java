package src2;

public class Prac060402 {
    boolean torf(int n) {
        return n<100;
        
    }

    public static void main(String[] args) {
        Prac060402 a = new Prac060402();
        System.out.println(a.torf(50));
        System.out.println(a.torf(130));
    }
}
