package src;

import java.util.Scanner;

public class Prac0404 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = "";
        while (in.compareTo("quit") != 0) {
            System.out.println("문자열을 입력하세요. 그만하려면 quit을 입력하세요. : \n");
            in = sc.next();
            System.out.printf("%s\n", in);
        }
    }


}
