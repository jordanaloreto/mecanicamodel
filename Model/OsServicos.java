package Model;
public class OsServicos {
    private int idOs;
    private int idServicos;

    public OsServicos(int idOs, int idServicos) {
        this.idOs = idOs;
        this.idServicos = idServicos;    
    }
    // Getters e Setters
    public int getIdOs() {
        return idOs;
    }

    public void setIdOs(int idOs) {
        this.idOs = idOs;
    }

    public int getIdServicos() {
        return idServicos;
    }

    public void setIdServicos(int idServicos) {
        this.idServicos = idServicos;
    }
}
