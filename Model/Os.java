package Model;
import java.util.Date;

public class Os {
    private int id;
    private int numeroOs;
    private Date dataAberturaOs;
    private Date dataEncerramentoOs;
    private double valorTotal;
    private Cliente cliente;       // Objeto Cliente
    private Mecanico mecanico;     // Objeto Mecanico
    private Veiculo veiculo;       // Objeto Veiculo
    private Pecas pecas;           // Objeto Pecas
    private Servicos servicos;     // Objeto Servicos

    // Construtor com parâmetros (sem ID)
    public Os(int numeroOs, Date dataAberturaOs, Date dataEncerramentoOs, double valorTotal, 
              Cliente cliente, Mecanico mecanico, Veiculo veiculo, Pecas pecas, Servicos servicos) {
        this.numeroOs = numeroOs;
        this.dataAberturaOs = dataAberturaOs;
        this.dataEncerramentoOs = dataEncerramentoOs;
        this.valorTotal = valorTotal;
        this.cliente = cliente;
        this.mecanico = mecanico;
        this.veiculo = veiculo;
        this.pecas = pecas;
        this.servicos = servicos;
    }

    // Construtor com parâmetros (inclui ID)
    public Os(int id, int numeroOs, Date dataAberturaOs, Date dataEncerramentoOs, double valorTotal, 
              Cliente cliente, Mecanico mecanico, Veiculo veiculo, Pecas pecas, Servicos servicos) {
        this.id = id;
        this.numeroOs = numeroOs;
        this.dataAberturaOs = dataAberturaOs;
        this.dataEncerramentoOs = dataEncerramentoOs;
        this.valorTotal = valorTotal;
        this.cliente = cliente;
        this.mecanico = mecanico;
        this.veiculo = veiculo;
        this.pecas = pecas;
        this.servicos = servicos;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroOs() {
        return numeroOs;
    }

    public void setNumeroOs(int numeroOs) {
        this.numeroOs = numeroOs;
    }

    public Date getDataAberturaOs() {
        return dataAberturaOs;
    }

    public void setDataAberturaOs(Date dataAberturaOs) {
        this.dataAberturaOs = dataAberturaOs;
    }

    public Date getDataEncerramentoOs() {
        return dataEncerramentoOs;
    }

    public void setDataEncerramentoOs(Date dataEncerramentoOs) {
        this.dataEncerramentoOs = dataEncerramentoOs;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Pecas getPecas() {
        return pecas;
    }

    public void setPecas(Pecas pecas) {
        this.pecas = pecas;
    }

    public Servicos getServicos() {
        return servicos;
    }

    public void setServicos(Servicos servicos) {
        this.servicos = servicos;
    }
}
