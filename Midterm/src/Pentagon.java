public class Pentagon {
    private Point[] parr;
    private Triangle[] tarr;

    private int i = 0;
    Pentagon() {
         parr = new Point[5];
         tarr = new Triangle[3];
    }
    public void addPoint(Point a) {
        if(i<5) {
            parr[i] = a;
            i++;

        }else {
            System.out.println("error : input pointer more then 5");
            System.exit(0);
        }
    }
    public void tessellate() {
        if(i == 5) {
            tarr[0] = new Triangle(parr[0], parr[1], parr[2]);
            tarr[1] = new Triangle(parr[0], parr[2], parr[3]);
            tarr[2] = new Triangle(parr[0], parr[3], parr[4]);
            i = -1;
        } else {
            System.out.println("error : input pointer less then 5");
            System.exit(0);
        }
    }

    public double getArea() {
        if(i == -1) {
            System.out.printf("Area of Triangle1 : %.2f\n", tarr[0].area());
            System.out.printf("Area of Triangle2 : %.2f\n", tarr[1].area());
            System.out.printf("Area of Triangle3 : %.2f\n", tarr[2].area());
            return tarr[0].area()+tarr[1].area()+tarr[2].area();
        } else{
            System.out.println("error : triangle not tessellated\n");
            return 0;
        }
    }
}
