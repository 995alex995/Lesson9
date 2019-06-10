package GoT;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class SentenceCounterTest {

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

        for (Character character : characters){
           JOptionPane.showMessageDialog(null, character.getName() + " said total number of " + character.getAllSentence().size() + " sentences");
        }

    }
}
