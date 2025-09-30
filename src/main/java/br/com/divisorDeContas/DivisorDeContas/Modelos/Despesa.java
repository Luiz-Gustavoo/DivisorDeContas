package br.com.divisorDeContas.DivisorDeContas.Modelos;

public class Despesa {
    private String descricao;
    private String categoria;
    private double valor;

    public Despesa(String descricao, CategoriaDespesa categoriaDespesa, double valor) {
        this.descricao = descricao;
        this.categoria = categoriaDespesa.getCategoriaDespesa();
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getValor() {
        return valor;
    }

    public String toString() {
        return "\nDescrição: " + descricao + "\n" +
                "Categoria: " + categoria + "\n" +
                "Valor: " + valor;
    }
}
