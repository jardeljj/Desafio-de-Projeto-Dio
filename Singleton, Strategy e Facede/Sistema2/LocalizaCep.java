package Sistema2;

public class LocalizaCep {

    private static LocalizaCep instancia = new LocalizaCep();

    public LocalizaCep() {
        super();
    }

    public static LocalizaCep getInstancia(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Itapecerica da Serra";
    }

    public String recuperarEstado(String cep){
        return "São paulo";
    }


}
