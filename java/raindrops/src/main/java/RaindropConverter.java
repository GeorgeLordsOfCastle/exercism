class RaindropConverter {

    String convert(int number) {
        if(number==1) {
            return "1";
        }
        if(number % 3 == 0) {
            return "Pling";
        }
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
