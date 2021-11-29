package br.com.dio;

import br.com.dio.model.Gatoi;

public class PrimeiroPrograma {
    private static Object Gatoi;
    private static Object Livro;

    public static void main(String[] args) {

        Gatoi gatoi = new Gatoi();

        System.out.println(Gatoi);

        Livro = new Livro ("A parabola do semeador", 300);


       /* int a = 4;
        int b = 7;
        System.out.println("Hello World " + (a+b));
        agora vai ein*/
    }
}

class Livro {

    private String nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}