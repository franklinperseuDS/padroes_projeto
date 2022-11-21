package one.digital.gof.facade;

import subsistema1.com.CrmSistema;
import subsistema1.com.subsistema2.cep.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);
        CrmSistema.gravarCliente(nome, cep, cidade, estado);
    }
}
