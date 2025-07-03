package p2.commander;

public class LigarLuzCommand implements Comando{

    private LigarLuz ligarLuz;
    public LigarLuzCommand(LigarLuz luz){
        this.ligarLuz = luz;
    }

    @Override
    public void executar() {
        ligarLuz.ligarLuz();
    }
}
