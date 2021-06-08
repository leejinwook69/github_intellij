import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Integer> n = new ArrayList<>();
        n.add(3);
        n.add(5);
        n.add(12);
        try {
            for(int i = 0; i < 3; i++ ) {
                System.out.println(n.get(i));
            }
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("index error\n");
        }
    }
}
