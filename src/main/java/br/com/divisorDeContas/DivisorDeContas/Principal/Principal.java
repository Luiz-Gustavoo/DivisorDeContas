package br.com.divisorDeContas.DivisorDeContas.Principal;

import java.util.Scanner;

public class Principal {
    Scanner leitor = new Scanner(System.in);

    public void exibeMenu() {
        System.out.println("**********GERENCIADOR DE DESPESAS**********\n");

        System.out.println("Informe a descrição: ");
        String descricaoDespesa = leitor.nextLine();

        System.out.println("Informe a categoria dentre as seguintes opções: \n" +
                "Necessidades \n" +
                "Desejos \n" +
                "Investimentos");
        String categoriaDespesa = leitor.nextLine();

        System.out.println("Informe o valor da despesa: ");
        double valorDespesa = leitor.nextDouble();
    }
}
