package GoT;

import java.util.ArrayList;
import java.util.List;

public class CharacterDispositionTest {

    public static void main(String[] args) {
        Deneris deneris = new Deneris();
        John john = new John();
        Cersei cersei = new Cersei();
        Tyrion tyrion = new Tyrion();

        List<Character> characters = new ArrayList<>();
        characters.add(deneris);
        characters.add(cersei);
        characters.add(john);
        characters.add(tyrion);

        int indexForCharWithMostHappy = 0;
        int indexForCharWithMostSad = 0;

        int numberOfMostHappy = 0;
        int numberOfMostSad = 0;

        for (int i = 0; i < characters.size(); i++) {
            int charHappyEmojies = characters.get(i).numberOfHappyEmojies();
            int charSadEmojies = characters.get(i).numberOfSadEmojiesInSentence();
            if (numberOfMostHappy < charHappyEmojies) {
                indexForCharWithMostHappy = i;
                numberOfMostHappy = charHappyEmojies;
            }
            if (numberOfMostSad < charSadEmojies) {
                indexForCharWithMostSad = i;
                numberOfMostSad = charSadEmojies;
            }
        }

        Character happiest = characters.get(indexForCharWithMostHappy);
        Character saddest = characters.get(indexForCharWithMostSad);

        System.out.println("Most positive disposition among character's is " + happiest.getName());
        System.out.println("Most negative disposition among character's is " + saddest.getName());

    }

}
