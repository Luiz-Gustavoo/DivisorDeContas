package br.com.divisorDeContas.DivisorDeContas.Modelos;

import java.util.*;

public class FormularioDespesa {
    Scanner leitor = new Scanner(System.in);
    List<Despesa> listaDeDespesas = new ArrayList<>();
    String descricaoDespesa;
    double valorDespesa;

    public List<Despesa> formularioDespesa(){

        int finalizarFormulario = 0;
        while(finalizarFormulario != 1) {
            System.out.println("Informe a descrição: ");
            descricaoDespesa = leitor.next();

            CategoriaDespesa categoriaDespesa = null;
            try {
                System.out.println("Informe a categoria dentre as seguintes opções: \n" +
                        "Necessidade \n" +
                        "Desejo \n" +
                        "Investimento");
                String categoriaInformada = leitor.next();
                categoriaDespesa = CategoriaDespesa.fromString(categoriaInformada);

            } catch(IllegalArgumentException e ){
                System.out.println("Houve um erro: " + e.getMessage());
            }

            System.out.println("Informe o valor da despesa: ");
            valorDespesa = leitor.nextDouble();

            Despesa despesa = new Despesa(descricaoDespesa, categoriaDespesa, valorDespesa);
            listaDeDespesas.add(despesa);

            System.out.println("Deseja sair do sistema?\n" +
                    "1 - Sim\n" +
                    "2 - Não");
            finalizarFormulario = leitor.nextInt();
        }
        return listaDeDespesas;
    }
}
