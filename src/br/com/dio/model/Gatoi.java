package br.com.dio.model;

import java.util.Objects;

public class Gatoi {
    private String nome;
    private String cor;
    private Integer idade;

    public Gatoi() {}

    public Gatoi(String nome, String cor, Integer idade) {

        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gatoi gatoi = (Gatoi) o;
        return Objects.equals(nome, gatoi.nome) && Objects.equals(cor, gatoi.cor) && Objects.equals(idade, gatoi.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cor, idade);
    }

    @Override
    public String toString() {
        return "Gatoi{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", idade=" + idade +
                '}';
    }
}
