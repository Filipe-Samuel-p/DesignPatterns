package list_2.Exercise2;

public class Main {
    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Guitar(),
                new Piano(),
                new Drums(),
                new Guitar(),
                new Piano()
        };

        System.out.println("Musical performance:");
        for (Instrument instrument : orchestra) {
            instrument.play();
        }
    }

}
