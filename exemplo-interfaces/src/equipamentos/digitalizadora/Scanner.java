package equipamentos.digitalizadora;

import equipamentos.digitalizadora.Digitalizadora;

public class Scanner implements Digitalizadora {

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando");
    }
}
