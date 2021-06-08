public class Triangle {
    private Point[] arr;
    private double a, b, c, s;
    public Triangle(Point x1, Point x2, Point x3) {
        arr = new Point[3];
        arr[0] = x1;
        arr[1] = x2;
        arr[2] = x3;
        a = getDistance(x1, x2);
        b = getDistance(x2, x3);
        c = getDistance(x3, x1);
        s = 0.5*(a+b+c);

    }


    public double area() {
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    private double getDistance(Point p1, Point p2) {
        double dx = p2.getX()-p1.getX();
        double dy = p2.getY()-p1.getY();
        return Math.sqrt(dx* dx + dy*dy);
    }
}
