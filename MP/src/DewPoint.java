import java.util.Scanner;

public class DewPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("습도 입력 : ");
        double h = sc.nextDouble();
        System.out.println("온도 입력 : ");
        double t = sc.nextDouble();

        //이슬점 구하는 공식 적용하여 이슬점 구함
        double dp = 243.12 * (Math.log(h / 100) + ( 17.62 * t / (243.12 + t) )) /
                (17.62 - (Math.log(h / 100) + ( 17.62 * t / (243.12 + t) ) ));

        //값에 0.05를 뺀 뒤 반올림을 시키면 첫째자리 이후를 버린 값이 나온다.
        dp -= 0.05;

        //결과 출력.
        System.out.printf("습도 : %f 와 온도 : %f 인 경우 이슬점 : %.1f", h, t, dp);
    }
}
