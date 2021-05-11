import java.awt.Point;

class Rectangle {
    static final int WIDTH = 50;
    static final int HEIGHT = 50;

    Point upperLeft = new Point();
    Point lowerRight = new Point();


    Rectangle(Point uL) {
        upperLeft = uL.getLocation();
        uL.translate(WIDTH, HEIGHT);
        lowerRight = uL.getLocation();
    }

    Rectangle(Point uL, Point lR) {
       upperLeft = uL;
       lowerRight = lR;
    }

    void translate(int x, int y) {
      upperLeft.translate(x, y);
      lowerRight.translate(x, y);
    }

    @Override
    public String toString() { return "UL : "+upperLeft+", LR : "+lowerRight; }
}

class Block1 {
    Rectangle[] rectangles = new Rectangle[4];

    Block1(Point p) {
        rectangles[0] = new Rectangle(p.getLocation());
        p.translate(Rectangle.WIDTH, 0);
        rectangles[1] = new Rectangle(p.getLocation());
        p.translate(-Rectangle.WIDTH, Rectangle.HEIGHT);
        rectangles[2] = new Rectangle(p.getLocation());
        p.translate(Rectangle.WIDTH, 0);
        rectangles[3] = new Rectangle(p.getLocation());
    }

    Block1(int x, int y) {
        Point p = new Point(x, y);

        rectangles[0] = new Rectangle(p.getLocation());
        p.translate(Rectangle.WIDTH, 0);
        rectangles[1] = new Rectangle(p.getLocation());
        p.translate(-Rectangle.WIDTH, Rectangle.HEIGHT);
        rectangles[2] = new Rectangle(p.getLocation());
        p.translate(Rectangle.WIDTH, 0);
        rectangles[3] = new Rectangle(p.getLocation());
    }

    void translate(int x, int y) {
        for (int i = 0; i < 4; i++) {
            rectangles[i].translate(x, y);
        }
    }

    @Override
    public String toString() {
        return rectangles[0]+"\n"+rectangles[1]+"\n"+rectangles[2]+"\n"+rectangles[3];
    }
}

class Block2 {
    Rectangle[] rectangles = new Rectangle[4];

    Block2(Point p) {
        rectangles[0] = new Rectangle(p.getLocation());
        p.translate(0, Rectangle.HEIGHT);
        rectangles[1] = new Rectangle(p.getLocation());
        p.translate(0, Rectangle.HEIGHT);
        rectangles[2] = new Rectangle(p.getLocation());
        p.translate(0, Rectangle.HEIGHT);
        rectangles[3] = new Rectangle(p.getLocation());
    }

    Block2(int x, int y) {
        Point p = new Point(x, y);

        rectangles[0] = new Rectangle(p.getLocation());
        p.translate(0, Rectangle.HEIGHT);
        rectangles[1] = new Rectangle(p.getLocation());
        p.translate(0, Rectangle.HEIGHT);
        rectangles[2] = new Rectangle(p.getLocation());
        p.translate(0, Rectangle.HEIGHT);
        rectangles[3] = new Rectangle(p.getLocation());
    }

    void translate(int x, int y) {
        for (int i = 0; i < 4; i++) {
            rectangles[i].translate(x, y);
        }
    }


    @Override
    public String toString() {
        return "" + rectangles[0] + rectangles[1] + rectangles[2] + rectangles[3];
    }
}


public class Main {
    public static void main(String[] args) {
    Block1 b = new Block1(10, 10);
    Rectangle r = new Rectangle(new Point(10, 10));
    Rectangle r2 = new Rectangle(new Point(20, 20), new Point(70, 70));

    System.out.println("r");
    System.out.println(r);
    System.out.println("r2");
    System.out.println(r2);

    System.out.println("b");
    System.out.println(b);
    b.translate(10, -10);
    System.out.println("b");
    System.out.println(b);


    }
}
