package Evaluare;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class Rezultat {
    int idRezultat;
    double scor;
    LocalDateTime dataEvaluare;
}
