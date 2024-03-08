package Facade;

import Sistema1.CrmService;
import Sistema2.LocalizaCep;

public class Facade  {

    public void transferenciaCLiente(String nome, String cep){
       String cidade = LocalizaCep.getInstancia().recuperarCidade(cep);
        String estado = LocalizaCep.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome,cep,cidade,estado);

    }

}
