package Interviu;

import Recrutare.Candidat;
import java.time.LocalDate;

public class InterviuFactory {

    public Interviu createInterviu(String tip, Candidat candidat) {
        Interviu interviu = new Interviu();
        interviu.setTip(tip);
        interviu.setStatus("PROGRAMAT");
        interviu.setDate(LocalDate.now().plusDays(7)); // default: peste o săptămână

        switch (tip.toUpperCase()) {
            case "TEHNIC":
                interviu.setIdInterviu(generateId());
                System.out.println("Interviu tehnic creat pentru: " + candidat.getName());
                break;

            case "HR":
                interviu.setIdInterviu(generateId());
                System.out.println("Interviu HR creat pentru: " + candidat.getName());
                break;

            case "PSIHOLOGIC":
                interviu.setIdInterviu(generateId());
                System.out.println("Interviu psihologic creat pentru: " + candidat.getName());
                break;

            case "FINAL":
                interviu.setIdInterviu(generateId());
                System.out.println("Interviu final creat pentru: " + candidat.getName());
                break;

            default:
                throw new IllegalArgumentException("Tip interviu necunoscut: " + tip);
        }

        return interviu;
    }

    private int generateId() {
        return (int) (Math.random() * 10000);
    }
}