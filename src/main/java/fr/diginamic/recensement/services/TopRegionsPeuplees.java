package fr.diginamic.recensement.services;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Region;
import fr.diginamic.recensement.Ville;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TopRegionsPeuplees extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {

        List<Region> regions = new ArrayList<>();

        for (Ville ville : recensement.getVilles()) {
            Region regionTrouve = null;

            for (Region region : regions) {
                if (region.getNom().equals(ville.getRegion())) {
                    regionTrouve = region;
                    break;
                }

            }
            if (regionTrouve != null) {
                regionTrouve.ajouterPopulation(ville.getPopulation());
            } else {
                Region nouvelleRegion = new Region(ville.getRegion());
                nouvelleRegion.ajouterPopulation(ville.getPopulation());
                regions.add(nouvelleRegion);
            }
        }
        regions.sort(Comparator.comparingInt(Region::getPopulation).reversed());

        System.out.println("Les 10 régions les plus peuplées sont : ");

        for (int i = 0; i < 10; i++) {
            Region region = regions.get(i);
            System.out.println((i + 1) + ". " + region.getNom() + " - avec " + region.getPopulation() + " habitants.");
        }


    }
}
