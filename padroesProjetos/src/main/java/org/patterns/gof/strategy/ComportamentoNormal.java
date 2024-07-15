package org.patterns.gof.strategy;

public class ComportamentoNormal implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Robô movendo-se normalmente.");
    }
}
