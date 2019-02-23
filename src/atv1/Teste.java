package atv1;

import java.util.ArrayList;

public class Teste {

    public static ArrayList<CompraProduto> teste() {
        ArrayList<CompraProduto> compras = new ArrayList<>();
        compras.add(new CompraProduto("Maria",new Cartao(500,true, "20/2022")));
        compras.add(new CompraProduto("Jão",new Cartao(1000,true, "20/2023")));
        compras.add(new CompraProduto("Paulo",new Dinheiro(500, "Real")));
        compras.add(new CompraProduto("Luiz",new Dinheiro(2000, "Dolar")));
        compras.add(new CompraProduto("Luana",new Cheque(3000,"Inter", "Luana")));
        compras.add(new CompraProduto("Paula",new Cheque(1500,"Caixa", "Paula")));
        String chinelo = "Chinelo", shorts = "Shorts", oculos= "Óculos";
        for (CompraProduto c : compras) {
            c.addProduto(chinelo);
            c.addProduto("Shorts");
            c.addProduto("Óculos");
        }
        return compras;
    }

    public static void mostrarTodos(ArrayList<CompraProduto> compras) {
        for (CompraProduto c : compras)
            System.out.println(c);
    }

    public static void agruparFormaPagamento(ArrayList<CompraProduto> compras) {
        double subtotalDinheiro = 0, subTotalCheque = 0, subTotalCartao = 0;
        ArrayList<CompraProduto> dinheiro = new ArrayList<>();
        ArrayList<CompraProduto> cheque = new ArrayList<>();
        ArrayList<CompraProduto> cartao = new ArrayList<>();
        for (CompraProduto c : compras) {
            if (c.getFormaPagamento() instanceof Dinheiro) {
                subtotalDinheiro += c.getFormaPagamento().getValor();
                dinheiro.add(c);
            } else if (c.getFormaPagamento() instanceof Cheque) {
                subTotalCheque += c.getFormaPagamento().getValor();
                cheque.add(c);
            } else if(c.getFormaPagamento() instanceof Cartao) {
                subTotalCartao += c.getFormaPagamento().getValor();
                cartao.add(c);
            }
        }

        System.out.println("As instâncias de CompraProduto que pagaram com DINHEIRO foram: ");
        for(CompraProduto c : dinheiro)
            System.out.println(c);

        System.out.println("As instâncias de CompraProduto que pagaram com CHEQUE foram: ");
        for(CompraProduto c : cheque)
            System.out.println(c);
        System.out.println("As instâncias de CompraProduto que pagaram com CARTÃO foram: ");
        for(CompraProduto c : cartao)
            System.out.println(c);


        System.out.println("O subtotal de Dinheiro foi: " + subtotalDinheiro);
        System.out.println("O subtotal de Chegue foi: " + subTotalCheque);
        System.out.println("O subtotal de Cartão foi: " + subTotalCartao);
    }


    public static void main(String[] args) {
        mostrarTodos(teste());
        agruparFormaPagamento(teste());
    }
}
