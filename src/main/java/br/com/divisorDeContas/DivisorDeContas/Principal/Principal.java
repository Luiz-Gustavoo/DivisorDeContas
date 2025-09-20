package br.com.divisorDeContas.DivisorDeContas.Principal;

import br.com.divisorDeContas.DivisorDeContas.Modelos.Despesa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Principal {
    public Scanner leitor = new Scanner(System.in);
    private Set<String> categoriasPermitidas = new HashSet<String>(Arrays.asList("necessidades", "desejos", "investimentos"));

    public void exibeMenu() {
        System.out.println("**********GERENCIADOR DE DESPESAS**********\n");

        int finalizarFormulario = 0;
        while(finalizarFormulario != 1) {
            System.out.println("Informe a descrição: ");
            String descricaoDespesa = leitor.next();

            String categoriaDespesa = "";
            while(!categoriasPermitidas.contains(categoriaDespesa.toLowerCase())) {
                System.out.println("Informe a categoria dentre as seguintes opções: \n" +
                        "Necessidades \n" +
                        "Desejos \n" +
                        "Investimentos");
                categoriaDespesa = leitor.next();

            }

            System.out.println("Informe o valor da despesa: ");
            double valorDespesa = leitor.nextDouble();

            Despesa despesa = new Despesa(descricaoDespesa, categoriaDespesa, valorDespesa);
            System.out.println(despesa);

            System.out.println("Deseja sair do sistema?\n" +
                    "1 - Sim\n" +
                    "2 - Não");
            finalizarFormulario = leitor.nextInt();

        }

    }
}
