import java.awt.*;

class Deck {

    int n = 0;
    String[] deck = new String[3];
    Deck() {
        deck[0] = "diamond " + (int)(Math.floor(Math.random() * 9) + 2);
        deck[1] = "diamond " + (int)(Math.floor(Math.random() * 9) + 2);
        deck[2] = "diamond " + (int)(Math.floor(Math.random() * 9) + 2);
    }

    void num() {
        System.out.printf("%d 장 남았습니다.\n", 3-n);
    }

    void deal() {
        if(n <= 2) {
            System.out.printf("%s\n", deck[n]);
            n++;
        } else
            System.out.println("error");
    }
}

public class CardDeck {

    public static void main(String[] args) {
        Deck one = new Deck();
        one.num();
        one.deal();
        one.num();
        one.deal();
        one.num();
        one.deal();

    }

}


