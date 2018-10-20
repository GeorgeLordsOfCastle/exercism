import java.util.ArrayList;
import java.util.List;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        List<Character> distinctCharacterList = new ArrayList<>();
        char[] chars = phrase.replaceAll("[-|\\s]", "").toLowerCase().toCharArray();
        for (char c : chars) {
            if(distinctCharacterList.contains(c)) {
                return false;
            }
            distinctCharacterList.add(c);
        }
        return true;
    }

}
