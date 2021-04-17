import java.util.Scanner;

public class Zero2Quit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        while(true) {
            if(ch == '0') {
                break;
            } else {
                System.out.println(ch);
                ch = sc.next().charAt(0);
            }
        }


    }
}
