package br.com.divisorDeContas.DivisorDeContas.Modelos;

public class FormularioCartaoDeCredito extends FormularioSalario{
    private double valorFatura;

    public CartaoDeCredito formularioCartao(){
        System.out.println("Informe o valor da fatura: ");
        double valorFatura = leitor.nextDouble();
        return new CartaoDeCredito(valorFatura);
    }
}
