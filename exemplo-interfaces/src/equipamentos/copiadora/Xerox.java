package equipamentos.copiadora;

import equipamentos.copiadora.Copiadora;

public class Xerox implements Copiadora {
    @Override
    public void copiar() {
        System.out.println("Copiando");
    }
}
