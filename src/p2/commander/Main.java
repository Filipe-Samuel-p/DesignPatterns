package p2.commander;

public class Main {

    public static void main(String[] args) {
        LigarLuz luz = new LigarLuz();
        DesligarTv desligarTv = new DesligarTv();
        ControleRemoto controleRemoto1 = new ControleRemoto(new LigarLuzCommand(luz));
        ControleRemoto controleRemoto2 = new ControleRemoto(new DesligarTvCommand(desligarTv));

        controleRemoto1.executarComando();
        controleRemoto2.executarComando();
    }
}
