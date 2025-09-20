package br.com.divisorDeContas.DivisorDeContas.Modelos;

public class Salario {
    private double salario;
    private double investimentos;
    private double desejos;
    private double necessidades;

    public Salario(double salario) {
        this.salario = salario;
    }

    public void orcamento() {
        necessidades = salario * 0.5;
        desejos = salario * 0.2;
        investimentos = salario * 0.3;

        System.out.println("Seu orçamento: " +
                "\nNecessidades: " + necessidades +
                "\nDesejos: " + desejos +
                "\nInvestimentos: " + investimentos);

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getInvestimentos() {
        return investimentos;
    }

    public void setInvestimentos(double investimentos) {
        this.investimentos = investimentos;
    }

    public double getDesejos() {
        return desejos;
    }

    public void setDesejos(double desejos) {
        this.desejos = desejos;
    }

    public double getNecessidades() {
        return necessidades;
    }

    public void setNecessidades(double necessidades) {
        this.necessidades = necessidades;
    }

    @Override
    public String toString() {
        return "Salário: " + salario + "\n" +
                "Necessidades: " + necessidades + "\n" +
                "Desejos: " + desejos + "\n" +
                "Investimentos: " + investimentos;
    }
}
