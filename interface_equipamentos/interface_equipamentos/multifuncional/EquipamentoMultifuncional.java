package interface_equipamentos.multifuncional;

import interface_equipamentos.copiadora.Copiadora;
import interface_equipamentos.digitalizadora.Digitalizadora;
import interface_equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Impressora, Copiadora, Digitalizadora {
    @Override
    public void imprimir() {
        System.out.println("Imprimindo via equipamento multifuncional");
    }

    @Override
    public void Copiar() {
        System.out.println("Copiando via equipamento multifuncional");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando via equipamento multifuncional");
    }
}
