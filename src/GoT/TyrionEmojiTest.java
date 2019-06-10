package GoT;

import java.util.List;

public class TyrionEmojiTest {

    public static void main(String[] args) {
        Tyrion tyrion = new Tyrion();
        Emoji emoji = new Emoji();

        int numberOfHappyEmojie = 0;
        int numberOfSadEmojie = 0;

        List<String> sentences = tyrion.getAllSentence();
        for (String sentence : sentences) {
            if (emoji.containsEmojie(sentence)) {
                if (emoji.containsHappyEmojie(sentence)) {
                    numberOfHappyEmojie += emoji.numberOfHappyInSentence(sentence);
                }
                if (emoji.containsSadEmojie(sentence)) {
                    numberOfSadEmojie += emoji.numberOfSadInSentence(sentence);
                }
            }
        }

        if (numberOfHappyEmojie > numberOfSadEmojie) {
            System.out.println("It's true, Tyrion is happy");
        } else if (numberOfHappyEmojie == numberOfSadEmojie) {
            System.out.println("Not true, Tyrion is neutral");
        } else {
            System.out.println("Completely wrong, Tyrion is sad");
        }
    }
}
