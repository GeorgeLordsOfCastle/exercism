class RaindropConverter {

    String convert(int number) {
        String raindropString = "";
        boolean noFactorsWereFound = true;
        if(number % 3 == 0) {
            raindropString += "Pling";
            noFactorsWereFound = false;
        }
        if(number % 5 == 0) {
            raindropString += "Plang";
            noFactorsWereFound = false;
        }
        if(number % 7 == 0) {
            raindropString += "Plong";
            noFactorsWereFound = false;
        }
        if(noFactorsWereFound) {
            raindropString = Integer.toString(number);
        }
        return raindropString;
    }

}
