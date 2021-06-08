public class Rectangle extends Shape{
    Point p1;
    Point p2;

    Rectangle(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    Rectangle(int x1, int y1, int x2, int y2) {
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
    }
    @Override
    public double getArea() {
        return Math.abs((double)(p1.getX()-p2.getX())*(p1.getY()-p2.getY()));
    }
    @Override
    public double getPerimeter() {
        return 2*Math.abs((double)(p1.getX()-p2.getX()))+2*Math.abs((double)(p1.getY()-p2.getY()));
    }
    @Override
    public String toString() {
        return "Rectangle:"+"\nP1: "+p1+"\nP2: "+p2;
    }
}
