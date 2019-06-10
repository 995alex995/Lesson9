package GoT;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Tyrion extends Character {

    @Override
    String getName() {
        return "Tyrion Lannister";
    }

    @Override
    String getAllegiance() {
        return "House Lanister";
    }

    @Override
    String getSentenceFilePath() {
        return "resource/message_logs/messages9287658288370.txt";
    }

    @Override
    List<String> getAllSentence() {
        List<String> sentences = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(getSentenceFilePath()));
            String line = reader.readLine();

            while (line != null) {
                sentences.add(line);
                line = reader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return sentences;
    }

    @Override
    int numberOfHappyEmojies() {
        List<String> sentences = getAllSentence();
        int counter = 0;
        Emoji emoji = new Emoji();
        for (String sentece : sentences){
            if (emoji.containsHappyEmojie(sentece)){
                counter+=emoji.numberOfHappyInSentence(sentece);
            }
        }
        return counter;
    }

    @Override
    int numberOfSadEmojiesInSentence() {
        List<String> sentences = getAllSentence();
        int counter = 0;
        Emoji emoji = new Emoji();
        for (String sentece : sentences){
            if (emoji.containsSadEmojie(sentece)){
                counter += emoji.numberOfSadInSentence(sentece);
            }
        }
        return counter;
    }

}
