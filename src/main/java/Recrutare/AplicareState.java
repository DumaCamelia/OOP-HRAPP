package Recrutare;

public interface AplicareState {
    void proceseaza(Aplicare aplicare);
    void accepta(Aplicare aplicare);
    void respinge(Aplicare aplicare);
    String getStatusName();
}