public class Final {
    public void countChars(CharCounter counter) {
        // 코드 추가할 것
    }

    public static void main(String[] args) {
        String s = StringBuilderFromFile.createStringFromFile("sentences.txt");
        System.out.println(s);
        Final f = new Final();
        System.out.println("\nCount alphabets****************");
        f.countChars(new AlphabetCounter(s));
        System.out.println("\nCount digits****************");
        f.countChars(new DigitCounter(s));
        System.out.println("\nCount white spaces****************");
        f.countChars(new WhiteSpaceCounter(s));
    }
}
