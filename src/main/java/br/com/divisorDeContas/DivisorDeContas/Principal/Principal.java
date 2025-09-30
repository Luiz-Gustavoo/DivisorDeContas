package br.com.divisorDeContas.DivisorDeContas.Principal;

import br.com.divisorDeContas.DivisorDeContas.Modelos.Despesa;
import br.com.divisorDeContas.DivisorDeContas.Modelos.FormularioDespesa;
import br.com.divisorDeContas.DivisorDeContas.Modelos.FormularioSalario;
import br.com.divisorDeContas.DivisorDeContas.Modelos.Salario;

import java.util.*;

public class Principal {
    public void exibeMenu() {
        System.out.println("**********ORÇAMENTO MENSAL**********\n");

        FormularioSalario formularioSalario = new FormularioSalario();
        Salario salario = formularioSalario.formularioSalario();
        salario.orcamento();

        System.out.println("**********GERENCIADOR DE DESPESAS**********\n");

        FormularioDespesa formularioDespesa = new FormularioDespesa();
        List<Despesa> listaDeDespesas = formularioDespesa.formularioDespesa();
        System.out.println("Listagem de despesas: ");
        listaDeDespesas.forEach(System.out::println);

    }
}
