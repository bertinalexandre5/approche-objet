package fr.diginamic.recensement.services;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TopVillesRegion extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("Veuillez renseigner le nom de la région");
        String choixVilleRegion = scanner.nextLine();
        List<Ville> villesRegion = new ArrayList<>();

        for (Ville ville : recensement.getVilles()) {
            if (ville.getRegion().equals(choixVilleRegion)) {
                villesRegion.add(ville);
            }
        }
        if (villesRegion.isEmpty()) {
            System.out.println("Région introuvable : " + choixVilleRegion);
            return;
        }
        villesRegion.sort(Comparator.comparingInt(Ville::getPopulation).reversed());

        System.out.println("Les 10 villes les plus peuplées de la région :  " + choixVilleRegion + " :");
        for (int i = 0; i < 10 && i < villesRegion.size(); i++) {
            Ville ville = villesRegion.get(i);
            System.out.println((i + 1) + ". " + ville.getNomCommune()
                    + " - " + ville.getPopulation() + " habitants");
        }

    }
}
