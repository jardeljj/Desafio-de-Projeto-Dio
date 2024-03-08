package Sistema1;

import Sistema2.LocalizaCep;

public class CrmService {


    public CrmService() {
        super();
    }

    public static void gravarCliente(String nome, String cep, String cidade, String estado){
        System.out.println("Cliente foi salvo com sucesso!");
        System.out.println(nome);
        System.out.println(cidade);
        System.out.println(cep);
        System.out.println(estado);
    }

}
