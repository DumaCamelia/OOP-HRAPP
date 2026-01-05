package Notificari;

import Recrutare.Aplicare;
import Recrutare.Candidat;

public class NotificationFacade {

    private final NotificationService notificationService;
    private final EventListener eventListener;
    private int nextId = 1;

    public NotificationFacade() {
        this.notificationService = new NotificationService();
        this.eventListener = new EventListener();
    }

    public void notificaAplicareTrimisa(Candidat candidat, Aplicare aplicare) {
        String mesaj = "Aplicarea a fost inregistrata pentru candidatul: " + candidat.getName();
        Notificare notif = new Notificare(nextId++, candidat, candidat.getEmail(), mesaj);

        notificationService.trimiteNotificare(notif);
        notificationService.actualizeazaDashboard(notif);
        eventListener.onNotificareTrimisa(notif);
    }

    public void notificaRezultatEvaluare(Candidat candidat, double scor) {
        String mesaj = "Scor evaluare: " + scor + " pentru candidatul: " + candidat.getName();
        Notificare notif = new Notificare(nextId++, candidat, candidat.getEmail(), mesaj);

        notificationService.trimiteNotificare(notif);
        notificationService.actualizeazaDashboard(notif);
        eventListener.onNotificareTrimisa(notif);
    }
}
