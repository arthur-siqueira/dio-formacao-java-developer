package edu.collections.map;

import java.util.*;

public class ExercicioProposto01 {

    public static void main(String[] args) {

        // Criando uma instância de HashMap
        Map<String, Integer> estadosNordeste = new HashMap<>();
        estadosNordeste.put("PE", 9616621);
        estadosNordeste.put("AL", 3351543);
        estadosNordeste.put("CE", 9187103);
        estadosNordeste.put("RN", 3534265);

        System.out.println(estadosNordeste);

        estadosNordeste.put("RN", 3534165);

        if (!estadosNordeste.containsKey("PB")) {
            estadosNordeste.put("PB", 4039277);
        }

        System.out.println("A população de PE é: " + estadosNordeste.get("PE"));

        System.out.println("Estados e suas populações na ordem informada:");
        for (Map.Entry<String, Integer> entry : estadosNordeste.entrySet()) {
            System.out.println("Estado: " + entry.getKey() + ", População: " + entry.getValue());
        }


        System.out.println("\nEstados e suas populações em ordem alfabética:");
        TreeMap<String, Integer> populacaoEstadosOrdenado = new TreeMap<>(estadosNordeste);
        for (Map.Entry<String, Integer> entry : populacaoEstadosOrdenado.entrySet()) {
            System.out.println("Estado: " + entry.getKey() + ", População: " + entry.getValue());
        }

        int menorPopulacao = Collections.min(estadosNordeste.values());
        String estadoMenorPopulacao = "";
        for (Map.Entry<String, Integer> entry : estadosNordeste.entrySet()) {
            if (entry.getValue() == menorPopulacao) {
                estadoMenorPopulacao = entry.getKey();
                break;
            }
        }
        System.out.println("\nEstado com a menor população: " + estadoMenorPopulacao + ", População: " + menorPopulacao);

        int maiorPopulacao = Collections.max(estadosNordeste.values());
        String estadoMaiorPopulacao = "";
        for (Map.Entry<String, Integer> entry : estadosNordeste.entrySet()) {
            if (entry.getValue() == maiorPopulacao) {
                estadoMaiorPopulacao = entry.getKey();
                break;
            }
        }
        System.out.println("Estado com a maior população: " + estadoMaiorPopulacao + ", População: " + maiorPopulacao);

        int somaPopulacao = estadosNordeste.values().stream().mapToInt(Integer::intValue).sum();
        System.out.println("\nSoma da população dos estados: " + somaPopulacao);

        double mediaPopulacao = estadosNordeste.values().stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("Média da população dos estados: " + mediaPopulacao);

        estadosNordeste.values().removeIf(populacao -> populacao < 4000000);
        System.out.println("\nEstados com população maior que 4.000.000:");
        for (Map.Entry<String, Integer> entry : estadosNordeste.entrySet()) {
            System.out.println("Estado: " + entry.getKey() + ", População: " + entry.getValue());
        }

        estadosNordeste.clear();
        System.out.println("\nDicionário de estados foi apagado.");

        System.out.println("O dicionário está vazio: " + estadosNordeste.isEmpty());
    }
}
