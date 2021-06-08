public class Main {
    public static void main(String[] args) {
        int[] x = {10, 20, 50, 45, 30};
        int[] y = {65, 10, 30, 70, 100};

        Pentagon p = new Pentagon();
        for(int i = 0; i < 5; i++) {
            p.addPoint(new Point(x[i], y[i]));
        }

        p.tessellate();
        System.out.printf("%.2f", p.getArea());
    }
}
