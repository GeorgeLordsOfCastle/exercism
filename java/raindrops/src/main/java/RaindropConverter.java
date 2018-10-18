class RaindropConverter {

    String convert(int number) {
        String raindropString = "";
        if(number % 3 == 0) {
            raindropString += "Pling";
        }
        if(number % 5 == 0) {
            raindropString += "Plang";
        }
        if(raindropString.length()==0) {
            raindropString = "" + number;
        }
        return raindropString;
    }

}
