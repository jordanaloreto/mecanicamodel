package Model;
public class Servicos {
    private int id;
    private String descricaoServico;
    private double preco;

    public Servicos() {}

    public Servicos(int id, String descricaoServico, Double preco) {
        this.id = id;
        this.descricaoServico = descricaoServico;
        this.preco = preco;       
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricaoServico() {
        return descricaoServico;
    }

    public void setDescricaoServico(String descricaoServico) {
        this.descricaoServico = descricaoServico;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
