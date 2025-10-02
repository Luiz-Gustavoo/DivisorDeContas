package br.com.divisorDeContas.DivisorDeContas.Modelos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CartaoDeCredito extends FormularioDespesa{
    private double valorFatura;

    public CartaoDeCredito(double valorFatura){
        this.valorFatura = valorFatura;
    }

    public void getListaDeDespesas() {
        System.out.println("\nDespesas da fatura: ");
        listaDeDespesas.forEach(System.out::println);
    }

    public double getValorFatura(){
        return valorFatura;
    }

    @Override
    public List<Despesa> formularioDespesa() {
        System.out.println("Informe as despesas no formulário a seguir");
        return super.formularioDespesa();
    }
}
