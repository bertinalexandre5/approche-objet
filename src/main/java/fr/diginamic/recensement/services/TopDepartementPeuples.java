package fr.diginamic.recensement.services;

import fr.diginamic.recensement.Departement;
import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TopDepartementPeuples extends MenuService{
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        List<Departement> departements = new ArrayList<>();

        for (Ville ville : recensement.getVilles()) {
            Departement departementTrouve = null;

            for (Departement departement : departements) {
                if (departement.getNom().equals(ville.getDepartement())) {
                    departementTrouve = departement;
                    break;
                }

            }
            if (departementTrouve != null) {
                departementTrouve.ajouterPopulation(ville.getPopulation());
            } else {
                Departement nouveauDepartement = new Departement(ville.getDepartement());
                nouveauDepartement.ajouterPopulation(ville.getPopulation());
                departements.add(nouveauDepartement);
            }
            }
            departements.sort(Comparator.comparingInt(Departement::getPopulation).reversed());

            System.out.println("Les 10 départements les plus peuplées sont : ");

            for (int i = 0; i < 10; i++) {
                Departement departement = departements.get(i);
                System.out.println((i + 1) + ". " + departement.getNom() + " - avec " + departement.getPopulation() + " habitants.");
            }


        }
    }

