package usuario;

import iphone.Iphone;

public class App {
    public static void main(String[] args) {

        // Demonstrando as funcionalidades do iphone.Iphone

        Iphone iphone = new Iphone();

        // Aparelho Telefonico
        System.out.println("*** iphone.Iphone como aparelho telefônico ***");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        System.out.println();

        // Reprodutor Musical
        System.out.println("*** iphone.Iphone como reprodutor musical ***");
        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();
        System.out.println();

        // Navegador na internet
        System.out.println("*** iphone.Iphone como navegador na internet ***");
        iphone.exibirPagina();
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();

    }
}
