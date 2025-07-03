package p2.commander;

public class ControleRemoto {

    private Comando comando;

    public ControleRemoto(Comando comando){
        this.comando = comando;
    }

    public void executarComando(){
        comando.executar();
    }

}
