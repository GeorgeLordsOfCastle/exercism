import java.util.*;

class ProteinTranslator {
    List<String> translate(String rnaSequence) {
        List<String> proteinList = new ArrayList<>();
        String possibleProteinSequence = getUntilFirstStopRnaSequence(rnaSequence);
        while (possibleProteinSequence.length()>2) {
            String currentPossibleProtein = possibleProteinSequence.substring(0, 3);
            possibleProteinSequence = possibleProteinSequence.replaceFirst(currentPossibleProtein, "");
            if(isAProtein(currentPossibleProtein)) {
                String progeinName = getProteinName(currentPossibleProtein);
                if(!proteinList.contains(progeinName)) {
                    proteinList.add(progeinName);
                }
            }
        }
        return proteinList;
    }

    private final static List<String> stopList = Arrays.asList("UAA", "UAG", "UGA");

    private static String getUntilFirstStopRnaSequence(String rnaSequence) {
        String untilFirstStopRnaSequence = new String(rnaSequence.getBytes());
        for(String stop : stopList) {
            if(untilFirstStopRnaSequence.equals(stop)) {
                return "";
            }
            untilFirstStopRnaSequence = untilFirstStopRnaSequence.split(stop)[0];
        }
        return untilFirstStopRnaSequence;
    }

    private static String getProteinName(String currentPossibleProtein) {
        return proteinNameMap.get(currentPossibleProtein);
    }

    private static boolean isAProtein(String currentPossibleProtein) {
        return proteinNameMap.keySet().contains(currentPossibleProtein);
    }

    private final static Map<String, String> proteinNameMap = new HashMap<>() {{
        put("AUG", "Methionine");
        put("UUU", "Phenylalanine");
        put("UUC", "Phenylalanine");
        put("UUA", "Leucine");
        put("UUG", "Leucine");
        put("UCU", "Serine");
        put("UCC", "Serine");
        put("UCA", "Serine");
        put("UCG", "Serine");
        put("UAU", "Tyrosine");
        put("UAC", "Tyrosine");
        put("UGU", "Cysteine");
        put("UGC", "Cysteine");
        put("UGG", "Tryptophan");
    }};
}