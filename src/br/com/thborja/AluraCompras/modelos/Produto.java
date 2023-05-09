package br.com.thborja.AluraCompras.modelos;

public class Produto {

    private int operador;
    private String nome;
    private double preco;
    private int estoque;

    public String getNome() {
        return nome;
    }

    public int getOperador() {
        return operador;
    }

    public Produto(int operador, String nome, double preco, int estoque) {
        this.operador = operador;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public int getEstoque() {
        return estoque;
    }
}
