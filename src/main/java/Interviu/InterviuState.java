package Interviu;

public interface InterviuState {
    void programeaza(Interviu interviu);
    void confirma(Interviu interviu);
    void anuleaza(Interviu interviu);
    void finalizeaza(Interviu interviu);
    String getStatusName();
}