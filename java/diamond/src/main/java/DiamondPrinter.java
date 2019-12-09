import java.util.ArrayList;
import java.util.List;

class DiamondPrinter {
    private final static int aIntValue = "A".toCharArray()[0];

    List<String> printToList(char a) {
        List<String> diamond = new ArrayList<>();
        int blankSpaceNumber = a - aIntValue;
        int charNumberPerRow = 2*blankSpaceNumber+1;

        int currentRowPrefixBlankNumber = blankSpaceNumber;
        boolean isDiamondBuildIncreasing = true;
        for(int i=0; i<charNumberPerRow; i++) {
            int internBlankSpaceNumber = charNumberPerRow - 2*currentRowPrefixBlankNumber - 2;
            char charToAdd = (char) (aIntValue + blankSpaceNumber - currentRowPrefixBlankNumber);

            StringBuilder stringBuilder = new StringBuilder()
                    .append(addBlankSpaces(currentRowPrefixBlankNumber))
                    .append(charToAdd);
            if(internBlankSpaceNumber>0) {
                stringBuilder
                        .append(addBlankSpaces(internBlankSpaceNumber))
                        .append(charToAdd);
            }
            stringBuilder
                    .append(addBlankSpaces(currentRowPrefixBlankNumber));
            diamond.add(stringBuilder.toString());

            if(currentRowPrefixBlankNumber==0) {
                isDiamondBuildIncreasing = false;
            }

            if(isDiamondBuildIncreasing) {
                currentRowPrefixBlankNumber--;
            } else {
                currentRowPrefixBlankNumber++;
            }
        }
        return diamond;
    }

    private String addBlankSpaces(int currentRowPrefixBlankNumber) {
        return " ".repeat(Math.max(0, currentRowPrefixBlankNumber));
    }

}
