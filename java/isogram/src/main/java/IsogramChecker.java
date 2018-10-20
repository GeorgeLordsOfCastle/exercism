import java.util.ArrayList;
import java.util.List;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        if("".equals(phrase)) {
            return true;
        }
        List<Character> distinctCharacterList = new ArrayList<>();
        for (char c : phrase.toCharArray()) {
            if(distinctCharacterList.contains(c)) {
                return false;
            }
            distinctCharacterList.add(c);
        }
        return true;
    }

}
