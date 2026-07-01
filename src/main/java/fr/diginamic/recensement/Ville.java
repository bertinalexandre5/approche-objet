package fr.diginamic.recensement;

import java.util.Objects;

public class Ville {
    private String codeRegion;
    private String region;
    private String departement;
    private String codeCommune;
    private String nomCommune;
    private int population;

    public Ville(String codeRegion, String region, String departement, String codeCommune, String nomCommune, int population) {
        this.codeRegion = codeRegion;
        this.region = region;
        this.departement = departement;
        this.codeCommune = codeCommune;
        this.nomCommune = nomCommune;
        this.population = population;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Ville ville = (Ville) o;
//        return population == ville.population && Objects.equals(codeRegion, ville.codeRegion) && Objects.equals(region, ville.region) && Objects.equals(departement, ville.departement) && Objects.equals(codeCommune, ville.codeCommune) && Objects.equals(nomCommune, ville.nomCommune);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(codeRegion, region, departement, codeCommune, nomCommune, population);
    }

    @Override
    public String toString() {
        return "Recensement " +
                "codeRegion='" + codeRegion + '\'' +
                ", region='" + region + '\'' +
                ", departement='" + departement + '\'' +
                ", codeCommune='" + codeCommune + '\'' +
                ", nomCommune='" + nomCommune + '\'' +
                ", population=" + population ;
    }

    public String getCodeRegion() {
        return codeRegion;
    }

    public String getRegion() {
        return region;
    }

    public String getDepartement() {
        return departement;
    }

    public String getCodeCommune() {
        return codeCommune;
    }

    public String getNomCommune() {
        return nomCommune;
    }

    public int getPopulation() {
        return population;
    }

}
