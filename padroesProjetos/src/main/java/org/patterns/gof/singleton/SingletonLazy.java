package org.patterns.gof.singleton;

public class SingletonLazy {

    private static SingletonLazy instancia;

    // para que ninguém instancia o padrão de projeto
    private SingletonLazy() {
        super();
    }

    // só será isntanciada se for nulo
    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
