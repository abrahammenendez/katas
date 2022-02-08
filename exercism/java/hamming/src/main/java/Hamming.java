import java.util.function.IntConsumer;

class Hamming {

    private String leftStrand;

    private String rightStrand;

    Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() != rightStrand.length()) {
            throw new RuntimeException();
        }
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }

    int getHammingDistance() {
        int distance;
        this.leftStrand.chars().parallel().forEach(i -> {

            if (char == )

        });
    }

}
