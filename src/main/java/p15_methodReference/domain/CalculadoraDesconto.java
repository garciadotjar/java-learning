package p15_methodReference.domain;

public class CalculadoraDesconto {
    private double percentDesconto;

    public CalculadoraDesconto(double percentDesconto) {
        this.percentDesconto = percentDesconto*0.01;
    }

    public double aplicarDesconto(Manga m){
        return m.getPreco()*percentDesconto;
    }


}
