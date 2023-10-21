package edu.collections.map;

import java.util.HashMap;
import java.util.Map;

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
    }


}
