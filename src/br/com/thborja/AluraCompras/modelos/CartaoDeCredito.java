package br.com.thborja.AluraCompras.modelos;

public class CartaoDeCredito {

    private double limite;
    private String proprietario;

    public CartaoDeCredito(double limite, String proprietario) {
        this.limite = limite;
        this.proprietario = proprietario;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String getProprietario() {
        return proprietario;
    }
}
