package edu.collections.exercicios;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista.
*  Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média, e em que
*  mês elas ocorreram (mostrar o mês por extenso: 1 - Janeiro, 2 - Fevereiro e etc).
*  */

public class TemperaturaMedia {

    public static void main(String[] args) {

        ArrayList<Integer> temperaturasMedias = new ArrayList<>();
        temperaturasMedias.add(25);
        temperaturasMedias.add(25);
        temperaturasMedias.add(25);
        temperaturasMedias.add(25);
        temperaturasMedias.add(24);
        temperaturasMedias.add(23);


        Integer soma = 0;
        for (Integer temp : temperaturasMedias) {
            soma += temp;
        }

        Integer media = soma/temperaturasMedias.size();
        System.out.println("Temperatura média semestral: " + media);


        System.out.println("Temperaturas acima da média:");

        for (int i = 0; i < temperaturasMedias.size(); i++) {
            if (temperaturasMedias.get(i) > media) {
                String mes = obterMesPorIndice(i);
                System.out.println(mes + " - " + temperaturasMedias.get(i));
            }
        }

    }

    public static String obterMesPorIndice(int indice) {
        switch (indice) {
            case 0:
                return "Janeiro";
            case 1:
                return "Fevereiro";
            case 2:
                return "Março";
            case 3:
                return "Abril";
            case 4:
                return "Maio";
            case 5:
                return "Junho";
            default:
                return "Mês inválido";
        }
    }
}
