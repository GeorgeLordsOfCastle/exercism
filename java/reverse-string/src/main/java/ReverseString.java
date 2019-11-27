class ReverseString {

    String reverse(String inputString) {
        StringBuilder reverseString = new StringBuilder();
        for(int i=inputString.length()-1; i>=0; i--) {
            reverseString.append(inputString.charAt(i));
        }
        return reverseString.toString();
    }
  
}