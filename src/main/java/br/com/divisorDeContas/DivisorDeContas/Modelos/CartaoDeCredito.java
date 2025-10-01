package br.com.divisorDeContas.DivisorDeContas.Modelos;

public class CartaoDeCredito {
    private double valorFatura;

    public CartaoDeCredito(double valorFatura){
        this.valorFatura = valorFatura;
    }

    public double getValorFatura(){
        return valorFatura;
    }
}
