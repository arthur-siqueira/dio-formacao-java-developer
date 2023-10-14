package edu.collections.set;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.*;

public class ExercicioProposto01 {

    public static void main(String[] args) {

        // Crie um conjunto contendo as cores do arco-íris e:
        Set<String> arcoIris = new LinkedHashSet<>();
        arcoIris.add("vermelho");
        arcoIris.add("laranja");
        arcoIris.add("amarelo");
        arcoIris.add("verde");
        arcoIris.add("azul");
        arcoIris.add("azul marinho");
        arcoIris.add("violeta");

        System.out.println("- Exiba todas as cores uma abaixo da outra -");
        for (String cor : arcoIris) System.out.println(cor);

        System.out.println("- A quantidade de cores que o arco-íris tem -");
        System.out.println(arcoIris.size());

        System.out.println("- Exiba as cores em ordem alfabética -");
        Comparator<String> stringComparator = Comparator.naturalOrder();
        Set<String> arcoIris2 = new TreeSet<>(stringComparator);
        arcoIris2.addAll(arcoIris);
        for (String cor : arcoIris2) System.out.println(cor);

        System.out.println("- Exiba as cores na ordem inversa da que foi informada -");
        List<String> listaCores = Arrays.asList(arcoIris.toArray(new String[0]));
        Collections.reverse(listaCores);
        for (String cor : listaCores) System.out.println(cor);

        System.out.println("- Exiba todas as cores que começam com a letra ”v” -");
        for (String cor : arcoIris) {
            if (cor.startsWith("v")) {
                System.out.println(cor);
            }
        }

        System.out.println("- Remova todas as cores que não começam com a letra “v” -");
        arcoIris.removeIf(cor -> cor.startsWith("v"));
        for (String cor : arcoIris) System.out.println(cor);

        System.out.println("- Limpe o conjunto -");
        arcoIris.clear();

        System.out.println("- Confira se o conjunto está vazio -");
        System.out.println("Conjunto arco íris está vazio: " + arcoIris.isEmpty());
    }
}
