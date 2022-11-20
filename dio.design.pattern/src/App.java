import one.digital.gof.singleton.SingletonEager;
import one.digital.gof.singleton.SingletonLazy;
import one.digital.gof.singleton.SingletonLazyHolder;
import one.digital.gof.strategy.*;

public class App {
    public static void main(String[] args) throws Exception {

        //Singleton
        System.out.println("*****Iniciando Singleton*****");
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lz = SingletonLazyHolder.getInstancia();
        System.out.println(lz);
        lz = SingletonLazyHolder.getInstancia();
        System.out.println(lz);
        System.out.println("*****FIM Singleton*****");

        //Strategy
        System.out.println("*****Iniciando Strategu*****");
        IComportamento normal = new ComportamentoNormal();
        IComportamento agressivo = new ComportamentoAgressivo();
        IComportamento defensivo = new ComportamentoDefensivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        System.out.println("*****Fim Strategy*****");
    }
}
