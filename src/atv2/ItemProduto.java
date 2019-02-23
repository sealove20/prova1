package atv2;

import java.util.ArrayList;

public class ItemProduto {
    private int estoque;
    private ArrayList<ItemProduto> itens = new ArrayList<>();
    private String nome;
    private double preco_custo;
    private double preco_venda;


    public ItemProduto() { }

    public ItemProduto(int estoque, String nome, double preco_custo, double preco_venda) {
        this.estoque = estoque;
        this.nome = nome;
        this.preco_custo = preco_custo;
        this.preco_venda = preco_venda;
    }

    public void addItem(ItemProduto produto) {
        itens.add(produto);
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public ArrayList<ItemProduto> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItemProduto> itens) {
        this.itens = itens;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco_custo() {
        return preco_custo;
    }

    public void setPreco_custo(double preco_custo) {
        this.preco_custo = preco_custo;
    }

    public double getPreco_venda() {
        return preco_venda;
    }

    public void setPreco_venda(double preco_venda) {
        this.preco_venda = preco_venda;
    }

    public String toString() {
        String s = getNome() + "   -   " +
                + getEstoque() + " unidades - " +
                " Custo/Venda: " + getPreco_custo() + "  / " + getPreco_venda();

                if(this.getItens() != null) {
                    for(ItemProduto item : this.getItens())
                        s += "\n               " + item.getNome()  + "  - Custo: " +  item.getPreco_custo() ;

                }
        return s;
    }
}
