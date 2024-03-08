package Strategy;
/**
 * @author jardeljj
 */

public class Carro {

    private Acao acao;

    public void setAcao(Acao acao) {
        this.acao = acao;
    }

    public void mover(){
        acao.mover();
    }

}
