package br.com.thborja.AluraCompras.modelos;

public class FazCompra {

    public void fazCompra(CartaoDeCredito cartao, Produto produto, int quantidade) {
        if (cartao.getLimite() < produto.getPreco()) {
            System.out.println("LIMITE INSUFICIENTE");
        } else if (quantidade> produto.getEstoque()) {
            System.out.println("FORA DE ESTOQUE, TEMOS " + produto.getEstoque() + " UNIDADES DESSE PRODUTO");
        } else {
            cartao.setLimite(cartao.getLimite()-produto.getPreco()*quantidade);
            produto.setEstoque(produto.getEstoque()-quantidade);
            System.out.println("Compra de " + quantidade + " " + produto.getNome());
            System.out.println("Limite atual: R$" + cartao.getLimite());
        }
    }

}
