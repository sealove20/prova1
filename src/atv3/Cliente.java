package atv3;

import java.util.ArrayList;

public class Cliente {
    private ArrayList<Carro> carros = new ArrayList<>();
    private String nome;
    private String telefone;
    private float valorToal;

    public Cliente() { }

    public Cliente(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public void addCarro(Carro carro) {
        this.carros.add(carro);
        float subValor = 0;
        for(Carro c : this.getCarros())
            subValor += c.getValor();
        setValorToal(subValor);
    }

    public ArrayList<Carro> getCarros() {
        return carros;
    }

    public void setCarros(ArrayList<Carro> carros) {
        this.carros = carros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public float getValorToal() {
        return valorToal;
    }

    public void setValorToal(float valorToal) {
        this.valorToal = valorToal;
    }

    public String toString() {
        String s = "Nome: " + getNome() + "\n" +
                    "Telefone: " + getTelefone() + "\n" +
                    "Valor Total: " + getValorToal() + "\n" +
                    "Carros: " + getCarros() + "\n";
        return s;
    }
}
