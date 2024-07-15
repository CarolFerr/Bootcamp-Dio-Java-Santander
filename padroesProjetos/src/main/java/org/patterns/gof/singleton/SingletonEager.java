package org.patterns.gof.singleton;

public class SingletonEager {

    private static final SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    // instancia diretamente para quando for devolver sem verificação
    public static SingletonEager getInstancia() {
        return instancia;
    }
}
