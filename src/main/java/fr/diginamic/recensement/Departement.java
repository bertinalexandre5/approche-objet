package fr.diginamic.recensement;

public class Departement {
    private String nom;
    private int population;

    public Departement(String nom) {
        this.nom = nom;
        this.population = 0;
    }

    public void ajouterPopulation(int populationRegion) {this.population += populationRegion;}

    public String getNom() {
        return nom;
    }

    public int getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return nom + population + " habitants";
    }
}
