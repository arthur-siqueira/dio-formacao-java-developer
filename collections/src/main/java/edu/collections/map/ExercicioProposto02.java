package edu.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ExercicioProposto02 {

    public static void main(String[] args) {

        Map<Integer, Integer> resultados = new HashMap<>();

        for (int i = 0; i < 100; i++) {
            int resultadoLancamento = simularLancamentoDado();
            resultados.put(resultadoLancamento, resultados.getOrDefault(resultadoLancamento, 0) + 1);
        }

        System.out.println("Resultados dos lançamentos do dado:");
        for (Map.Entry<Integer, Integer> entry : resultados.entrySet()) {
            System.out.println("Número: " + entry.getKey() + ", Frequência: " + entry.getValue());
        }

    }

    // Método para simular o lançamento de um dado de seis lados
    private static int simularLancamentoDado() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

}


