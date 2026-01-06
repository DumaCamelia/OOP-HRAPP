package Interviu;

import lombok.Data;
import java.time.LocalDate;

@Data
public class Interviu {
    int idInterviu;
    LocalDate date;
    String tip;
    String status;

    // State Pattern
    private InterviuState state;

    public Interviu() {
        this.state = new ProgramatState();
        this.status = "PROGRAMAT";
    }

    public void programeaza() {
        state.programeaza(this);
    }

    public void confirma() {
        state.confirma(this);
    }

    public void anuleaza() {
        state.anuleaza(this);
    }

    public void finalizeaza() {
        state.finalizeaza(this);
    }

    public String getStatusCurent() {
        return state.getStatusName();
    }
}