public class AlphabetCounter extends CharCounter{
    AlphabetCounter(String s) {
        super(s);
    }

    @Override
    void GetCharCount() {
        char[] s = str.toCharArray();

            for (int i = 0; i < s.length; i++) {
                if(Character.isAlphabetic(s[i])) {
                    if (Map.containsKey(s[i])) {
                        Map.put(Character.toString(s[i]), Map.get(s[i]) + 1);
                    } else {
                        Map.put(Character.toString(s[i]), 1);
                    }
                }
            }
        }
    }

