package atv1;

public class Dinheiro extends FormaPagamento {
    private String moeda;

    public Dinheiro() { }

    public Dinheiro(double valor, String moeda) {
        this.setValor(valor);
        this.moeda = moeda;
    }

    public String getMoeda() {
        return moeda;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }

    public String toString() {
        String s = "Dinheiro " + "\n" +
                "Valor " +  getValor() + "\n" +
                "Moeda: " + getMoeda() ;
        return s;
    }


}
