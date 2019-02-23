package atv1;

import java.util.ArrayList;

public class CompraProduto {
    private String cliente;
    private FormaPagamento formaPagamento;
    private ArrayList<String> produtos = new ArrayList<>();

    public CompraProduto() { }

    public CompraProduto(String cliente, FormaPagamento formaPagamento) {
        this.cliente = cliente;
        this.formaPagamento = formaPagamento;
    }

    public void addProduto(String produto) {
        produtos.add(produto);
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public ArrayList<String> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<String> produtos) {
        this.produtos = produtos;
    }

    public String toString() {
        String s = "Cliente: " + getCliente() +  "\n" +
                "Forma de Pagamento: " + getFormaPagamento() + "\n" +
                "Produtos: ";

        for(String p : produtos)
            s +=  p + "\n";

        return s;
    }
}
