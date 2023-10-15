package edu.collections.set;

import java.util.Comparator;

public class LinguagemFavorita {

    private final String nome;
    private final Integer anoDeCriacao;
    private final String ide;

    public LinguagemFavorita(String nome, String ide, Integer anoDeCriacao) {
        this.nome = nome;
        this.ide = ide;
        this.anoDeCriacao = anoDeCriacao;
    }

    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "LinguagemFavorita{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }
}

