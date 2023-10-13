package edu.collections.lista;

import java.util.*;

public class ExemploList {
    public static void main(String[] args) {

        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6] faça:

        // Etapa 1
        System.out.println("Crie uma lista e adicione as sete notas:");
        ArrayList<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println("Notas: " + notas.toString());

        // Etapa 2
        System.out.println("Exiba a posição da nota 5.0:");
        System.out.println(notas.indexOf(5.0));

        // Etapa 3
        System.out.println("Adicione na lista a nota 8.0 na posição 4:");
        notas.add(4, 8d);
        System.out.println(notas.toString());

        // Etapa 4
        System.out.println("Substitua a nota 5.0 pela nota 6.0:");

        // Etapa 5
        System.out.println("Substitua a nota 5.0 pela nota 6.0:");
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas);

        // Etapa 6
        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5.0));

        // Etapa 7
        System.out.println("Exiba todas as notas na ordem em que foram informadas:");
        for (Double nota : notas) System.out.println(nota);

        // Etapa 8
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        // Etapa 9
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        // Etapa 10
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        // Etapa 11
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma das notas: " + soma);

        // Etapa 12
        System.out.println("Exiba as médias das notas: " + (soma/notas.size()));

        // Etapa 13
        System.out.println("Remova o 0:");
        notas.remove(0.0);
        System.out.println(notas.toString());

        // Etapa 14
        System.out.println("Remova a nota da posição 0");
        notas.remove(0);
        System.out.println(notas);


        // Etapa 15
        System.out.println("Remova as notas menores que 7 e exiba a list: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        // Etapa 16
        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);

        // Etapa 17
        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

        // Etapa 18 - Usando métodos da implementação LinkedList
        System.out.println("Crie uma lista chamada notas2" + " e coloque todos os elementos da lista ArrayList nessa nova lista");
        LinkedList<Double> notas2 = new LinkedList<>();
        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(7.0);
        notas2.add(0.0);
        notas2.add(3.6);
        System.out.println(notas2.toString());

        // Etapa 19
        System.out.println("Mostre a primeira nota da nova lista sem removê-lo:");
        System.out.println(notas2.peek());
        System.out.println(notas2.toString());

        // Etapa 20
        System.out.println("Mostre a primeira nota da nova lista removendo-a:");
        System.out.println(notas2.poll());
        System.out.println(notas2.toString());
    }
}
