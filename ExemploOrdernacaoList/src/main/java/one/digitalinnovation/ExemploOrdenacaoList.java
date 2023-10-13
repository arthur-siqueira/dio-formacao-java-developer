package one.digitalinnovation;

/*
Dadas as seguintes informações sobre meus gatos, crie uma lista
e ordene esta lsta exibindo:
(nome -  idade - cor);

Gato1 = nome: Jon, idade: 18, cor: preto
Gato2 = nome: Simba, idade: 6, cor: tigrado
Gato3 = nome: Jon, idade: 12, cor: amarelo
*/

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {

    public static void main(String[] args) {

        // Etapa 1
        List<Gato> meusGatos = new ArrayList<>() {{
           add(new Gato("Jon", 18, "preto"));
           add(new Gato("Simba", 6, "tigrado"));
           add(new Gato("Jon", 12, "amarelo"));
        }};
        System.out.println(meusGatos);

        // Etapa 2
        System.out.println("--\tOrdem de Inserção\t---");
        System.out.println(meusGatos);

        // Etapa 3
        System.out.println("--\tOrdem Aleatória\t---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        // Etapa 4
        System.out.println("--\tOrdem Natural (Nome)\t---");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        // Etapa 5
        System.out.println("--\tOrdem Idade\t---");
        Collections.sort(meusGatos, new ComparatorIdade());
        System.out.println(meusGatos);

        // Etapa 6
        System.out.println("--\tOrdem Cor\t---");
        Collections.sort(meusGatos, new ComparatorCor());
        System.out.println(meusGatos);

        // Etapa 7
        System.out.println("--\tOrdem Nome/Cor/Idade\t---");
        Collections.sort(meusGatos, new ComparatorNomeCorIdade());
        System.out.println(meusGatos);

    }

}

class Gato implements Comparable<Gato>{
    private String nome;
    private String cor;
    private Integer idade;

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public Integer getIdade() {
        return idade;
    }

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato o1, Gato o2) {
        return Integer.compare(o1.getIdade(), o2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato> {
    @Override
    public int compare(Gato o1, Gato o2) {
        return o1.getCor().compareToIgnoreCase(o2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato o1, Gato o2) {
        int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
        if (nome != 0) return nome;

        int cor = o1.getCor().compareToIgnoreCase(o2.getCor());
        if (cor != 0) return cor;

        return Integer.compare(o1.getIdade(), o2.getIdade());
    }
}
