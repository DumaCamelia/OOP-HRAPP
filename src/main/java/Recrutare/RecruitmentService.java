package Recrutare;
import Recrutare.Aplicare;
import Recrutare.Job;
import Evaluare.EvaluationService;
import Evaluare.StrategieEvaluare;

public class RecruitmentService {
    private static final RecruitmentService INSTANCE = new RecruitmentService();
    private final EvaluationService evaluationService;

    private RecruitmentService() {
        this.evaluationService = new EvaluationService();
    }

    public static RecruitmentService getInstance() {
        return INSTANCE;
    }


    public void creeazaAnunt(Job job) {
    }

    public void proceseazaAplicare(Aplicare aplicare) {
    }

    public void evalueazaCandidat(Candidat candidat, StrategieEvaluare strategie) {
        evaluationService.setStrategieEvaluare(strategie);
        double scorFinal = evaluationService.calculeazaScorFinal(candidat);
        evaluationService.genereazaRaportEvaluare(candidat);
    }

    public void selecteazaCandidatiEligibili(Job job) {
    }
}
