package GoT;

import java.util.ArrayList;
import java.util.List;

public class Emoji {
    private List<String> happyEmojies;
    private List<String> sadEmojies;
    private List<String> allEmojies;
    private List<String> loveEmojies;

    public Emoji(){
        createHappyEmojies();
        createSadEmojies();
        createLoveEmojies();
        allEmojies = new ArrayList<>();
        allEmojies.addAll(happyEmojies);
        allEmojies.addAll(sadEmojies);
        allEmojies.addAll(loveEmojies);
    }

    private void createHappyEmojies(){
        happyEmojies = new ArrayList<>();
        happyEmojies.add("\uD83D\uDE04");
        happyEmojies.add("\uD83D\uDE42");
        happyEmojies.add("\uD83D\uDE0A");
        happyEmojies.add("\uD83D\uDE0D");
    }

    private void createSadEmojies(){
        sadEmojies = new ArrayList<>();
        sadEmojies.add("\uD83D\uDE22");
        sadEmojies.add("\uD83D\uDE2D");
        sadEmojies.add("\uD83D\uDE1E");
        sadEmojies.add("\uD83D\uDC7F");
    }

    private void createLoveEmojies(){
        loveEmojies = new ArrayList<>();
        loveEmojies.add("\uD83D\uDE0D");
        loveEmojies.add("\uD83D\uDE18");
    }

    public boolean containsEmojie(String sentence){

        for (String emojie : allEmojies){
            if (sentence.contains(emojie)){
                return true;
            }
        }
        return false;
    }

    public boolean containsHappyEmojie(String string){
        for (String emojie : happyEmojies){
            if (string.contains(emojie)){
                return true;
            }
        }
        return false;
    }

    public boolean containsSadEmojie(String string){
        for (String emojie : sadEmojies){
            if (string.contains(emojie)){
                return true;
            }
        }
        return false;
    }

    public int numberOfSadInSentence(String sentence){
        int counter =0;
        for (String emojie : sadEmojies){
            if (sentence.contains(emojie)){
                counter+=1;
            }
        }
        return counter;
    }
    public int numberOfHappyInSentence(String sentence){
        int counter =0;
        for (String emojie : happyEmojies){
            if (sentence.contains(emojie)){
                counter+=1;
            }
        }
        return counter;
    }

    public boolean containsLoveEmojies(String sentence){

        for (String emojie : loveEmojies){
            if (sentence.contains(emojie)){
                return true;
            }
        }
        return false;
    }

    public int numberOfLoveEmojies(String sentence){
        int counter =0;
        for (String emojie : loveEmojies){
            if (sentence.contains(emojie)){
                counter+=1;
            }
        }
        return counter;
    }
}
