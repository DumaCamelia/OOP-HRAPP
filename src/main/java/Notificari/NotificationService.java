package Notificari;

public class NotificationService {

    void trimiteNotificare(Notificare notificare){
        System.out.println("Trimitere notificare catre " + notificare.getDestinatar() + " cu mesajul: " + notificare.getMesaj());
    }

    void actualizeazaDashboard(Notificare notificare){
        System.out.println("Actualizare notificare ID: " + notificare.getIdNotificare());
    }
}
