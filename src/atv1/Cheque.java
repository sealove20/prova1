package atv1;

public class Cheque extends FormaPagamento {
    private String banco;
    private String nome;

    public Cheque() { }

    public Cheque(double valor, String banco, String nome) {
        this.setValor(valor);
        this.banco = banco;
        this.nome = nome;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        String s = "Cheque" + "\n" +
                "Valor " +  getValor() + "\n" +
                "Banco: " + getBanco() + "\n"+
                "Nome: " + getNome() + "\n";
        return s;
    }
}
