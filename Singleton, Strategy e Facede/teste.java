import Facade.Facade;
import Singleton.Usuario;
import Strategy.*;

public class teste {

    public static void main(String[] args) {

        //Singleton

        Usuario singleton = Usuario.getNome();
        System.out.println(singleton);
        System.out.println();
        //Strategy

        Acao frente = new acaoFrente();
        Acao frear = new acaoFrear();
        Acao re = new acaoRe();

        Carro carro = new Carro();
        carro.setAcao(frear);

        carro.mover();
        carro.setAcao(frente);
        carro.mover();
        carro.setAcao(re);
        carro.mover();
        System.out.println();

        //Facade

        Facade facade = new Facade();
        facade.transferenciaCLiente("Jardel", "06856880");

    }

}
