class ReverseString {

    String reverse(String inputString) {
        String reverseString = "";
        for(int i=inputString.length()-1; i>=0; i--) {
            reverseString += inputString.charAt(i);
        }
        return reverseString;
    }
  
}