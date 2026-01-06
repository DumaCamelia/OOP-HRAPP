package Recrutare;

public class AcceptataState implements AplicareState {

    @Override
    public void proceseaza(Aplicare aplicare) {
        System.out.println("Aplicarea este deja acceptată!");
    }

    @Override
    public void accepta(Aplicare aplicare) {
        System.out.println("Aplicarea este deja acceptată!");
    }

    @Override
    public void respinge(Aplicare aplicare) {
        System.out.println("Nu poți respinge o aplicare deja acceptată!");
    }

    @Override
    public String getStatusName() {
        return "ACCEPTATA";
    }
}