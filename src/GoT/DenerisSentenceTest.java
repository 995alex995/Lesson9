package GoT;

import java.util.List;

public class DenerisSentenceTest {

    public static void main (String[] args){
        Deneris deneris = new Deneris();
        List<String> denerisSentences = deneris.getAllSentence();

        for (String sentence : denerisSentences){
            System.out.println("Deneris: " + sentence);
        }
    }

}
