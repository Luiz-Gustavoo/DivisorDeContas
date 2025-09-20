package br.com.divisorDeContas.DivisorDeContas.Modelos;

import java.util.*;

public class FormularioDespesa {
    Scanner leitor = new Scanner(System.in);
    private Set<String> categoriasPermitidas = new HashSet<String>(Arrays.asList("necessidades", "desejos", "investimentos"));
    List<Despesa> listaDeDespesas = new ArrayList<>();
    String descricaoDespesa;
    double valorDespesa;

    public List<Despesa> formularioDespesa(){
        int finalizarFormulario = 0;
        while(finalizarFormulario != 1) {
            System.out.println("Informe a descrição: ");
            descricaoDespesa = leitor.next();

            String categoriaDespesa = "";
            while(!categoriasPermitidas.contains(categoriaDespesa.toLowerCase())) {
                System.out.println("Informe a categoria dentre as seguintes opções: \n" +
                        "Necessidades \n" +
                        "Desejos \n" +
                        "Investimentos");
                categoriaDespesa = leitor.next();
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
