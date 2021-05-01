import java.util.Scanner;

class Input {

    Scanner sc = new Scanner(System.in);

    void input(int n) {
        System.out.println("input : " + n);
        if (n >= 1 && n <= 100) {
            System.out.println("1~100 사이 정수가 입력되었습니다.");
        }

    }

    boolean compare(int n, int a, int b) {
        if (a >= b ? n >= b && n <= a : n >= a && n <= b) {
            return true;
        } else {
            return false;
        }
    }
}

public class Prac060401 {

    public static void main(String[] args) {
    System.out.println("숫자를 입력하세요");
    Input a = new Input();
    a.input(50);
    a.input(150);
    System.out.println(a.compare( 3, 5, 1));
    }
}
