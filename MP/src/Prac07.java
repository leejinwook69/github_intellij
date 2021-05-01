class Iam {
    int i = 10;
    static int Iam() {return this.i;}
}

public class Prac07 {

    public static void main(String[] args) {
        Iam a = new Iam();
        System.out.println(a.Iam());
        a.i = 500;
        System.out.println(a.Iam());


    }
}
