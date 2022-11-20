package one.digital.gof.singleton;

/**
 * Singleton "apressado"
 *
 * @author  FranklinPerseuDS
 */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
