package fr.diginamic.recensement.services;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

import java.util.*;

public class TopVillesPeuplees extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {

        List<Ville> villes = new ArrayList<>(recensement.getVilles());

        villes.sort(Comparator.comparingInt(Ville::getPopulation).reversed());
        System.out.println("Les 10 villes les plus peuplées sont : ");

        for (int i =0; i <10; i++) {
            Ville ville = villes.get(i);
            System.out.println((i + 1) + ". "+ ville.getNomCommune() + " - avec " + ville.getPopulation() + " habitants.");
        }
    }
}
