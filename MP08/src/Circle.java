public class Circle extends Shape{
    Point center;
    int radius;

    Circle(Point p, int r) {
        this.center = p;
        this.radius = r;
    }
    Circle(int x1, int y1, int r) {
        this.center = new Point(x1, y1);
        this.radius = r;
    }
    @Override
    public double getArea() {
        return Math.abs((double)(Math.PI*radius*radius));
    }
    @Override
    public double getPerimeter() {
        return (double)Math.PI*2*radius;
    }
    @Override
    public String toString() {
        return "Circle:"+"\ncenter: "+center+"\nradius: "+radius;
    }
}
