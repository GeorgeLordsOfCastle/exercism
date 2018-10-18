class RaindropConverter {

    String convert(int number) {
        String raindropString = "";
        boolean isAtLeastAFactorFound = false;
        if(number % 3 == 0) {
            raindropString += "Pling";
            isAtLeastAFactorFound = true;
        }
        if(number % 5 == 0) {
            raindropString += "Plang";
            isAtLeastAFactorFound = true;
        }
        if(number % 7 == 0) {
            raindropString += "Plong";
            isAtLeastAFactorFound = true;
        }
        if(!isAtLeastAFactorFound) {
            raindropString = "" + number;
        }
        return raindropString;
    }

}
