interface Ishape {
    public double getArea();
    public double getPerimeter();
}


class Point{}


class Circle implements Ishape{
    Point center;
    int radius;
    public Circle(int r) {
        center = new Point();
        radius = r;
    }
    public Circle(int x, int y, int r) {
        center = new Point(x, y);
        radius = r;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return Math.PI * radius * 2;
    }
}


public class Main {
}
