package edu.collections.streamAPI;

import edu.collections.map.exercicioProposto03.Contato;

import java.util.*;

/*Dadas as seguintes informações  de id e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato);

id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
*/

public class ExemploStreamAPI {

    public static void main(String[] args) {

        System.out.println("Ordem aleatória");
        Map<Integer, Contato> agenda = new HashMap<>() {{
            put(1, new Contato("Filipe", 5555));
            put(4, new Contato("Henrique", 1111));
            put(3, new Contato("Arthur", 2222));
        }};
        for (Map.Entry<Integer, Contato> entry : agenda.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("Ordem de inserção");
        Map<Integer, Contato> agenda1 = new LinkedHashMap<>() {{
            put(1, new Contato("Filipe", 5555));
            put(4, new Contato("Henrique", 1111));
            put(3, new Contato("Arthur", 2222));
        }};

        for (Map.Entry<Integer, Contato> entry : agenda1.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("Ordem ID");
        Map<Integer, Contato> agenda2 = new TreeMap<>(agenda);

        for (Map.Entry<Integer, Contato> entry : agenda2.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("Ordem número de telefone");

        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNumero()));
        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry: set) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + ": " + entry.getValue().getNome());
        }

        System.out.println("Ordem nome contato");
        Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNome()));
        set1.addAll(agenda.entrySet());
        set1.forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue().getNome()));

    }
}
