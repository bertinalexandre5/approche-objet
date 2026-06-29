package methodeEquals;

import java.util.Objects;

public class Pays {
    String nom;
    int population;

    public Pays(String nom, int population) {
        this.nom = nom;
        this.population = population;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pays pays = (Pays) o;
        return population == pays.population && Objects.equals(nom, pays.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, population);
    }


}
