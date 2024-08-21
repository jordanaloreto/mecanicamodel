package Model;
public class Veiculo {
    private int id;
    private String descricaoVeiculo;
    private String placa;
    private String anoModelo;
    private int idCliente;

    public Veiculo() {}

    public Veiculo(int id, String descricaoVeiculo, String placa, String anoModelo, int idCliente) {
        this.id = id;
        this.descricaoVeiculo = descricaoVeiculo;
        this.placa = placa;
        this.anoModelo = anoModelo;
        this.idCliente = idCliente;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricaoVeiculo() {
        return descricaoVeiculo;
    }

    public void setDescricaoVeiculo(String descricaoVeiculo) {
        this.descricaoVeiculo = descricaoVeiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(String anoModelo) {
        this.anoModelo = anoModelo;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
}
