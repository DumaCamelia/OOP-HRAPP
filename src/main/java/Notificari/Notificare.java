package Notificari;

import lombok.Data;
import java.time.LocalDate;

@Data
public class Notificare {
    int idNotificare;
    String tip;
    String mesaj;
    String destinatar;
    LocalDate dataTrimiterii;
}
