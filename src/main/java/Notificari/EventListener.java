package Notificari;

public class EventListener {

    public void onNotificareTrimisa(Notificare notificare) {
        System.out.println("Event: Notificare trimisa (ID=" + notificare.getIdNotificare() + ")");
    }
}
