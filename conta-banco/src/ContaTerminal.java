import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        // criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // pedindo os dados
        System.out.println("Informe seu nome:");
        String nome = scanner.next();

        System.out.println("Digite o número da agência:");
        String agencia = scanner.next();

        System.out.println("Digite o numero da conta:");
        int conta = scanner.nextInt();

        System.out.println("Informe o saldo:");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d\n", nome, agencia, conta);
        System.out.printf("e seu saldo %.2f já está disponível para saque\n", saldo);


    }
}
