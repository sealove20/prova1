package atv3;

public class Marca {
    private String nomeMarca;

    public Marca() { }

    public Marca(String nomeMarca) {
        this.nomeMarca = nomeMarca;
    }

    public String getNomeMarca() {
        return nomeMarca;
    }

    public void setNomeMarca(String nomeMarca) {
        this.nomeMarca = nomeMarca;
    }

    public String toString() {
        String s = getNomeMarca();
        return s;
    }
}
