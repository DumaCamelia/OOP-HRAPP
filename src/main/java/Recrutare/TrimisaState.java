package Recrutare;

public class TrimisaState implements AplicareState {

    @Override
    public void proceseaza(Aplicare aplicare) {
        System.out.println("Aplicarea trece în evaluare...");
        aplicare.setState(new InEvaluareState());
        aplicare.setStatus("IN_EVALUARE");
    }

    @Override
    public void accepta(Aplicare aplicare) {
        System.out.println("Nu poți accepta o aplicare care nu e evaluată!");
    }

    @Override
    public void respinge(Aplicare aplicare) {
        System.out.println("Aplicarea a fost respinsă direct.");
        aplicare.setState(new RespinsaState());
        aplicare.setStatus("RESPINSA");
    }

    @Override
    public String getStatusName() {
        return "TRIMISA";
    }
}