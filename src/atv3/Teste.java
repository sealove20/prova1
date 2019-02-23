package atv3;

import java.util.ArrayList;

public class Teste {

    public static void mostraTudo(ArrayList<Cliente> clientes) {
        for(Cliente c : clientes) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        Marca ford = new Marca("Ford");
        Marca volvo= new Marca("Volvo");
        Categoria sedan = new Categoria("Sedan");
        Categoria esportivo = new Categoria("Esportivo");
        Carro carro1 = new Carro(sedan, ford, "V3", 15000);
        Carro carro2 = new Carro(esportivo, volvo, "H73U", 40000);

        clientes.add(new Cliente("Marina", "66981204567"));
        clientes.add(new Cliente("João", "66990123456"));
        clientes.add(new Cliente("Leona", "66123456789"));
        clientes.add(new Cliente("Lizzandra", "6609876432"));

        for(Cliente c : clientes) {
            c.addCarro(carro1);
            c.addCarro(carro2);
        }

        mostraTudo(clientes);
    }
}
