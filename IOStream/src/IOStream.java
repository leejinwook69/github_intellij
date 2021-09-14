import java.io.*;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class IOStream {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<Integer>(3);
        al.add(123);
        al.add(232);
        al.add(0);
        al.add(12123);
        System.out.println(al.get(0));
        System.out.println(al.get(1));
        System.out.println(al.get(2));
        System.out.println(al.get(3));
        StringBuilder sb = new StringBuilder();
        Formatter fm = new Formatter(sb);
        fm.format("Hello %s", "World!");
        try {
            BufferedWriter f = new BufferedWriter(new FileWriter("test.txt"));
            f.write("123");
            f.write('\n');
            f.write(sb.toString());
            f.close();
        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}
