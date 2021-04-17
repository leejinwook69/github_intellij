package src;

import java.util.Scanner;

public class Prac0403 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p = "prime";
        String s = "standard";
        String e = "economy";

        System.out.println("원하는 좌석 종류를 입력하세요 : ");
        String in = sc.next();

        if(in.compareTo(p) == 0) {
            System.out.println("프라임존 표는 11000원");
        } else if(in.compareTo(s) == 0) {
            System.out.println("스탠다드존 표는 10000원");
        } else if(in.compareTo(e) == 0) {
            System.out.println("이코노미존 표는 9000원");
        } else {
            System.out.println("좌석 종류를 잘못 입력했습니다.");
        }

    }
}
