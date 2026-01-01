package Interviu;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class SlotOrar {
    LocalDateTime start;
    LocalDateTime end;
    boolean disponibil;
}
