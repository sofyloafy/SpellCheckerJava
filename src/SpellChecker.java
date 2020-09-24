import java.util.ArrayList;
import java.util.Arrays;

public class SpellChecker {

    public String processWord(String words) {
        String[] wordBank = new String[] {"Hello","World"};
        if (Arrays.asList(wordBank).contains(words)) {
            return words;
        } else {
            return "~" + words + "~";
        }
    }
}
