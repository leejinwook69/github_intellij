package src2;

class Dice {
    int roll() {
        return ((int)Math.floor((Math.random() * 6)) + 1);
    }
}

class DiceProbability {
    DiceProbability(int n) {
        this.n = n;
        if (n < 0) {
            System.out.println("유효한 값을 입력하세요");
            return;
        }
            for(; n > 0; n--) {
                anum[n-1] = j.roll();
                k=1;
            }

        }
    int n;
    int k;
    int[] anum = new int[1000000000];
    int[] btimes = new int[6];
    double[] cprob = new double[6];
    Dice j = new Dice();

    void calcProbability() {
        int n = this.n;

        if(k == 1) {
            for(; n-1 >= 0; n--) {
                switch (anum[n]) {
                    case 1 -> {
                        cprob[0] += 1 / (double) this.n;
                        btimes[0] += 1;
                    }
                    case 2 -> {
                        cprob[1] += 1 / (double) this.n;
                        btimes[1] += 1;
                    }
                    case 3 -> {
                        cprob[2] += 1 / (double) this.n;
                        btimes[2] += 1;
                    }
                    case 4 -> {
                        cprob[3] += 1 / (double) this.n;
                        btimes[3] += 1;
                    }
                    case 5 -> {
                        cprob[4] += 1 / (double) this.n;
                        btimes[4] += 1;
                    }
                    default -> {
                        cprob[5] += 1 / (double) this.n;
                        btimes[5] += 1;
                    }
                }

            }
        }
        k=2;
    }
    void printProbability() {

        if(k == 2) {
            System.out.printf("총 횟수 : %d\n", n);
            for (int a = 0; a < 6; a ++) {
                System.out.printf("주사위 %d: %d 비율 : %f\n", a+1, btimes[a], cprob[a]);
            }
        }

    }
    void init() {
        for(;this.n >=0; this.n--) {
            this.anum[n] = 0;
        }
        for(this.k = 5; k >= 0; k--) {
            this.btimes[k] = 0;
            this.cprob[k] = 0;
        }
    }
}

public class DiceProb {
    public static void main(String[] args) {
        DiceProbability test = new DiceProbability(2);
        test.calcProbability();
        test.printProbability();

        DiceProbability t = new DiceProbability(100);
        t.calcProbability();
        t.printProbability();
    }
}
