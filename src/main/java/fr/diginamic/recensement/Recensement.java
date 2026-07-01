package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.List;

public class Recensement {
    private List<Ville> villes = new ArrayList<>();

    public void ajouterVille(Ville ville) {
        villes.add(ville);
    }

    public List<Ville> getVilles() {
        return villes;
    }
}
