package Evaluare;

import Recrutare.Candidat;

public class EvaluareTehnica implements StrategieEvaluare {
    @Override
    public double calculeazaScor(Candidat candidat) {
        return 85.0;
    }
}
