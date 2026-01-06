package Interviu;

public class ProgramatState implements InterviuState {

    @Override
    public void programeaza(Interviu interviu) {
        System.out.println("Interviul este deja programat!");
    }

    @Override
    public void confirma(Interviu interviu) {
        System.out.println("Candidatul a confirmat participarea.");
        interviu.setState(new ConfirmatState());
        interviu.setStatus("CONFIRMAT");
    }

    @Override
    public void anuleaza(Interviu interviu) {
        System.out.println("Interviul a fost anulat.");
        interviu.setState(new AnulatState());
        interviu.setStatus("ANULAT");
    }

    @Override
    public void finalizeaza(Interviu interviu) {
        System.out.println("Nu poți finaliza un interviu neconfirmat!");
    }

    @Override
    public String getStatusName() {
        return "PROGRAMAT";
    }
}