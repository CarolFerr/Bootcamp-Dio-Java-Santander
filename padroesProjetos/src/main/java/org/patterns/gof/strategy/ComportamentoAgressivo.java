package org.patterns.gof.strategy;

public class ComportamentoAgressivo implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Robô movendo-se de forma Agressiva");
    }
}
