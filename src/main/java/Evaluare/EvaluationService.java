package Evaluare;

import Recrutare.Candidat;

public class EvaluationService {

    private StrategieEvaluare strategieEvaluare;

    public void setStrategieEvaluare(StrategieEvaluare strategieEvaluare) {
        this.strategieEvaluare = strategieEvaluare;
    }

    public double calculeazaScorFinal(Candidat candidat) {
        if (strategieEvaluare == null) {
            throw new IllegalStateException("Strategia de evaluare nu este setată");
        }
        return strategieEvaluare.calculeazaScor(candidat);
    }

    public String genereazaRaportEvaluare(Candidat candidat) {
        double scor = calculeazaScorFinal(candidat);
        return "Candidat: " + candidat.getName() + " | Scor final: " + scor;
    }
}
