import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class StringBuilderFromFile {

    static String createStringFromFile(String Filename) {
        try {
            FileInputStream fs = new FileInputStream("sentences.txt");
            Scanner sc = new Scanner(fs);
            String FileString = sc.nextLine();
            fs.close();
            return FileString;
        } catch (IOException e) {
            e.printStackTrace();
            return "IOException Error";
        }
    }
}
