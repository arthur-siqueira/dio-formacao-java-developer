package edu.collections.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CincoPerguntas {

    public static void main(String[] args) {

        ArrayList<String> respostas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Favor responda as pergunstas com s/n");
        System.out.println("***** Perguntas *****");
        System.out.println("Telefonou para a vítima?");
        respostas.add(sc.next());
        System.out.println("Esteve no local do crime?");
        respostas.add(sc.next());
        System.out.println("Mora perto da vítima?");
        respostas.add(sc.next());
        System.out.println("Devia para a vítima?");
        respostas.add(sc.next());
        System.out.println("Já trabalhou com a vítima?");
        respostas.add(sc.next());

        String elemento = "s";
        String pessoa;

        int ocorrencias = Collections.frequency(respostas, elemento);


        if (ocorrencias == 2) {
            pessoa = "Suspeita";
        }
        else if (ocorrencias >= 3 && ocorrencias <= 4) {
            pessoa = "Cúmplice";
        }
        else if (ocorrencias == 5) {
            pessoa = "Assassina";
        }
        else {
            pessoa = "Inocente";
        }

        System.out.println("A pessoa em questão é: " + pessoa);

        sc.close();
        }
}

