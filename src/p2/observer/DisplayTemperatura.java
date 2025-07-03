package p2.observer;


public class DisplayTemperatura implements Observador {

    private String temperatura;

    public DisplayTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public void update(String msg) {
        System.out.println("Temperatura: " + temperatura);
    }
}
