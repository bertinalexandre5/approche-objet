package fr.diginamic.recensement;

public class Region {
    private String nom;
    private int population;

    public Region(String nom) {
        this.nom = nom;
        this.population = 0;
    }

    public void ajouterPopulation(int populationVille) {
        this.population += populationVille;
    }

    public String getNom() {
        return nom;
    }

    public int getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return nom +" - " + population + " habitants.";
    }
}
