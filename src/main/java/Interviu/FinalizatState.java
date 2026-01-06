package Interviu;

public class FinalizatState implements InterviuState {

    @Override
    public void programeaza(Interviu interviu) {
        System.out.println("Nu poți reprograma un interviu finalizat!");
    }

    @Override
    public void confirma(Interviu interviu) {
        System.out.println("Interviul este deja finalizat!");
    }

    @Override
    public void anuleaza(Interviu interviu) {
        System.out.println("Nu poți anula un interviu finalizat!");
    }

    @Override
    public void finalizeaza(Interviu interviu) {
        System.out.println("Interviul este deja finalizat!");
    }

    @Override
    public String getStatusName() {
        return "FINALIZAT";
    }
}