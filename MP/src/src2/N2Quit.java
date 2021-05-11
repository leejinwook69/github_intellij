package src2;

import java.util.Scanner;

public class N2Quit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        while(ch != 'n') {
            System.out.println(ch);
            ch = sc.next().charAt(0);
        }
    }
}
