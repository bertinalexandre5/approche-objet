package fr.diginamic.recensement.services;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TopVillesDepartement extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("Veuillez renseigner le code du département");
        String codeDep = scanner.nextLine();
        List<Ville> villesDuDepartement = new ArrayList<>();

        for (Ville ville : recensement.getVilles()) {
            if (ville.getDepartement().equals(codeDep)) {
                villesDuDepartement.add(ville);
            }
        }
        if (villesDuDepartement.isEmpty()) {
            System.out.println("Département introuvable : " + codeDep);
            return;
        }
        villesDuDepartement.sort(Comparator.comparingInt(Ville::getPopulation).reversed());

        System.out.println("Les 10 villes les plus peuplées du département " + codeDep + " :");
        for (int i = 0; i < 10 && i < villesDuDepartement.size(); i++) {
            Ville ville = villesDuDepartement.get(i);
            System.out.println((i + 1) + ". " + ville.getNomCommune()
                    + " - " + ville.getPopulation() + " habitants");
        }
    }
}
