package fr.diginamic.fichier;

public class Ville {

    private String nom;
    private String codeDep;
    private String region;
    private int population;

    public Ville(String nom, String codeDep, String region, int population) {
        this.nom = nom;
        this.codeDep = codeDep;
        this.region = region;
        this.population = population;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", codeDep='" + codeDep + '\'' +
                ", region='" + region + '\'' +
                ", population=" + population +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCodeDep() {
        return codeDep;
    }

    public void setCodeDep(String codeDep) {
        this.codeDep = codeDep;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
