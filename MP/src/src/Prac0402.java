package src;

import java.util.Scanner;

public class Prac0402 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("두 개의 정수 입력 : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(b % a == 0){
            System.out.printf("%d 는 %d 의 약수입니다.\n", a, b);
        } else {
            System.out.printf("%d 는 %d 의 약수가 아닙니다.\n", a ,b);
        }

    }
}
