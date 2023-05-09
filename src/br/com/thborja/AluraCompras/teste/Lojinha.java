package br.com.thborja.AluraCompras.teste;

import br.com.thborja.AluraCompras.modelos.CartaoDeCredito;
import br.com.thborja.AluraCompras.modelos.FazCompra;
import br.com.thborja.AluraCompras.modelos.Produto;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lojinha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resposta = 2;
        FazCompra fazCompra = new FazCompra();

        System.out.println("Defina o proprietario do cartao: ");
        String prop = sc.nextLine();
        System.out.println("Defina o limite do cartao: ");
        double lim = sc.nextDouble();


        CartaoDeCredito cartao = new CartaoDeCredito(lim,prop);
        Produto p1 = new Produto(0,"Caixa de leite", 2,10);
        Produto p2 = new Produto(1,"Caixa de ovos", 12,3);
        Produto p3 = new Produto(2,"Suco de uva", 8,12);
        Produto p4 = new Produto(3,"Caixa de cha verde", 6,4);
        Produto p5 = new Produto(4,"Coca-zero 200ml", 2,25);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(p1);
        listaDeProdutos.add(p2);
        listaDeProdutos.add(p3);
        listaDeProdutos.add(p4);
        listaDeProdutos.add(p5);
        ArrayList<Produto> sacola = new ArrayList<>();

        while (resposta!=0){
            System.out.println("1 - Fazer uma compra");
            if (resposta == 2){
                System.out.println("Limite atual: " + cartao.getLimite());
            }
            if (resposta == 1){
                System.out.println("Qual produto deseja comprar? ");
                for (Produto produto : listaDeProdutos) {
                    System.out.println(produto.getOperador() + " - " + produto.getNome() + " R$" + produto.getPreco());
                }
                int r = sc.nextInt();
                System.out.println("Quantidade? ");
                int q = sc.nextInt();
                fazCompra.fazCompra(cartao,listaDeProdutos.get(r),q);
                sacola.add(listaDeProdutos.get(r));
            }
            System.out.println("0 - Sair");
            System.out.println("1 - Fazer uma compra");
            System.out.println("2 - Consultar limite");
            resposta = sc.nextInt();
        }
        System.out.println("SACOLA: ");
        for (Produto produto: sacola) {
            System.out.println(produto.getNome());
        }
        System.out.println("TOTAL: R$" + (lim-cartao.getLimite()));
        System.out.println("VOLTE SEMPRE " + cartao.getProprietario().toUpperCase());
    }
}
