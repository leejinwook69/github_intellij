package src;

import java.util.Scanner;

class ChangeStr {

    Scanner sc = new Scanner(System.in);
    String str = "Let's meet in my office at 10";
    int n;
    int k;
    //현재 문자열 출력
    void print() {
        System.out.printf("%s",str);
    }
    //입력 받고 n에 해당 인덱스값 할당, k에 글자수 할당
    void Input() {
        String in = sc.nextLine();
        n = str.indexOf(in);
        k = in.length();
    }
    //n에 할당된 인덱스값부터 입력받은 문자열로 변경
    void Change() {
        String in = sc.nextLine();
        String a = str.substring(0, n);
        String b = str.substring(n+k);
        System.out.println("새로운 문장 : "+a+in+b);
    }

}

public class MP03 {
    public static void main(String[] args) {

        ChangeStr try1 = new ChangeStr();

        System.out.println("다음 문장에서 문자열을 바꾸는 프로그램입니다.");
        System.out.print("원본 문장 : ");
        try1.print();
        System.out.println("\n문장에서 바꾸고 싶은 문자열을 입력하세요 : ");
        try1.Input();
        System.out.println("새로운 문자열을 입력하세요 : ");
        try1.Change();
    }
}
