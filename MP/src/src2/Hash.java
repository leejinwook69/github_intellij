package src2;

import java.util.Scanner;

public class Hash {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //한 개의 문자만 입력 받게함

        System.out.println("한 번에 하나씩 다섯 개의 문자 입력 : \n");

        char ch0 = sc.next().charAt(0);
        char ch1 = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);
        char ch3 = sc.next().charAt(0);
        char ch4 = sc.next().charAt(0);

        //입력받은 문자들로 배열 생성

        char[] arr = {ch0, ch1, ch2, ch3, ch4};

        //Hash 값 계산

        double hash = arr[0] * Math.pow(31, 4)
                      + arr[1] * Math.pow(31, 3)
                      + arr[2] * Math.pow(31, 2)
                      + arr[3] * Math.pow(31, 1)
                      + arr[4] * Math.pow(31, 0);

        // 결과 출력

        System.out.printf("문자열 %c%c%c%c%c 의 해시 값은 %.2f 입니다.", ch0, ch1, ch2, ch3, ch4, hash);

    }
}
