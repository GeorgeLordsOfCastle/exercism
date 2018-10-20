import java.util.ArrayList;
import java.util.List;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        List<Character> distinctCharacterList = new ArrayList<>();
        for (char c : phrase.toLowerCase().toCharArray()) {
            if(distinctCharacterList.contains(c)) {
                return false;
            }
            distinctCharacterList.add(c);
        }
        return true;
    }

}
