package Interviu;

public class AnulatState implements InterviuState {

    @Override
    public void programeaza(Interviu interviu) {
        System.out.println("Reprogramare interviu anulat...");
        interviu.setState(new ProgramatState());
        interviu.setStatus("PROGRAMAT");
    }

    @Override
    public void confirma(Interviu interviu) {
        System.out.println("Nu poți confirma un interviu anulat!");
    }

    @Override
    public void anuleaza(Interviu interviu) {
        System.out.println("Interviul este deja anulat!");
    }

    @Override
    public void finalizeaza(Interviu interviu) {
        System.out.println("Nu poți finaliza un interviu anulat!");
    }

    @Override
    public String getStatusName() {
        return "ANULAT";
    }
}