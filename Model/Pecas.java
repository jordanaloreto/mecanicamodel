package Model;
public class Pecas {
    private int id;
    private String descricao;
    private double preco;
    private Marca marca;  // Armazena o objeto Marca

    // Construtor padrão
    public Pecas() {}

    // Construtor com parâmetros
    public Pecas(int id, String descricao, double preco, Marca marca) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
        this.marca = marca;  // Atribui o objeto Marca
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Marca getMarca() {  // Retorna o objeto Marca
        return marca;
    }

    public void setMarca(Marca marca) {  // Atribui o objeto Marca
        this.marca = marca;
    }
}
