class Proverb {
    private final String[] words;

    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        StringBuilder stringBuilder = new StringBuilder();
        if (words.length == 0) {
            return stringBuilder.toString();
        }
        for(int i=0; i<words.length-1; i++) {
            stringBuilder
                    .append("For want of a ")
                    .append(words[i])
                    .append(" the ")
                    .append(words[i+1])
                    .append(" was lost.\n");
        }
        return stringBuilder
                .append("And all for the want of a ")
                .append(words[0])
                .append(".")
                .toString();
    }
}
