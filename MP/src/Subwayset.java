class Subway {
    int line;
     void run()
    {
        System.out.println(line + " line runs");
    }
    void Setline(int l) { line = l; }
}
public class Subwayset {
        public static void main(String[] args) {
            Subway mySub = new Subway();
            mySub.Setline(3);
            mySub.run();
        }
    }


