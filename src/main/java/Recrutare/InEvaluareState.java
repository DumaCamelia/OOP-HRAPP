package Recrutare;

public class InEvaluareState implements AplicareState {

    @Override
    public void proceseaza(Aplicare aplicare) {
        System.out.println("Aplicarea este deja în evaluare!");
    }

    @Override
    public void accepta(Aplicare aplicare) {
        System.out.println("Aplicarea a fost acceptată! Programare interviu...");
        aplicare.setState(new AcceptataState());
        aplicare.setStatus("ACCEPTATA");
    }

    @Override
    public void respinge(Aplicare aplicare) {
        System.out.println("Aplicarea a fost respinsă după evaluare.");
        aplicare.setState(new RespinsaState());
        aplicare.setStatus("RESPINSA");
    }

    @Override
    public String getStatusName() {
        return "IN_EVALUARE";
    }
}