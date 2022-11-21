package one.digital.gof.strategy;

public class ComportamentoDefensivo implements IComportamento{

    @Override
    public void mover() {
        System.out.println("Movimentando Defensivo");
    }
}
