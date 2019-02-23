package atv3;

public class Carro {
    private Categoria categoria;
    private Marca marca;
    private String modelo;
    private float valor;

    public Carro() { }

    public Carro(Categoria categoria, Marca marca, String modelo, float valor) {
        this.categoria = categoria;
        this.marca = marca;
        this.modelo = modelo;
        this.valor = valor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }


    public String toString() {
        String s = "\n Categoria: " + getCategoria() + "\n" +
                "Marca: " + getMarca() + "\n" +
                "Modelo " + getModelo() + "\n" +
                "Valor " + getValor() + "\n";
        return s;
    }
}
