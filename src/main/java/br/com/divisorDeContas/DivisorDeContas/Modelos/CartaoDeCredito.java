package br.com.divisorDeContas.DivisorDeContas.Modelos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CartaoDeCredito extends FormularioDespesa{
    List<Despesa> listaDeDespesas = new ArrayList<>();
    Scanner leitor = new Scanner(System.in);
    private double valorFatura;

    public CartaoDeCredito(double valorFatura){
        this.valorFatura = valorFatura;
    }

    public double getValorFatura(){
        return valorFatura;
    }

    @Override
    public List<Despesa> formularioDespesa() {
        return super.formularioDespesa();
    }
}
