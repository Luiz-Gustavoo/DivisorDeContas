package br.com.divisorDeContas.DivisorDeContas.Modelos;

import java.util.Scanner;

public class FormularioSalario {
    Scanner leitor = new Scanner(System.in);

    public Salario formularioSalario() {
        System.out.println("Informe seu salário: ");
        double salario = leitor.nextDouble();
        return new Salario(salario);
    }
}
