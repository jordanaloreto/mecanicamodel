package Model;
import java.util.Date;

public class OsPecas {
    private int idOs;
    private int idPecas;


    public OsPecas(int idOs, int idPecas) {
        this.idOs = idOs;
        this.idPecas = idPecas;    
    }
    // Getters e Setters
    public int getIdOs() {
        return idOs;
    }

    public void setIdOs(int idOs) {
        this.idOs = idOs;
    }

    public int getIdPecas() {
        return idPecas;
    }

    public void setIdPecas(int idPecas) {
        this.idPecas = idPecas;
    }
}
