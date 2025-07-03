package p2.observer;

import java.util.ArrayList;
import java.util.List;

public class EstacaoMeteorologica {

    List<Observador> observadorList = new ArrayList<>();

    public void addObservador(Observador observador) {
        observadorList.add(observador);
    }

    public void notificaObservadores(String msg) {
        for (Observador observador : observadorList) {
            observador.update(msg);
        }
    }

}
