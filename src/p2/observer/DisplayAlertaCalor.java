package p2.observer;

public class DisplayAlertaCalor implements Observador {

    private String temperatura;

    public DisplayAlertaCalor(String temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public void update(String msg) {
        System.out.println("A atual temperatura é: " + temperatura);
    }
}
