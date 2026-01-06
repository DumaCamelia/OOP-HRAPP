package Recrutare;

public class RespinsaState implements AplicareState {

    @Override
    public void proceseaza(Aplicare aplicare) {
        System.out.println("Nu poți procesa o aplicare respinsă!");
    }

    @Override
    public void accepta(Aplicare aplicare) {
        System.out.println("Nu poți accepta o aplicare respinsă!");
    }

    @Override
    public void respinge(Aplicare aplicare) {
        System.out.println("Aplicarea este deja respinsă!");
    }

    @Override
    public String getStatusName() {
        return "RESPINSA";
    }
}