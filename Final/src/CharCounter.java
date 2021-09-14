import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class CharCounter {
    protected String str;
    protected Map<String, Integer> Map;

    CharCounter(String StInput) {
        str = StInput;
        Map = new HashMap<>();
    }
    abstract void GetCharCount();
    void Print() {
        Iterator<String> iter = Map.keySet().iterator();

        while(iter.hasNext()) {
            String key = iter.next();
            int val = Map.get(key);

            System.out.printf("char : %s, num = %d", key, val);

        }
    }
}
