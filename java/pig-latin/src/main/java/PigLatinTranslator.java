import java.util.Arrays;
import java.util.List;

class PigLatinTranslator {
    private final static List<Character> vowelList = Arrays.asList('a', 'e', 'i', 'o', 'u');
    private final static List<Character> vowelIfFollowedByConsonantList = Arrays.asList('x', 'y');
    private final static List<Character> consonantList = Arrays.asList('b', 'c', 'd', 'f', 'g', 'h',
            'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'z');

    String translate(String word) {
        if(isAVowelSoundWord(word)) {
            return addAyAtTheEnd(word);
        } else {
            return addAyAtTheEnd(getWordWithConsonantSoundPartMovedAtTheEnd(word));
        }
    }

    private static boolean isAVowelSoundWord(String word) {
        return vowelList.contains(word.charAt(0))
                || (vowelIfFollowedByConsonantList.contains(word.charAt(0))
                        && consonantList.contains(word.charAt(1)));
    }

    private static String addAyAtTheEnd(String word) {
        return word + "ay";
    }

    private static String getWordWithConsonantSoundPartMovedAtTheEnd(String word) {
        StringBuilder wordWithConsonantSoundPartMovedAtTheEnd = new StringBuilder();
        String consonantSoundPart = getConsonantSoundPart(word);
        String wordWithoutConsonantSoundPart = word.replace(consonantSoundPart, "");
        if(isQuCase(wordWithoutConsonantSoundPart, consonantSoundPart)) {
            return wordWithConsonantSoundPartMovedAtTheEnd.append(wordWithoutConsonantSoundPart.replace("u", ""))
                    .append(consonantSoundPart)
                    .append("u")
                    .toString();
        }
        return wordWithConsonantSoundPartMovedAtTheEnd.append(wordWithoutConsonantSoundPart)
                .append(consonantSoundPart)
                .toString();
    }

    private static boolean isQuCase(String wordWithoutConsonantSoundPart, String consonantSoundPart) {
        if(wordWithoutConsonantSoundPart.length() == 0 || consonantSoundPart.length() == 0) {
            return false;
        }
        return consonantSoundPart.charAt(consonantSoundPart.length() -1) == 'q' && wordWithoutConsonantSoundPart.charAt(0) == 'u';
    }

    private static String getConsonantSoundPart(String word) {
        // pre-condition: word starts with a consonant
        // two chars cases: ch, gh, ph, th, sh, wh
        StringBuilder consonantSoundPart = new StringBuilder();
        for(int i=0; i< word.length(); i++) {
            char charI = word.charAt(i);
            if (consonantList.contains(charI)
                    || (vowelIfFollowedByConsonantList.contains(charI)
                            && vowelList.contains(word.charAt(i+1)))) {
                consonantSoundPart.append(charI);
            } else {
                break;
            }
        }
        return consonantSoundPart.toString();
    }
}