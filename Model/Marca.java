package Model;
public class Marca {
    private int id;
    private String nomeMarca;

    public Marca() {}

    public Marca(int id, String nomeMarca) {
        this.id = id;
        this.nomeMarca = nomeMarca;
       
    }
    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeMarca() {
        return nomeMarca;
    }

    public void setNomeMarca(String nomeMarca) {
        this.nomeMarca = nomeMarca;
    }
}
