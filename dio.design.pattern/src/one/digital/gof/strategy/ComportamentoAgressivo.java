package one.digital.gof.strategy;

public class ComportamentoAgressivo implements IComportamento{

    @Override
    public void mover() {
        System.out.println("Movimentando Agressivo");
    }
}
