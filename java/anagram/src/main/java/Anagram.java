import java.util.List;
import java.util.stream.Collectors;

class Anagram {
    private final String word;

    public Anagram(String word) {
        this.word = word;
    }

    public List<String> match(List<String> possibleAnagramList) {
        return possibleAnagramList.stream()
                .filter(this::isAnagram)
                .collect(Collectors.toList());
    }

    private boolean isAnagram(String possibleAnagram) {
        if(possibleAnagram.length() != word.length()) {
            return false;
        }
        String lowerCaseWord = word.toLowerCase();
        String lowerCasePossibleAnagram = possibleAnagram.toLowerCase();
        if(lowerCasePossibleAnagram.equals(lowerCaseWord)) {
            return false;
        }
        for (char currentChar : lowerCasePossibleAnagram.toCharArray()) {
            if(isContained(currentChar, lowerCaseWord)) {
                lowerCaseWord = lowerCaseWord.replaceFirst(String.valueOf(currentChar), "");
            } else {
                return false;
            }
        }
        return true;
    }

    private boolean isContained(char currentChar, String lowerCaseWord) {
        return lowerCaseWord.contains(String.valueOf(currentChar));
    }
}