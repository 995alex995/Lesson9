package GoT;

public class DenerisAndJohnTest {

    public static void main(String[] args){
        Deneris deneris = new Deneris();
        John john = new John();
        Emoji emoji = new Emoji();
        int johnLoveEmojies = 0;
        int denerisLoveEmojies = 0;
        for (String sentence : john.getAllSentence()){
            if (emoji.containsLoveEmojies(sentence)){
                johnLoveEmojies+= emoji.numberOfLoveEmojies(sentence);
            }
        }

        for (String sentence: deneris.getAllSentence()){
            if (emoji.containsLoveEmojies(sentence)){
                denerisLoveEmojies += emoji.numberOfLoveEmojies(sentence);
            }
        }

        if (johnLoveEmojies > denerisLoveEmojies){
            System.out.println("John loves more Deneris then Deneris loves him"); //no matter what this project says, this is correct answer
        } else if (johnLoveEmojies == denerisLoveEmojies){
            System.out.println("<3 Their love is equal! <3");  
        } else {
            System.out.println("Deneris loves more John then John loves her");
        }


    }
}
