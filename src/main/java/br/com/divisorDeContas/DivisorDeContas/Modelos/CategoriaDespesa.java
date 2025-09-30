package br.com.divisorDeContas.DivisorDeContas.Modelos;

public enum CategoriaDespesa {
    NECESSIDADE("necessidade"),
    DESEJO("desejo"),
    INVESTIMENTO("investimento");

    private String categoriaDespesa;

    CategoriaDespesa(String categoriaDespesa) {
        this.categoriaDespesa = categoriaDespesa;
    }

    public  String getCategoriaDespesa() {
        return categoriaDespesa;
    }

    public static CategoriaDespesa fromString(String texto){
        for(CategoriaDespesa categoriaDespesa: CategoriaDespesa.values()){
            if(categoriaDespesa.categoriaDespesa.equalsIgnoreCase(texto)){
                return categoriaDespesa;
            }
        }
        throw new IllegalArgumentException("Categoria inválida: " + texto);
    }
}
