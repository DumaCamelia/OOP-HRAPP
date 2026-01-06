package Recrutare;
import Evaluare.EvaluareFactory;
import Recrutare.Aplicare;
import Recrutare.Job;
import Evaluare.EvaluationService;
import Evaluare.StrategieEvaluare;

public class RecruitmentService {
    private static final RecruitmentService INSTANCE = new RecruitmentService();
    private final EvaluationService evaluationService;
    private final EvaluareFactory evaluareFactory;

    private RecruitmentService() {
        this.evaluationService = new EvaluationService();
        this.evaluareFactory = new EvaluareFactory();
    }

    public static RecruitmentService getInstance() {
        return INSTANCE;
    }


    public void creeazaAnunt(Job job) {
        System.out.println("Anunț creat: " + job.getTitlu());
    }

    public void proceseazaAplicare(Aplicare aplicare) {
        System.out.println("Aplicare procesată cu ID: " + aplicare.getIdAplicare());
    }

    /*public void evalueazaCandidat(Candidat candidat, StrategieEvaluare strategie) {
        evaluationService.setStrategieEvaluare(strategie);
        double scorFinal = evaluationService.calculeazaScorFinal(candidat);
        evaluationService.genereazaRaportEvaluare(candidat);
    }*/

    public void evalueazaCandidat(Candidat candidat, String tipEvaluare) {
        StrategieEvaluare strategie = evaluareFactory.createStrategieEvaluare(tipEvaluare);
        evaluationService.setStrategieEvaluare(strategie);
        double scorFinal = evaluationService.calculeazaScorFinal(candidat);
        String raport = evaluationService.genereazaRaportEvaluare(candidat);
        System.out.println(raport);
    }

    public void selecteazaCandidatiEligibili(Job job) {
        System.out.println("Selecție candidați pentru: " + job.getTitlu());
    }
}
