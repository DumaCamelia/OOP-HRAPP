package Evaluare;


public class EvaluareFactory {

    public StrategieEvaluare createStrategieEvaluare(String tip) {
        switch (tip.toUpperCase()) {
            case "TEHNIC":
                return new EvaluareTehnica();

            case "HR":
                return new EvaluareHR();

            case "PSIHOLOGIC":
                return new EvaluarePsihologica();

            default:
                throw new IllegalArgumentException("Tip evaluare necunoscut: " + tip);
        }
    }

    public Evaluare createEvaluare(String tip, String comentarii) {
        Evaluare evaluare = new Evaluare();
        evaluare.setIdEvaluare(generateId());
        evaluare.setTip(tip);
        evaluare.setComentarii(comentarii);

        return evaluare;
    }

    private int generateId() {
        return (int) (Math.random() * 10000);
    }
}