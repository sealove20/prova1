package atv2;

import java.util.ArrayList;

public class Teste {

    // VERIFICA ATRAVÉS DO NOME SE EXISTE UMA MESMA INSTANCIA DE UM OBJETO NO ARRAYLIST
    public static boolean verificaInstancia(ArrayList<ItemProduto> produtos, String nome) {
        for(ItemProduto p : produtos)
            if(p.getNome().toLowerCase().equals(nome.toLowerCase()))
                return true;
        return false;
    }

    public static ItemProduto fazInstancia(int estoque, String nome, double preco_custo, double preco_venda){
        return new ItemProduto(estoque,nome, preco_custo, preco_venda);
    }

    public static void criaArray() {
        ArrayList<ItemProduto> produtos = new ArrayList<>();
        int estoque = 0;
        String nome = "";
        double preco_custo = 0, preco_venda = 0;

        // CADASTRA TECLADO
        ItemProduto placaMae = fazInstancia(5, "TECLADO MTEC 105 TECLAS", 20, 30);
        if(verificaInstancia(produtos, placaMae.getNome()))
            System.out.println("Produto já cadastrado");
        else
            produtos.add(placaMae);

        // TENTANDO ADICIONAR O TECLADO NOVAMENTE
        if(verificaInstancia(produtos,placaMae.getNome()))
            System.out.println("Produto já cadastrado");
        else
            produtos.add(placaMae);

        // CADASTRA HD
        ItemProduto hdSata3 = fazInstancia(3, "HD SATA3 3.5 1TB SEAGATE 7200RPM", 200, 400);
        if(verificaInstancia(produtos,hdSata3.getNome()))
            System.out.println("Produto já cadastrado");
        else
            produtos.add(hdSata3);

        // CADASTRA SSD
        ItemProduto ssd = fazInstancia(6, "HD SSD SATA3 2.5 500GB", 220, 320);
        if(verificaInstancia(produtos,ssd.getNome()))
            System.out.println("Produto já cadastrado");
        else
            produtos.add(ssd);

        // CADASTRA MEMORIA
        ItemProduto memoria = fazInstancia(6, "MEMORIA DD4 8GB 2400MHZ", 80, 120);
        if(verificaInstancia(produtos,memoria.getNome()))
            System.out.println("Produto já cadastrado");
        else
            produtos.add(memoria);

        // PRODUTO COMPOSTO COMPUTADOR 1 COM 2 MEMÓRIAS
        ItemProduto computador = fazInstancia(2, "COMPUTADOR POWER1", 2800, 6000);
        computador.addItem(placaMae);
        computador.addItem(hdSata3);
        computador.addItem(ssd);
        computador.addItem(memoria);
        computador.addItem(memoria);

        if(verificaInstancia(produtos,computador.getNome()))
            System.out.println("Produto já cadastrado");
        else
            produtos.add(computador);

        // PRODUTO COMPOSTO COMPUTADOR 2 COM 1 MEMÓRIA
        ItemProduto computador2 = fazInstancia(2, "COMPUTADOR POWER2", 2800, 6000);
        computador2.addItem(placaMae);
        computador2.addItem(hdSata3);
        computador2.addItem(ssd);
        computador2.addItem(memoria);

        if(verificaInstancia(produtos,computador2.getNome()))
            System.out.println("Produto já cadastrado");
        else
            produtos.add(computador2);

        for (ItemProduto produto : produtos)
            System.out.println(produto);

    }

    public static void main(String[] args) {
        criaArray();

    }
}
