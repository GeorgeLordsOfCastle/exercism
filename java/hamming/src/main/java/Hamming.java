class Hamming {
    private final String leftStrand;
    private final String rightStrand;

    Hamming(String leftStrand, String rightStrand) {
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }

    int getHammingDistance() throws Exception {
        if(leftStrand.length() != rightStrand.length()) {
            throw new Exception("Strands don't have the same length.");
        }
        return 0;
    }
}
