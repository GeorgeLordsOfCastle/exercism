class Bob {

    public String hey(String input) {
        String trimmedInput = input.trim();
        String trimmedInputUpperCase = trimmedInput.toUpperCase();
        String trimmedInputLowerCase = trimmedInput.toLowerCase();
        if(trimmedInput.endsWith("?") && trimmedInput.equals(trimmedInputUpperCase) && !trimmedInput.equals(trimmedInputLowerCase)) {
            return "Calm down, I know what I'm doing!";
        }
        if(trimmedInput.endsWith("?")) {
            return "Sure.";
        }
        if(trimmedInput.equals(trimmedInputUpperCase) && !trimmedInput.equals(trimmedInputLowerCase)) {
            return "Whoa, chill out!";
        }
        if(!trimmedInput.matches(".*[A-Z|a-z|0-9].*") && !trimmedInput.matches(".*(\n.*)+.*")) {
            return "Fine. Be that way!";
        }
        return "Whatever.";
    }
}