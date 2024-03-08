package Singleton;

/**
 * @author jardeljj
 */


public class Usuario {

    private static Usuario nome;


    public Usuario() {
    }

    public static Usuario getNome(){
        if (nome == null){
            nome = new Usuario();
        }
        return nome;
    }

}
