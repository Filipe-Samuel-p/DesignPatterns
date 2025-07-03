package p2.commander;

public class DesligarTvCommand implements Comando{

    private DesligarTv desligarTv;

    public DesligarTvCommand(DesligarTv desligarTv){
        this.desligarTv = desligarTv;
    }

    @Override
    public void executar() {
        desligarTv.desligarTv();
    }
}
