package br.com.divisorDeContas.DivisorDeContas.Principal;

import br.com.divisorDeContas.DivisorDeContas.Modelos.Despesa;
import br.com.divisorDeContas.DivisorDeContas.Modelos.FormularioDespesa;

import java.util.*;

public class Principal {
    public Scanner leitor = new Scanner(System.in);


    public void exibeMenu() {
        System.out.println("**********GERENCIADOR DE DESPESAS**********\n");

        FormularioDespesa formularioDespesa = new FormularioDespesa();
        List<Despesa> listaDeDespesas = formularioDespesa.formularioDespesa();
        System.out.println("Listagem de despesas: ");
        listaDeDespesas.forEach(System.out::println);

    }
}
