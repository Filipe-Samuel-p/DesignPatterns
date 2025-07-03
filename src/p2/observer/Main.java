package p2.observer;

public class Main {
    public static void main(String[] args) {
        EstacaoMeteorologica estacaoMeteorologica = new EstacaoMeteorologica();
        Observador displayTemperatura = new DisplayTemperatura("17 graus");
        Observador displayAlertaCalor = new DisplayAlertaCalor("20 graus");

        estacaoMeteorologica.addObservador(displayTemperatura);
        estacaoMeteorologica.addObservador(displayAlertaCalor);

        estacaoMeteorologica.notificaObservadores("Temperatura alterada");
    }
}
