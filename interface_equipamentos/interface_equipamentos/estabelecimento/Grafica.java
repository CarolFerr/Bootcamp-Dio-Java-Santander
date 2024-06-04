package interface_equipamentos.estabelecimento;

import interface_equipamentos.copiadora.Copiadora;
import interface_equipamentos.digitalizadora.Digitalizadora;
import interface_equipamentos.impressora.Deskjet;
import interface_equipamentos.impressora.Impressora;
import interface_equipamentos.impressora.Laserjet;
import interface_equipamentos.multifuncional.EquipamentoMultifuncional;

public class Grafica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;


        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.Copiar();

    }
}
