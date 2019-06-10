package GoT;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class SentenceCounter {

    public static void main(String[] args) {
        String[] filePaths = new String[4];

        String gotCharactersFilePath = "resource/got_meta_data.txt";
        SentenceCounter sentenceCounter = new SentenceCounter();

        filePaths[0] = "resource/message_logs/messages82387561293.txt";
        filePaths[1] = "resource/message_logs/messages2094721612573.txt";
        filePaths[2] = "resource/message_logs/messages9287658288370.txt";
        filePaths[3] = "resource/message_logs/messages22274950573636.txt";

//        for (int i = 0; i < filePaths.length; i++) {
//            int totalNumberOfMessageByCharacter = sentenceCounter.countNumberOfSentence(filePaths[i]);
//            String characterName = sentenceCounter.getCharacterName(filePaths[0]);
//            System.out.println(characterName + " said total of " + totalNumberOfMessageByCharacter + " sentences");
//        }

    }

    private int countNumberOfSentence(String filePath) {
        int totalNumberOfSentence = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line = reader.readLine();
            while (line != null) {
                boolean isSentence = line.contains("\"");
                if (isSentence) {
                    totalNumberOfSentence += 1;
                }

                line = reader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return totalNumberOfSentence;
    }
}
