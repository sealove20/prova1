package atv1;

public class Cartao extends FormaPagamento {
    private boolean credito;
    private String data_expiracao;

    public Cartao() { }

    public Cartao(double valor, boolean credito, String data_expiracao) {
        this.setValor(valor);
        this.credito = credito;
        this.data_expiracao = data_expiracao;
    }

    public boolean isCredito() {
        return credito;
    }

    public void setCredito(boolean credito) {
        this.credito = credito;
    }

    public String getData_expiracao() {
        return data_expiracao;
    }

    public void setData_expiracao(String data_expiracao) {
        this.data_expiracao = data_expiracao;
    }

    public String toString() {
        String s = "Cartão" + "\n" +
                "Valor " +  getValor() + "\n" +
                "Data de expiração: " + getData_expiracao() + "\n" ;

        if(isCredito())
            s += "O cartão Possui crédito";
        else
            s += "O cartão não possui crédito";
        return s;
    }
}
