package Recrutare;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class Aplicare {
    int idAplicare;
    LocalDateTime dataAplicare;
    String status;

    // State Pattern
    private AplicareState state;

    public Aplicare() {
        this.state = new TrimisaState();
        this.status = "TRIMISA";
        this.dataAplicare = LocalDateTime.now();
    }

    public void proceseaza() {
        state.proceseaza(this);
    }

    public void accepta() {
        state.accepta(this);
    }

    public void respinge() {
        state.respinge(this);
    }

    public String getStatusCurent() {
        return state.getStatusName();
    }
}