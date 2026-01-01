package Interviu;

import lombok.Data;

import java.time.LocalDate;
@Data
public class Interviu {
    int idInterviu;
    LocalDate date;
    String tip;
    String status;
}
