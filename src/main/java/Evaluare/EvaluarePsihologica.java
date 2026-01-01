package Evaluare;

import Recrutare.Candidat;

public class EvaluarePsihologica implements StrategieEvaluare {

    @Override
    public double calculeazaScor(Candidat candidat) {
        return 80.0;
    }
}
