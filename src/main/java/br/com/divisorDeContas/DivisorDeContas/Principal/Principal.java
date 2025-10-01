package br.com.divisorDeContas.DivisorDeContas.Principal;

import br.com.divisorDeContas.DivisorDeContas.Modelos.Despesa;
import br.com.divisorDeContas.DivisorDeContas.Modelos.FormularioDespesa;
import br.com.divisorDeContas.DivisorDeContas.Modelos.FormularioSalario;
import br.com.divisorDeContas.DivisorDeContas.Modelos.Salario;

import java.util.*;

public class Principal {
    Scanner leitor = new Scanner(System.in);
    public void exibeMenu() {
        System.out.println("Escolha a funcionalidade desejada\n" +
                "1 - Orçamento mensal\n" +
                "2 - Gerenciador de despesas");

        Integer funcionalidade = leitor.nextInt();

        switch(funcionalidade){
            case 1:
                orcamentoMensal();
                break;
            case 2:
                gerenciadorDeDespesa();
                break;
            default:
                break;
        }
    }

    private void orcamentoMensal(){
        System.out.println("**********ORÇAMENTO MENSAL**********\n");

        FormularioSalario formularioSalario = new FormularioSalario();
        Salario salario = formularioSalario.formularioSalario();
        salario.orcamento();
    }

    private void gerenciadorDeDespesa(){
        System.out.println("**********GERENCIADOR DE DESPESAS**********\n");

        FormularioDespesa formularioDespesa = new FormularioDespesa();
        List<Despesa> listaDeDespesas = formularioDespesa.formularioDespesa();
        System.out.println("Listagem de despesas: ");
        listaDeDespesas.forEach(System.out::println);
    }

}
