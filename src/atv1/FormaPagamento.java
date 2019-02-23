package atv1;

public abstract class FormaPagamento {
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    abstract public String toString();
}
