package org.patterns.gof;

import org.patterns.gof.facade.Facade;
import org.patterns.gof.singleton.SingletonEager;
import org.patterns.gof.singleton.SingletonLazy;
import org.patterns.gof.singleton.SingletonLazyHolder;
import org.patterns.gof.strategy.Comportamento;
import org.patterns.gof.strategy.ComportamentoAgressivo;
import org.patterns.gof.strategy.ComportamentoDefensivo;
import org.patterns.gof.strategy.ComportamentoNormal;
import org.patterns.gof.strategy.Robo;

public class Test {

    public static void main(String[] args) {

        // Testes relacionados ao Design Pattern Singleton
        /*SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);*/

        // Testes relacionados ao Design Pattern Strategy
        /*Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo N436 = new Robo();
        N436.setComportamento(normal);
        N436.mover();
        N436.setComportamento(agressivo);
        N436.mover();
        N436.setComportamento(defensivo);
        N436.mover();*/

        // Testes relacionados ao Design Pattern Facade
        Facade facade = new Facade();
        facade.migrarCliente("Ana", "12345678");

    }
}
