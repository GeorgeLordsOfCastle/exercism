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
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(" ".repeat(Math.max(0, currentRowPrefixBlankNumber)));
            int internBlankSpaceNumber = charNumberPerRow - 2*currentRowPrefixBlankNumber - 2;
            char charToAdd = (char) (aIntValue + blankSpaceNumber - currentRowPrefixBlankNumber);
            stringBuilder.append(charToAdd);
            if(internBlankSpaceNumber>0) {
                stringBuilder.append(" ".repeat(Math.max(0, internBlankSpaceNumber)));
                stringBuilder.append(charToAdd);
            }
            stringBuilder.append(" ".repeat(Math.max(0, currentRowPrefixBlankNumber)));
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

}
