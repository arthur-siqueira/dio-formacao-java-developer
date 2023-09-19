public class SistemaCadastro {
    public static void main(String[] args) {
        // criando uma pessoa no sistema
        Pessoa filipe = new Pessoa("123", "Filipe");

        // definindo o endereço de Filipe
        filipe.setEndereco("RUA DA MATA");

        // imprimindo informações de marcos
        System.out.println(filipe.getNome() + "-" + filipe.getCpf());
    }
}
