package Recrutare;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class Aplicare {
    int idAplicare;
    LocalDateTime dataAplicare;
    String status;
}
