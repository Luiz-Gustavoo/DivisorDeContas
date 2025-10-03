package br.com.divisorDeContas.DivisorDeContas.Principal;

import br.com.divisorDeContas.DivisorDeContas.Modelos.*;

import java.util.*;

public class Principal {
    Scanner leitor = new Scanner(System.in);
    public void exibeMenu() {
        System.out.println("Escolha a funcionalidade desejada\n" +
                "1 - Orçamento mensal\n" +
                "2 - Gerenciador de despesas\n"+
                "3 - Categorizar fatura do cartão");

        Integer funcionalidade = leitor.nextInt();

        switch(funcionalidade){
            case 1:
                orcamentoMensal();
                break;
            case 2:
                gerenciadorDeDespesa();
                break;
            case 3:
                categorizarFatura();
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

    private void categorizarFatura(){
        System.out.println("**********CATEGORIZAR FATURA**********\n");

        FormularioCartaoDeCredito formularioCartaoDeCredito = new FormularioCartaoDeCredito();
        CartaoDeCredito cartaoDeCredito = formularioCartaoDeCredito.formularioCartao();
        cartaoDeCredito.formularioDespesa();
        Map<String, Double> despesaCategorizada = cartaoDeCredito.categorizarDespesas();
        System.out.println(despesaCategorizada);
    }

}
