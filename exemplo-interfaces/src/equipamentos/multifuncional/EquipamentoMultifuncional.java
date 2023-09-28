package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Impressora, Copiadora, Digitalizadora {
    @Override
    public void copiar() {
        System.out.println("Copiando no equipamento multifuncional");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando no equipamento multifuncional");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo no equipamento multifuncional");
    }
}
