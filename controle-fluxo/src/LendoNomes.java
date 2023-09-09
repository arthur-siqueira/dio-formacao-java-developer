import java.util.Scanner;
public class LendoNomes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[10];

        for(int i = 1; i<10; i++) {
            nomes[i] = sc.nextLine();
        }

        System.out.println(nomes[3]);
        System.out.println(nomes[7]);
        System.out.println(nomes[9]);
    }
}
