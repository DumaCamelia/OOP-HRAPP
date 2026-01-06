package Interviu;

public class ConfirmatState implements InterviuState {

    @Override
    public void programeaza(Interviu interviu) {
        System.out.println("Interviul este deja confirmat!");
    }

    @Override
    public void confirma(Interviu interviu) {
        System.out.println("Interviul este deja confirmat!");
    }

    @Override
    public void anuleaza(Interviu interviu) {
        System.out.println("Interviul confirmat a fost anulat.");
        interviu.setState(new AnulatState());
        interviu.setStatus("ANULAT");
    }

    @Override
    public void finalizeaza(Interviu interviu) {
        System.out.println("Interviul a fost finalizat cu succes.");
        interviu.setState(new FinalizatState());
        interviu.setStatus("FINALIZAT");
    }

    @Override
    public String getStatusName() {
        return "CONFIRMAT";
    }
}