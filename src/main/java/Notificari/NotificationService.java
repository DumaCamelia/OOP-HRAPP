package Notificari;

public class NotificationService {

    public void trimiteNotificare(Notificare notificare) {
        System.out.println("Trimitere notificare catre " + notificare.getDestinatar()
                + " cu mesajul: " + notificare.getMesaj());
    }

    public void actualizeazaDashboard(Notificare notificare) {
        System.out.println("Actualizare dashboard - notificare ID: " + notificare.getIdNotificare());
    }
}
