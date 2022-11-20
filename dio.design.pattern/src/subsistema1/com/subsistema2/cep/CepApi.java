package subsistema1.com.subsistema2.cep;

import one.digital.gof.singleton.SingletonEager;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Manaus";
    }

    public String recuperarEstado(String cep) {
        return "Amazonas";
    }
}
