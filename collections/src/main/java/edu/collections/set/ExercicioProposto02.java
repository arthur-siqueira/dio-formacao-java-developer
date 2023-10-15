package edu.collections.set;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioProposto02 {

    public static void main(String[] args) {

        Set<LinguagemFavorita> linguagensFavoritas = new LinkedHashSet<>();
        linguagensFavoritas.add(new LinguagemFavorita("Java", "Eclipse", 1995));
        linguagensFavoritas.add(new LinguagemFavorita("Python", "Pycharm", 1989));
        linguagensFavoritas.add(new LinguagemFavorita("C", "VS Code", 1972));

        System.out.println("- Imprimindo por ordem de inserção -");
        for (LinguagemFavorita linguagem : linguagensFavoritas) {
            System.out.println(linguagem.getNome() + " - " + linguagem.getIde() + " - " + linguagem.getAnoDeCriacao());
        }
        System.out.println();

        System.out.println("- Ordem Natural (nome) -");
        Set<LinguagemFavorita> linguagensPorNome = new TreeSet<>(Comparator.comparing(LinguagemFavorita::getNome));
        linguagensPorNome.addAll(linguagensFavoritas);
        for (LinguagemFavorita linguagem : linguagensPorNome) {
            System.out.println(linguagem.getNome() + " - " + linguagem.getIde() + " - " + linguagem.getAnoDeCriacao());
        }
        System.out.println();

        System.out.println("- IDE -");
        Set<LinguagemFavorita> linguagensPorIDE = new TreeSet<>(Comparator.comparing(LinguagemFavorita::getIde));
        linguagensPorIDE.addAll(linguagensFavoritas);
        for (LinguagemFavorita linguagem : linguagensPorIDE) {
            System.out.println(linguagem.getNome() + " - " + linguagem.getIde() + " - " + linguagem.getAnoDeCriacao());
        }
        System.out.println();

        System.out.println("- Ano de criação e nome -");
        Set<LinguagemFavorita> linguagensPorAnoNome = new TreeSet<>(Comparator.comparing(LinguagemFavorita::getAnoDeCriacao).thenComparing(LinguagemFavorita::getNome));
        linguagensPorAnoNome.addAll(linguagensFavoritas);
        for (LinguagemFavorita linguagem : linguagensPorAnoNome) {
            System.out.println(linguagem.getNome() + " - " + linguagem.getIde() + " - " + linguagem.getAnoDeCriacao());
        }
        System.out.println();

        System.out.println("- Nome, ano de criação e IDE -");
        Set<LinguagemFavorita> linguagensPorNomeAnoIDE = new TreeSet<>(Comparator.comparing(LinguagemFavorita::getNome)
                .thenComparing(LinguagemFavorita::getAnoDeCriacao)
                .thenComparing(LinguagemFavorita::getIde));
        linguagensPorNomeAnoIDE.addAll(linguagensFavoritas);
        for (LinguagemFavorita linguagem : linguagensPorNomeAnoIDE) {
            System.out.println(linguagem.getNome() + " - " + linguagem.getIde() + " - " + linguagem.getAnoDeCriacao());
        }
        System.out.println();
    }
}
