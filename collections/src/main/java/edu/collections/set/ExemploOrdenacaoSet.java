package edu.collections.set;

/*
Dadas as seguintes informações sobre minhas séries favoritas,
crie um conjunto e ordene este conjunto exibindo:
(nome - genero - tempo de episódio);

Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
Série 3 = nome: that '70s show, genero: comédia, tempoEpisodio: 25
*/

import java.util.*;

public class ExemploOrdenacaoSet {

    public static void main(String[] args) {

        System.out.println("--\\tOrdem aleatória\\t--");
        Set<Serie> minhasSeries = new HashSet<>() {{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};
        for (Serie serie : minhasSeries)
            System.out.println(serie.getNome() + " - "
                    + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("--\\tOrdem inserção\\t--");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};
        for (Serie serie : minhasSeries1)
            System.out.println(serie.getNome() + " - " +
                    serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("--\tOrdem Nome/Gênero/TempoEpisodio\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);
        for (Serie serie : minhasSeries3)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " +
                    serie.getTempoEpisodio());

        System.out.println("--\\tOrdem gênero\\t--");
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorGenero());
        minhasSeries4.addAll(minhasSeries);
        for (Serie serie : minhasSeries4)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " +
                    serie.getTempoEpisodio());

        System.out.println("--\\tOrdem Tempo Episódio\\t--");
        Set<Serie> minhasSeries5 = new TreeSet<>(new ComparatorTempoEpisodio());
        minhasSeries5.addAll(minhasSeries3);
        for (Serie serie : minhasSeries5)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " +
                    serie.getTempoEpisodio());
    }
}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie> {
    @Override
    public int compare(Serie serie1, Serie serie2) {
        int nome = serie1.getNome().compareTo(serie2.getNome());
        if (nome != 0) return nome;

        int genero = serie1.getGenero().compareTo(serie2.getGenero());
        if (genero != 0 ) return genero;

        return Integer.compare(serie1.getTempoEpisodio(), serie2.getTempoEpisodio());
    }
}

class ComparatorGenero implements Comparator<Serie> {
    @Override
    public int compare(Serie serie1, Serie serie2) {
        return serie1.getGenero().compareTo(serie2.getGenero());
    }
}

class ComparatorTempoEpisodio implements Comparator<Serie> {

    @Override
    public int compare(Serie serie1, Serie serie2) {
        int comparacaoPorTempo = Integer.compare(serie1.getTempoEpisodio(), serie2.getTempoEpisodio());
        if (comparacaoPorTempo != 0) {
            return comparacaoPorTempo;
        } else {
            return serie1.getNome().compareTo(serie2.getNome());
        }
    }
}
