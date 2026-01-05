package Notificari;

import Recrutare.Candidat;

public class Notificare {
    private int idNotificare;
    private String destinatar;
    private String mesaj;
    private Candidat candidat;

    public Notificare(int idNotificare, Candidat candidat, String destinatar, String mesaj) {
        this.idNotificare = idNotificare;
        this.candidat = candidat;
        this.destinatar = destinatar;
        this.mesaj = mesaj;
    }

    public int getIdNotificare() {
        return idNotificare;
    }

    public String getDestinatar() {
        return destinatar;
    }

    public String getMesaj() {
        return mesaj;
    }

    public Candidat getCandidat() {
        return candidat;
    }
}
